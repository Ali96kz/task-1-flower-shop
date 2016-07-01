package com.epam.zhagparov.entity.flower;


import com.epam.zhagparov.entity.Flower;

public class Narcissus implements Flower {
    private int height;
    private int price;
    public Narcissus(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public int getPrice() {
        return price;
    }
}
