package com.epam.zhagparov.factory;

import com.epam.zhagparov.entity.Bow;
import com.epam.zhagparov.entity.Jewellery;
import com.epam.zhagparov.entity.Reticle;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class JewelleryFactory {
    private List<Jewellery> values = new ArrayList<Jewellery>();
    private Random random = new Random(System.currentTimeMillis());
    public Jewellery getRandomJewellery(){
        Jewellery jewellery;
        if(random.nextBoolean()){
            jewellery = new Bow("medium");
        }
        else{
            jewellery = new Reticle(random.nextInt(200)+50, random.nextInt(200)+50);
        }
        jewellery.setPrice(random.nextInt(1000)+100);
        jewellery.setColour("Blue");
        return jewellery;
    }

}
