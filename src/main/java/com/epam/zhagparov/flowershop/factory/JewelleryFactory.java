package com.epam.zhagparov.flowershop.factory;

import com.epam.zhagparov.flowershop.entity.Bow;
import com.epam.zhagparov.flowershop.entity.Jewellery;
import com.epam.zhagparov.flowershop.entity.Reticle;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class JewelleryFactory {
    private List<Jewellery> values = new ArrayList<Jewellery>();
    private Random random = new Random(System.currentTimeMillis());

    public Jewellery getRandomJewellery() {
        Jewellery jewellery;
        if (random.nextBoolean()) {
            jewellery = new Bow("medium");
        } else {
            jewellery = new Reticle();
        }
        jewellery.setPrice(random.nextInt(1000) + 100);
        jewellery.setColour("Blue");
        return jewellery;
    }

}
