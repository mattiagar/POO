package org.example;

public class BankMain {
    public static void main(String[] args)
    {
        Bank conti = new Bank();

        conti.addAccount(3000,38);
        conti.addAccount(3000,23);

        conti.deposit(38,1000);
        conti.withdraw(23,1000);

        conti.trasfer(38,23,50);

        System.out.println("Sadi conti: \n "+conti.getBalance(38)+" \n "+conti.getBalance(23));

    }
}
