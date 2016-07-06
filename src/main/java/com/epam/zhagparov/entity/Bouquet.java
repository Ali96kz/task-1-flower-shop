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
            if(flower instanceof AliveFlower ) {
                stringBuilder.append(flower.getName() + " " + flower.getPrice() + " " + flower.getHeight() + " Alive Flower\n");
            }
            else {
                stringBuilder.append(flower.getName() + " " + flower.getPrice() + " " + flower.getHeight() + " Synthetic Flower\n");
            }
        }
        stringBuilder.append("\nName  Size   Price      Colour\n");
        for(Jewellery jewellery : jewelleries){
            if(jewellery instanceof Bow){
                Bow bow  = (Bow) jewellery;
                stringBuilder.append("Bow "+bow.getSize()+" "+bow.getPrice()+" "+bow.getColour());
            }
            else{
                Reticle reticle = (Reticle) jewellery;
                stringBuilder.append("Reticle "+reticle.getPrice()+" "+reticle.getColour()+" "+reticle.getHeught()+" "+reticle.getWidth());
            }
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
