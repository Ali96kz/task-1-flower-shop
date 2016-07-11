package com.epam.zhagparov.flowershop.factory;

import com.epam.zhagparov.flowershop.entity.Bouquet;
import com.epam.zhagparov.flowershop.entity.Jewellery;
import com.epam.zhagparov.flowershop.entity.PresentFlower;

public class BouqetFactory {
    private PresentFlowerFactory presentFlowerFactory = new PresentFlowerFactory();
    private JewelleryFactory jewelleryFactory= new JewelleryFactory();

    public Bouquet getRandomFillBouquet(int flowersNumber, int jewelleryNumber){
        Bouquet bouquet = new Bouquet();

        for(int i = 0; i < flowersNumber; i++){
            PresentFlower flower =  presentFlowerFactory.getRandomFlower(600, 300, 10, 15);
            bouquet.addFlower(flower);
        }
        for(int i = 0; i < jewelleryNumber; i++){
            Jewellery jewellery = jewelleryFactory.getRandomJewellery();
            bouquet.addJewelery(jewellery);
        }
        return bouquet;
    }
}