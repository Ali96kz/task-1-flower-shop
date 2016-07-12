package com.epam.zhagparov.flowershop.service;

import com.epam.zhagparov.flowershop.entity.Bouquet;
import com.epam.zhagparov.flowershop.entity.PresentFlower;
import com.epam.zhagparov.flowershop.factory.BouquetFactory;
import org.junit.Test;
import java.util.List;
import static junit.framework.TestCase.assertTrue;

public class TestSorter {
    @Test
    public void testSortByHeight(){
        Sorter sorter = new Sorter();
        BouquetFactory bouquetFactory = new BouquetFactory();
        Bouquet bouquet = bouquetFactory.getRandomFillBouquet(6, 3);
        bouquet = sorter.sortByHeight(bouquet);
        List <PresentFlower> items = bouquet.getFlowers();

        for (int i = 0; i < items.size()-1; i++) {
           assertTrue("uncorrect sorting", items.get(i).getHeight() < items.get(i+1).getHeight() );
        }
    }


}
