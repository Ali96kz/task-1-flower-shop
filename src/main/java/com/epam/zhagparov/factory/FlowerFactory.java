package com.epam.zhagparov.factory;


import com.epam.zhagparov.entity.Flower;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class FlowerFactory {
    private ArrayList<String> values = new ArrayList<String>();
    private Random random;
    private int flowerNumber  = 5;
    public FlowerFactory() {
        random = new Random(System.currentTimeMillis());

        values.add("Astrus");
        values.add( "White Rose");
        values.add("Narcissuss");
        values.add( "Red Rose");
        values.add( "Lotos");
    }
    public String getRandomNameFlower(){
        String name =  values.get(random.nextInt(flowerNumber)+1);

        return name;
    }

    public void addFlower(String name){
        values.add(name);
    }

    public Flower getRandomFlower(int maxPrice, int minPrice, int minHeight, int maxHeight){
        Flower flower = new Flower();

        flower.setName(getRandomNameFlower());
        flower.setHeight(random.nextInt(maxHeight)+minHeight);
        flower.setPrice(random.nextInt(maxPrice)+ minPrice);

        return flower;
    }
}
