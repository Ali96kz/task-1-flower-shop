package com.epam.zhagparov.entity;

public class Bow extends Jewellery {

    //medium, low, big and another
    private String size;

    public Bow(String size) {
        this.size = size;
    }


    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
