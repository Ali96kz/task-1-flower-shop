package com.epam.zhagparov.entity;

import java.util.Date;

public class AliveFlower extends Flower {
    private int AliveDay;

    public AliveFlower(int aliveDay) {
        AliveDay = aliveDay;
    }

    public int getAliveDay() {
        return AliveDay;
    }

    public void setAliveDay(int aliveDay) {
        AliveDay = aliveDay;
    }
}
