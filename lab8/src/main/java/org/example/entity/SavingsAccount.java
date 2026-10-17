package org.example.entity;

public class SavingsAccount extends Account {
    private double rate;

    public SavingsAccount(String number, double balance, String owner, double rate) {
        super(number, balance, owner);
        this.rate = rate;
    }

    @Override
    public void calculateInterest() {
        double interest = getBalance() * rate / 100;
        System.out.printf("Начислено процентов (%.2f%%): +%.2f BYN\n", rate, interest);
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println(" | Тип: Сберегательный (Ставка: " + rate + "%)");
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Сумма пополнения должна быть больше нуля! Передано: " + amount);
        }
        setBalance(getBalance() + amount);
        System.out.println(" Успешное пополнение счета " + getNumber() + " на " + amount + " BYN. Новый баланс: " + getBalance() + " BYN");
    }

    public double getRate() { return rate; }
    public void setRate(double rate) { this.rate = rate; }
}
