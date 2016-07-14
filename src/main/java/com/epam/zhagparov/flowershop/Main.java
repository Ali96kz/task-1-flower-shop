package com.epam.zhagparov.flowershop;

import com.epam.zhagparov.flowershop.entity.Bouquet;
import com.epam.zhagparov.flowershop.factory.BouquetFactory;
import com.epam.zhagparov.flowershop.service.BouquetService;
import com.sun.istack.internal.logging.Logger;

import java.io.IOException;

public class Main {
    final static Logger logger = Logger.getLogger(Main.class);

    public static void main(String[] args) throws IOException {
        BouquetService bouquetService = new BouquetService();
        BouquetFactory bouquetFactory = new BouquetFactory();
        Bouquet bouquet = bouquetFactory.getRandomFillBouquet(6, 3);

        logger.info("Order bouqet \n");
        logger.info(bouquet.toString());

        logger.info("Sort By Height \n");
        logger.info(bouquetService.sortByHeight(bouquet).toString() + " \n");

        logger.info("Find flower between 9 and 12 \n");
        logger.info(bouquetService.findFlower(9, 12, bouquet).getName() + "\n");
    }
}
