package com.epam.zhagparov.flowershop;

import com.epam.zhagparov.flowershop.entity.Bouquet;
import com.epam.zhagparov.flowershop.factory.BouqetFactory;
import com.epam.zhagparov.flowershop.service.Finder;
import com.epam.zhagparov.flowershop.service.Sorter;
import com.sun.istack.internal.logging.Logger;

import java.util.StringTokenizer;
import java.util.logging.Level;

public class Main {
    final static Logger logger = Logger.getLogger(Main.class);

    public static void main(String[] args) {
        Sorter sorter = new Sorter();
        Finder finder = new Finder();

        BouqetFactory bouqetFactory = new BouqetFactory();
        Bouquet bouquet = bouqetFactory.getRandomFillBouquet(6, 3);

        logger.info("Order bouqet \n");
        logger.info(bouquet.toFormattedString());

        logger.info("Sort By Height \n");
        logger.info(sorter.sortByHeight(bouquet).toFormattedString()+" \n");

        logger.info("Find flower between 9 and 12 \n");
        logger.info(finder.findFlower(9,12, bouquet).getName()+"\n");
    }
}
