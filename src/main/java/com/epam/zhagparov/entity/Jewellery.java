package com.epam.zhagparov.entity;

public abstract class Jewellery {
    private int price;
    private String colour;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}
