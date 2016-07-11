package com.epam.zhagparov.flowershop.service;

import com.epam.zhagparov.flowershop.entity.Bouquet;
import com.epam.zhagparov.flowershop.entity.Flower;
import com.epam.zhagparov.flowershop.entity.PresentFlower;

import java.util.*;

public class Sorter {
    public Bouquet sortByHeight(Bouquet bouquet){
        List<PresentFlower> values = bouquet.getFlowers();

        Comparator<PresentFlower> flowerComparator = new Comparator<PresentFlower>() {
            public int compare(PresentFlower o1, PresentFlower o2) {
                return o2.getHeight()-o1.getHeight();
            }
        };
        Collections.sort(values, flowerComparator);
        return  bouquet;
    }

}
