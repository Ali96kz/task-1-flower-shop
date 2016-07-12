package com.epam.zhagparov.flowershop.factory;

import com.epam.zhagparov.flowershop.entity.Bouquet;
import com.epam.zhagparov.flowershop.entity.Jewellery;
import com.epam.zhagparov.flowershop.entity.PresentFlower;
import com.epam.zhagparov.flowershop.factory.BouquetFactory;
import org.junit.Test;

import java.util.Random;

import static junit.framework.TestCase.assertTrue;
import static junit.framework.TestCase.fail;

public class TestBouqetFactory {
    /** PresentFlower must be min height 30 cm and max height 70 cm
     *
     */
    @Test
    public void testBouqetFactory(){
        BouquetFactory bouquetFactory = new BouquetFactory();
        Random random = new Random(System.currentTimeMillis());
        int flowerNumber =random.nextInt(10)+1;
        int jewelleryNumber = random.nextInt(10)+1;
        Bouquet bouquet = bouquetFactory.getRandomFillBouquet(flowerNumber, jewelleryNumber);

        assertTrue("Incorrect flower size", bouquet.getFlowers().size() == flowerNumber);
        assertTrue("Incorrect jewellery number", bouquet.getJewelleries().size() == jewelleryNumber);

        for (PresentFlower presentFlower : bouquet.getFlowers()) {
            if(presentFlower.getHeight() < 30 || presentFlower.getHeight() > 70)
                fail("One of presentFlower has incorrect height = "+presentFlower.getHeight());
        }
    }
}