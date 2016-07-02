package com.epam.zhagparov;


public class Collector {

    public Bouquet collect(int flowersNumber){
        Bouquet bouquet = null;
        BouqetFactory bouqetFactory = new BouqetFactory();
        bouquet = bouqetFactory.getRandomFillBouquet(flowersNumber);

        return bouquet;
    }
}
