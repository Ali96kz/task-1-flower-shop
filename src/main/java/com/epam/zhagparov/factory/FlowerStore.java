package com.epam.zhagparov.factory;

import com.epam.zhagparov.entity.AliveFlower;
import com.epam.zhagparov.entity.Flower;
import com.epam.zhagparov.entity.SyntheticFlower;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class FlowerStore {
    private Map<Integer, String> values = new HashMap<Integer, String>();
    Random random = new Random(System.currentTimeMillis());
    public void fillFlowerStore(){
        values.put(1, "Astrus");
        values.put(2, "White Rose");
        values.put(3, "Narcissuss");
        values.put(4, "Red Rose");
        values.put(5, "Lotos");
    }

    public void addFlower(String name){
        values.put(values.size() + 1, name);
    }

    public String getRandomNameFlower(){
        String name =  values.get(random.nextInt(values.size())+1);
        System.out.println(name);
        return name;
    }
    public Flower getRandomFlower(){
        Flower flower;
        if(random.nextInt() % 2 == 0 ) {
            int aliveday = random.nextInt(10) + 1;
            flower = new AliveFlower(aliveday);
        }
        else
            flower = new SyntheticFlower("Plastic");

        flower.setName(getRandomNameFlower());

        return flower;
    }

}
