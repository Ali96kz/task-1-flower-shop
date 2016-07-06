package com.epam.zhagparov.factory;

import com.epam.zhagparov.entity.Bouquet;
import com.epam.zhagparov.entity.Flower;

public class BouqetFactory {
    private FlowerFactory flowerFactory;

    public BouqetFactory() {
        flowerFactory = new FlowerFactory();
    }

    public Bouquet getRandomFillBouquet(int flowersNumber){
        Bouquet bouquet = new Bouquet();

        for(int i = 0; i < flowersNumber; i++){
            Flower flower = flowerFactory.getRandomFlower(600, 300, 10, 15);
            bouquet.addFlower(flower);
        }

        return bouquet;
    }
}
