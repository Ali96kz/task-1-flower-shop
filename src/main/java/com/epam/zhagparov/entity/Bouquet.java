package com.epam.zhagparov.entity;

import com.epam.zhagparov.entity.Jewellery;
import com.epam.zhagparov.entity.Flower;

import java.util.ArrayList;

public class Bouquet {
    private ArrayList<Flower> flowers = new ArrayList<Flower>();
    private ArrayList<Jewellery> jewelleries = new ArrayList<Jewellery>();


    public void addJewelery(Jewellery jewellery){
        jewelleries.add(jewellery);
    }
    public void addFlower(Flower flower){
        flowers.add(flower);
    }

    public String toFormattedString(){
        StringBuilder stringBuilder = new StringBuilder();

        for(Flower flower : flowers){
            stringBuilder.append(flower.getName()+" \n");
        }

        return stringBuilder.toString();
    }


    public ArrayList<Flower> getFlowers() {
        return flowers;
    }

    public void setFlowers(ArrayList<Flower> flowers) {
        this.flowers = flowers;
    }
}
