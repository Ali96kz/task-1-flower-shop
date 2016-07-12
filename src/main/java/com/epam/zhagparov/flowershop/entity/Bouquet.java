package com.epam.zhagparov.flowershop.entity;

import java.util.ArrayList;
import java.util.List;

public class Bouquet {
    private List<PresentFlower> flowers = new ArrayList<PresentFlower>();
    private List<Jewellery> jewelleries = new ArrayList<Jewellery>();

    public Bouquet() {
    }

    public void addJewelery(Jewellery jewellery){
        jewelleries.add(jewellery);
    }
    public void addFlower(PresentFlower presentFlower){
        flowers.add(presentFlower);
    }
    @Override
    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();
        for(PresentFlower flower : flowers){
                stringBuilder.append(flower.getName() + " " + flower.getPrice()+" "+flower.getHeight()+"\n");
        }
        for(Jewellery jewellery : jewelleries){
                stringBuilder.append(jewellery.getPrice()+" "+jewellery.getColour()+"\n");
            }
        return stringBuilder.toString();
    }


    public List<PresentFlower> getFlowers() {
        return flowers;
    }

    public void setFlowers(List<PresentFlower> flowers) {
        this.flowers = flowers;
    }

    public List<Jewellery> getJewelleries() {
        return jewelleries;
    }

    public void setJewelleries(List<Jewellery> jewelleries) {
        this.jewelleries = jewelleries;
    }
}
