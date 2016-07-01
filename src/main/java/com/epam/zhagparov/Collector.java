package com.epam.zhagparov;


import com.epam.zhagparov.entity.Flower;


import java.util.ArrayList;

public class Collector {
    public Flower comparator(ArrayList<Flower> flowers){
        Flower flower = null;
        int max = -1;
        for (int i = 0; i < flowers.size(); i++) {
            flower = flowers.get(i);
            if(flower.getHeight() > max){
                max = flower.getHeight();
            }
        }

        return flower;
    }
}
