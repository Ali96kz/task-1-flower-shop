package com.epam.zhagparov.functionality;

import com.epam.zhagparov.entity.Bouquet;
import com.epam.zhagparov.entity.Flower;

import java.util.ArrayList;

public class Sorter{
    public Bouquet sortByHeight(Bouquet bouquet){
        ArrayList <Flower> values = bouquet.getFlowers();
        ArrayList<Flower> sortBouqet = new ArrayList<Flower>();
        Flower flower;
        int max;

        for(int i = 0; i < values.size(); i++){
            flower = values.get(i);
            max = flower.getHeight();

            for(int j = i+1; j < values.size(); j++){
                if(max < values.get(j).getHeight()){
                    flower = values.get(j);
                    values.remove(j);
                }
            }

            sortBouqet.add(i, flower);
        }

        bouquet.setFlowers(sortBouqet);
        return  bouquet;
    }
}
