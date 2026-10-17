package org.example.entity;

import org.example.repository.Blooming;
import org.example.repository.Growable;

public class Tree implements Growable, Blooming {

    private String name;
    private double height;
    private double crownDiameter;
    private boolean isBlooming;

    public Tree(String name, double height, double crownDiameter) {
        this.name = name;
        this.height = height;
        this.crownDiameter = crownDiameter;
        this.isBlooming = false;
    }

    @Override
    public void grow() {
        this.height += 1.5;
        this.crownDiameter += 0.5;
        System.out.println("Дерево " + name + " выросло. Новая высота = " + height + " метров, диаметр кроны: " + crownDiameter + " метров.");
    }

    @Override
    public double getHeight() {
        return height;
    }

    @Override
    public void bloom() {
        System.out.println("Дерево " + name + " зацвело.");
    }

    @Override
    public String getFlowerColor() {
        return isBlooming ? "Белый" : "Еще не цветет";
    }
}
