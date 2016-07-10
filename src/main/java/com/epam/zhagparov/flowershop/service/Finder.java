package com.epam.zhagparov.flowershop.service;

import com.epam.zhagparov.flowershop.entity.Bouquet;
import com.epam.zhagparov.flowershop.entity.Flower;
import com.epam.zhagparov.flowershop.entity.PresentFlower;

import java.util.List;


public class Finder {
    public Flower findFlower(int min, int max, Bouquet bouquet) {
        PresentFlower flower = null;
        List<PresentFlower> values = bouquet.getFlowers();
        for (int i = 0; i < values.size(); i++) {
            flower = values.get(i);
            if (flower.getHeight() < max && flower.getHeight() > min) {
                return flower;
            }
        }

       return flower;
    }
}
