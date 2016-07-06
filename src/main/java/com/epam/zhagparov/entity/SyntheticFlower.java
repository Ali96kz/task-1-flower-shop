package com.epam.zhagparov.entity;

public class SyntheticFlower extends Flower {
    private String material;

    public SyntheticFlower(String material) {
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}
