package org.example.entity;

public class Flat {
    private String address;
    public int rooms;
    public double price;

    public Flat(String address, int rooms, double price) {
        this.address = address;
        this.price= price;
        this.rooms = rooms;
    }

    public String getAddress() {return address;}
    public void setAddress(String address) {this.address = address;}

    public int getRooms() {return rooms;}
    public void setRooms(int rooms) {this.rooms = rooms;}

    public double getPrice() {return price;}
    public void setPrice(double price) {this.price = price;}

    @Override
    public String toString() {
        return "Квартира{" +
                "адрес='" + address + '\'' +
                ", комнат=" + rooms +
                ", цена=" + price +
                '}';
    }

}
