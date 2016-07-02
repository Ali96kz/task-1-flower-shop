package com.epam.zhagparov.entity;


import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class FlowerStore {
    private Map<Integer, String> values = new HashMap<Integer, String>();
    private Random random;

    public FlowerStore() {
        random = new Random(System.currentTimeMillis());

        values.put(1, "Astrus");
        values.put(2, "White Rose");
        values.put(3, "Narcissuss");
        values.put(4, "Red Rose");

    }
    public String getRandomNameFlower(){
        String name =  values.get(random.nextInt(4)+0);

        return name;
    }
    public Flower getRandomFlower(){
        Flower flower = new Flower();
        flower.setName(getRandomNameFlower());
        flower.setHeight(random.nextInt(20)+1);
        flower.setPrice(random.nextInt(800)+20);

        return flower;
    }


}
