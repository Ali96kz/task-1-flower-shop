package com.epam.zhagparov.flowershop.factory;

import com.epam.zhagparov.flowershop.entity.Bouquet;
import com.epam.zhagparov.flowershop.entity.Jewellery;
import com.epam.zhagparov.flowershop.entity.PresentFlower;

public class BouquetFactory {
    private PresentFlowerFactory presentFlowerFactory = new PresentFlowerFactory();
    private JewelleryFactory jewelleryFactory = new JewelleryFactory();

    public Bouquet getRandomFillBouquet(int flowersNumber, int jewelleryNumber) {
        Bouquet bouquet = new Bouquet();

        for (int i = 0; i < flowersNumber; i++) {
            PresentFlower flower = presentFlowerFactory.getRandomFlower(600, 300, 31, 70);
            bouquet.addFlower(flower);
        }
        for (int i = 0; i < jewelleryNumber; i++) {
            Jewellery jewellery = jewelleryFactory.getRandomJewellery();
            bouquet.addJewelery(jewellery);
        }
        return bouquet;
    }
}
