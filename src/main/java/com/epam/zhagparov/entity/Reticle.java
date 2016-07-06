package com.epam.zhagparov.entity;

public class Reticle extends Jewellery {
    private int heught;
    private int width;

    public Reticle(int heught, int width) {
        this.heught = heught;
        this.width = width;
    }

    public int getHeught() {
        return heught;
    }

    public void setHeught(int heught) {
        this.heught = heught;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}
