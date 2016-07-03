package com.epam.zhagparov.functionality;

import com.epam.zhagparov.entity.Bouquet;
import com.epam.zhagparov.entity.Flower;

import java.util.ArrayList;


public class Finder {
    public Flower findFlower(int min, int max, Bouquet bouquet) {
        Flower flower = null;
        ArrayList<Flower> values = bouquet.getFlowers();
        //TODO Write Exception
        for (int i = 0; i < values.size(); i++) {
            flower = values.get(i);
            if (flower.getHeight() < max && flower.getHeight() > min) {

                return flower;
            }
        }

       return flower;
    }
}
