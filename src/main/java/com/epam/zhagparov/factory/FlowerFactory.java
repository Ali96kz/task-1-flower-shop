package com.epam.zhagparov.factory;


import com.epam.zhagparov.entity.AliveFlower;
import com.epam.zhagparov.entity.Flower;
import com.epam.zhagparov.entity.SyntheticFlower;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class FlowerFactory {
    private Map<Integer, String> values = new HashMap<Integer, String>();
    private Random random;
    private int flowerNumber  = 5;
    public FlowerFactory() {
        random = new Random(System.currentTimeMillis());

        values.put(1, "Astrus");
        values.put(2, "White Rose");
        values.put(3, "Narcissuss");
        values.put(4, "Red Rose");
        values.put(5, "Lotos");
    }
    public String getRandomNameFlower(){
        String name =  values.get(random.nextInt(flowerNumber)+1);

        return name;
    }

    public void addFlower(String name){
        values.put(values.size() + 1, name);
    }

    public Flower getRandomFlower(int maxPrice, int minPrice, int minHeight, int maxHeight){
        Flower flower =null;

        if(random.nextInt() % 2 == 0 ) {
            flower = new AliveFlower();
        }
        else
            flower = new SyntheticFlower();

        flower.setName(getRandomNameFlower());
        flower.setHeight(random.nextInt(maxHeight)+minHeight);
        flower.setPrice(random.nextInt(maxPrice)+ minPrice);

        return flower;
    }
}
