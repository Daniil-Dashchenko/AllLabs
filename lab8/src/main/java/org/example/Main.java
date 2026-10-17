package org.example;

import org.example.entity.Account;
import org.example.entity.CheckingAccount;
import org.example.entity.SavingsAccount;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Account[] bankBase = new Account[5];

        bankBase[0] = new SavingsAccount("BY12ALFA30141111", 5000.0, "Иванов И.И.", 6.5);
        bankBase[1] = new SavingsAccount("BY34ALFA30142222", 12500.0, "Петров П.П.", 7.2);
        bankBase[2] = new SavingsAccount("BY56ALFA30143333", 450.0, "Сидоров С.С.", 4.0);
        bankBase[3] = new CheckingAccount("BY78ALFA30144444", 2100.0, "Козлов К.К.", 1000.0);
        bankBase[4] = new CheckingAccount("BY90ALFA30145555", 50.0, "Новиков Н.Н.", 500.0);

        SavingsAccount savingsAccount = new SavingsAccount("BY12ALFA30141111", 5000.0, "Иванов И.И.", 6.5);
        Account account = new SavingsAccount("BY12ALFA30141111", 5000.0, "Иванов И.И.", 6.5);

        savingsAccount.printNumber();
        account.printNumber();
        savingsAccount.deposit(20);
    }
}
