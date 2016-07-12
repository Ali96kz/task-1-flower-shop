package com.epam.zhagparov.flowershop.service;

import com.epam.zhagparov.flowershop.entity.Bouquet;
import com.epam.zhagparov.flowershop.entity.PresentFlower;
import com.epam.zhagparov.flowershop.factory.BouquetFactory;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;

public class TestFinder {
    @Test
    public void testFind(){
        Finder finder = new Finder();
        BouquetFactory bouquetFactory = new BouquetFactory();
        Bouquet bouquet = bouquetFactory.getRandomFillBouquet(8, 5);
        PresentFlower presentFlower =  finder.findFlower(8,12, bouquet);
        assertTrue("Find another flower", presentFlower.getHeight() > 8 && presentFlower.getHeight()<12);
    }
}
