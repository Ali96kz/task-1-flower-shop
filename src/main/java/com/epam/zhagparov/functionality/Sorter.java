package com.epam.zhagparov.functionality;

import com.epam.zhagparov.entity.Bouquet;
import com.epam.zhagparov.entity.Flower;

import java.util.*;

public class Sorter {
    public Bouquet sortByHeight(Bouquet bouquet){
        List<Flower> values = bouquet.getFlowers();
        Comparator<Flower> flowerComparator = new Comparator<Flower>() {
            public int compare(Flower o1, Flower o2) {
                return o2.getHeight()-o1.getHeight();
            }
        };
        Collections.sort(values, flowerComparator);
        return  bouquet;
    }

}
