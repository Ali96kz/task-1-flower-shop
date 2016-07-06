package com.epam.zhagparov.factory;

import com.epam.zhagparov.entity.Bouquet;
import com.epam.zhagparov.entity.Flower;
import com.epam.zhagparov.entity.Jewellery;

public class BouqetFactory {
    private FlowerFactory flowerFactory;
    private JewelleryFactory jewelleryFactory;
    public BouqetFactory() {
        flowerFactory = new FlowerFactory();
        jewelleryFactory = new JewelleryFactory();
    }

    public Bouquet getRandomFillBouquet(int flowersNumber, int jewelleryNumber){
        Bouquet bouquet = new Bouquet();

        for(int i = 0; i < flowersNumber; i++){
            Flower flower = flowerFactory.getRandomFlower(600, 300, 10, 15);
            bouquet.addFlower(flower);
        }
        for(int i = 0; i < jewelleryNumber; i++){
            Jewellery jewellery = jewelleryFactory.getRandomJewellery();
            bouquet.addJewelery(jewellery);
        }
        return bouquet;
    }
}
