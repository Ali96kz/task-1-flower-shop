package com.epam.zhagparov.flowershop.factory;



import com.epam.zhagparov.flowershop.entity.PresentFlower;
import com.epam.zhagparov.flowershop.store.FlowerStore;

import java.util.Random;


public class PresentFlowerFactory {
    private Random random = new Random(System.currentTimeMillis());
    private FlowerStore flowerStore = new FlowerStore();

    public PresentFlowerFactory() {
        flowerStore.fillFlowerStore();
    }

    public PresentFlower getRandomFlower(int maxPrice, int minPrice, int minHeight, int maxHeight){
        PresentFlower presentFlower;

        presentFlower = flowerStore.getRandomFlower();
        presentFlower.setHeight(random.nextInt(maxHeight)+minHeight);
        presentFlower.setPrice(random.nextInt(maxPrice)+ minPrice);

        return presentFlower;
    }
}
