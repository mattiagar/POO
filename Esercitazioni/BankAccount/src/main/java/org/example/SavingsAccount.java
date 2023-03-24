package org.example;

public class SavingsAccount {
    /**Constructs a bank account with a zero balance.**/
    SavingsAccount(){
        balance = 0;
    }

    /**Constructs a bank account with a given balance. @param initialBalance the initial balance.**/
    SavingsAccount(double initialBalance) {
        balance = initialBalance;

    }

    /**Constructs a bank account with a given balance and interestRate.**/
    SavingsAccount(double initialBalance, double interestRate) {
        balance = initialBalance;
        this.interestRate = interestRate;

    }

    /**Deposits money into the bank account. @param amount the amount to deposit.**/
    public void deposit(double amount) {
        double newBalance = balance + amount;
        balance = newBalance;

    }

    /**Withdraws money from the bank account. @param amount the amount to withdraw.**/
    public void withdraw(double amount) {
        double newBalance = balance - amount;
        balance = newBalance;
    }

    /**Add interest quarterly to the account.**/
    public void addInterest(){
        interest = (balance*interestRate*91)/36500;

    }

    /**Gets the current balance of the bank account. @return the current balance.**/
    public double getBalance() {
        return balance;
    }

    /**Gets the current interest of the bank account. @return the current interest.**/
    public double getInterest() {
        return interest;
    }

    /**Gets the current interest rate of the bank account. @return the current interestRate.**/
    public double getInterestRate() {
        return interestRate;
    }



    private double balance,interestRate,interest;
}

