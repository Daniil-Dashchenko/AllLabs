package org.example.entity;

public class Hospital extends Building {

    private int departments;

    public Hospital(String name, int id, int floor, int departments) {
        super(name, id, floor);
        this.departments = departments;
    }

    @Override
    public String toString() {
        return "Больница [" + super.toString() + ", Отделений: " + departments + "]";
    }
}
