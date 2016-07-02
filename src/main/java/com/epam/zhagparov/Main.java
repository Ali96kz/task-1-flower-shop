package com.epam.zhagparov;

import com.epam.zhagparov.entity.Flower;

public class Main {
    public static void main(String[] args) {
        Collector collector = new Collector();
        Sorter sorter = new Sorter();
        Finder finder = new Finder();


        Bouquet bouquet =  collector.collect(6);
        bouquet = sorter.sortByHeight(bouquet);
        Flower flower = finder.findFlower(45,16, bouquet);

        System.out.println(bouquet.toFormattedString());
    }
}
