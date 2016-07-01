package com.epam.zhagparov.entity.flower;


import com.epam.zhagparov.entity.Flower;

public class Asters implements Flower {
    private int height;

    public Asters(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }
}
