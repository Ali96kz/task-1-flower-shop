package com.epam.zhagparov.flowershop.store;

import com.epam.zhagparov.flowershop.entity.AliveFlower;
import com.epam.zhagparov.flowershop.entity.PresentFlower;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FlowerStore {
    private List<String> values = new ArrayList<String>();
    private Random random = new Random(System.currentTimeMillis());

    public void fillFlowerStore() {
        values.add("Astrus");
        values.add("White Rose");
        values.add("Narcissuss");
        values.add("Red Rose");
        values.add("Lotos");
    }

    public String getRandomNameFlower() {
        String name = values.get(random.nextInt(4) + 0);
        return name;
    }

    public PresentFlower getRandomFlower() {
        PresentFlower presentFlower = new AliveFlower();
        presentFlower.setName(getRandomNameFlower());
        return presentFlower;
    }

}
