package org.example;

import org.example.entity.Ticket;

public class Main {
    public static void main(String[] args) {
        Ticket ticket = new Ticket("Мероприятие", 15, 120.5);
        System.out.println("До скидки: " + ticket);

        ticket.applyDiscount();

        System.out.println("После скидки: " + ticket);
    }
}
