package com.epam.zhagparov.factory;


import com.epam.zhagparov.entity.Flower;
import com.epam.zhagparov.store.FlowerStore;

import java.util.Random;

public class FlowerFactory {
    private Random random;
    public FlowerFactory() {
        random = new Random(System.currentTimeMillis());
    }
    public Flower getRandomFlower(int maxPrice, int minPrice, int minHeight, int maxHeight){
        Flower flower;
        FlowerStore flowerStore = new FlowerStore();
        flowerStore.fillFlowerStore();

        flower = flowerStore.getRandomFlower();
        flower.setHeight(random.nextInt(maxHeight)+minHeight);
        flower.setPrice(random.nextInt(maxPrice)+ minPrice);

        return flower;
    }
}
