package org.example.entity;

public class Residential extends Building {

    private int apartments;

    public Residential(String name, int id, int floors, int apartments) {
        super(name, id, floors);
        this.apartments = apartments;
    }

    @Override
    public String toString() {
        return "Жилой дом [" + super.toString() + ", Квартир: " + apartments + "]";
    }
}
