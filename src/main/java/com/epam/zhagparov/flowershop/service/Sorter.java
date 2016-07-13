package com.epam.zhagparov.flowershop.service;

import com.epam.zhagparov.flowershop.entity.Bouquet;
import com.epam.zhagparov.flowershop.entity.PresentFlower;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sorter {
    public Bouquet sortByHeight(Bouquet bouquet) {
        List<PresentFlower> values = bouquet.getFlowers();

        Comparator<PresentFlower> flowerComparator = new Comparator<PresentFlower>() {
            public int compare(PresentFlower obj1, PresentFlower obj2) {
                if (obj1.getHeight() > obj2.getHeight()) {
                    return 1;
                } else if (obj1.getHeight() < obj2.getHeight()) {
                    return -1;
                } else {
                    return 0;
                }

            }
        };

        Collections.sort(values, flowerComparator);
        bouquet.setFlowers(values);
        return bouquet;
    }


}
