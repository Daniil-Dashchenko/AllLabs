package org.example.entity;

public class Office extends Building {

    private int companies;

    public Office(String name,int id, int floors, int companies) {
        super(name, id, floors);
        this.companies = companies;
    }

    @Override
    public String toString() {
        return "Офисный центр [" + super.toString() + ", Компаний: " + companies + "]";
    }
}
