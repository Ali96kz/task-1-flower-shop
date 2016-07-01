package com.epam.zhagparov.entity.flower;

import com.epam.zhagparov.entity.Flower;

public class Rose implements Flower {
    private int height;

    Rose(int height){
        this.height = height;
    }

    public int getHeight() {
        return height;
    }
}
