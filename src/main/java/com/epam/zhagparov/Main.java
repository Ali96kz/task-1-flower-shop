package com.epam.zhagparov;

import com.epam.zhagparov.entity.Flower;

public class Main {
    public static void main(String[] args) {
        Collector collector = new Collector();
        Sorter sorter = new Sorter();
        Finder finder = new Finder();


        Bouquet bouquet =  collector.collect();
        bouquet = sorter.sortByDate(bouquet);
        Flower flower = finder.findFlower(45,16);

    }
}
