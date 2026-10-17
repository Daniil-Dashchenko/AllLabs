package org.example.entity;

public class Building {

    private String name;
    private int id;
    private int floors;

    public Building(String name, int id, int floors) {
        this.name = name;
        this.id = id;
        this.floors = floors;
    }

    public String getName() {return name;}
    public int getId() {return id;}
    public int getFloors() {return floors;}

    @Override
    public String toString() {
        return "ID: " + id + ", Этажей: " + floors;
    }
}
