package org.example.entity;

import org.example.repository.Blooming;
import org.example.repository.Growable;

public class Flower implements Growable, Blooming {

    private String name;
    private double height;
    private String color;
    private boolean isBlooming;

    public Flower(String name, double height, String color) {
        this.name = name;
        this.height = height;
        this.color = color;
        this.isBlooming = false;
    }

    @Override
    public void grow() {
        this.height += 0.15;
        System.out.println("Цветок " + name + " вырос. Новая высота: " + height + " метров.");
    }

    @Override
    public double getHeight() {
        return height;
    }

    @Override
    public void bloom() {
        this.isBlooming = true;
        System.out.println("Цветок " + name + " зацвел");
    }

    @Override
    public String getFlowerColor() {
        return isBlooming ? color : "Не цветет";
    }
}
