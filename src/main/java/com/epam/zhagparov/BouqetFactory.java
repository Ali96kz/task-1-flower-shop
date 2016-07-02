package com.epam.zhagparov;

import com.epam.zhagparov.entity.Flower;
import com.epam.zhagparov.entity.FlowerStore;

public class BouqetFactory {
    private FlowerStore flowerStore;

    public BouqetFactory() {
        flowerStore = new FlowerStore();
    }

    public Bouquet getRandomFillBouquet(int flowersNumber){
        Bouquet bouquet = new Bouquet();

        for(int i = 0; i < flowersNumber; i++){
            Flower flower= flowerStore.getRandomFlower();
            bouquet.addFlower(flower);
        }

        return bouquet;
    }
}
