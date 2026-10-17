package org.example;

import org.example.entity.Flower;
import org.example.entity.Tree;
import org.example.repository.Blooming;
import org.example.repository.Growable;

public class Main {

    public static void main(String[] args) {

        Growable.printGrowthInfo();
        System.out.println();

        Growable[] garden = new Growable[5];

        garden[0] = new Tree("Дуб", 5.0, 3.0);
        garden[1] = new Tree("Яблоня", 2.5, 1.5);
        garden[2] = new Tree("Вишня", 3.0, 2.0);
        garden[3] = new Flower("Роза", 0.4, "Красный");
        garden[4] = new Flower("Тюльпан", 0.2, "Желтый");

        for (Growable plant : garden) {
            plant.grow();
        }

        for (Growable plant : garden) {
            if (plant instanceof Blooming) {
                Blooming bloomingPlant = (Blooming) plant;
                bloomingPlant.bloom();
                System.out.println("Цвет окраса: " + bloomingPlant.getFlowerColor());
            }
        }
    }
}
