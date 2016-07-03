package com.epam.zhagparov.functionality;

import com.epam.zhagparov.entity.Bouquet;
import com.sun.istack.internal.logging.Logger;

public class Main {
    public static void main(String[] args) {
        final  Logger logger = Logger.getLogger(Main.class);
        Collector collector = new Collector();
        Sorter sorter = new Sorter();
        Finder finder = new Finder();
        Bouquet bouquet =  collector.collect(6);

        logger.info(bouquet.toFormattedString()+" \n");
        logger.info(sorter.sortByHeight(bouquet).toFormattedString()+" \n");

    }
}
