package com.epam.zhagparov.functionality;


import com.epam.zhagparov.entity.Bouquet;
import com.epam.zhagparov.factory.BouqetFactory;

public class Collector {

    public Bouquet collect(int flowersNumber, int jewelleryNumber){
        Bouquet bouquet;

        BouqetFactory bouqetFactory = new BouqetFactory();
        bouquet = bouqetFactory.getRandomFillBouquet(flowersNumber, jewelleryNumber);

        return bouquet;
    }
}
