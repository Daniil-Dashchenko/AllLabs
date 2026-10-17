package org.example.entity;

public class CheckingAccount extends Account {
    private double overdraftLimit;

    public CheckingAccount(String number, double balance, String owner, double overdraftLimit) {
        super(number, balance, owner);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void calculateInterest() {
        System.out.println("Проценты по чековому счету не начисляются");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println(" | Тип: Чековый (Лимит овердрафта: " + overdraftLimit + " BYN)");
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Сумма снятия должна быть больше нуля! Передано: " + amount);
        }
        if ((getBalance() + overdraftLimit) < amount) {
            throw new IllegalArgumentException("Недостаточно средств (превышен лимит овердрафта)! Запрошено: " + amount + " BYN, доступно с овердрафтом: " + (getBalance() + overdraftLimit) + " BYN");
        }
        setBalance(getBalance() - amount);
        System.out.println(" Успешное снятие со счета " + getNumber() + " суммы " + amount + " BYN. Текущий баланс: " + getBalance() + " BYN");
    }

    public double getOverdraftLimit() { return overdraftLimit; }
    public void setOverdraftLimit(double overdraftLimit) { this.overdraftLimit = overdraftLimit; }
}
