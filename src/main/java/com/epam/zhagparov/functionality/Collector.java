package com.epam.zhagparov.functionality;


import com.epam.zhagparov.entity.Bouquet;
import com.epam.zhagparov.factory.BouqetFactory;

public class Collector {

    public Bouquet collect(int flowersNumber){
        Bouquet bouquet = null;

        BouqetFactory bouqetFactory = new BouqetFactory();
        bouquet = bouqetFactory.getRandomFillBouquet(flowersNumber);

        return bouquet;
    }
}
