package org.example.entity;

public class Ticket {
    private String event;
    public int seatNumber;
    public double price;

    public Ticket(String event, int seatNumber, double price) {
        this.event = event;
        this.seatNumber = seatNumber;
        this.price = price;
    }

    public String getEvent() {return event;}
    public void setEvent(String event) {this.event = event;}

    public int getSeatNumber() {return seatNumber;}
    public void setSeatNumber(int seatNumber) {this.seatNumber = seatNumber;}

    public double getPrice() {return price;}
    public void setPrice(double price) {this.price = price;}

    public void applyDiscount() {
        this.price = this.price * 0.9;
        System.out.println("Применена скидка 10%");
    }

    @Override
    public String toString() {
        return "Билет{" +
                "мероприятие='" + event + '\'' +
                ", место=" + seatNumber +
                ", цена=" + price +
                '}';
    }
}
