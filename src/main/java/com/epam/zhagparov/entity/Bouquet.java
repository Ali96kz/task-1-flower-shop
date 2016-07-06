package com.epam.zhagparov.entity;

import java.util.ArrayList;
import java.util.List;

public class Bouquet {
    private List<Flower> flowers = new ArrayList<Flower>();
    private List<Jewellery> jewelleries = new ArrayList<Jewellery>();


    public void addJewelery(Jewellery jewellery){
        jewelleries.add(jewellery);
    }
    public void addFlower(Flower flower){
        flowers.add(flower);
    }

    public String toFormattedString(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\nName      Price   Height\n");
        for(Flower flower : flowers){
            stringBuilder.append(flower.getName()+" "+flower.getPrice()+" "+flower.getHeight()+"\n");

        }

        return stringBuilder.toString();
    }


    public List<Flower> getFlowers() {
        return flowers;
    }

    public void setFlowers(List<Flower> flowers) {
        this.flowers = flowers;
    }
}
