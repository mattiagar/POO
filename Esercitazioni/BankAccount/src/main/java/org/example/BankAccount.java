package org.example;

/**A bank account has a balance that can be changed by deposits and withdrawals.*/
public class BankAccount {
    //Costruttori

        /**Constructs a bank account with a zero balance.**/
        public BankAccount() {
            balance = 0;
         }

        /**Constructs a bank account with a given balance. @param initialBalance the initial balance.**/
        public BankAccount(double initialBalance) {
            balance = initialBalance;
        }

         /**Constructs a bank account with a zero balance
        @param anAccountNumber the account number for this account*/
        public BankAccount(int anAccountNumber) {
        accountNumber = anAccountNumber;
        balance = 0;
        }

        public BankAccount(int anAccountNumber, double initialBalance){
            accountNumber = anAccountNumber;
            balance = initialBalance;
        }


        //Metodi

        /**Withdraws money from the bank account. @param amount the amount to withdraw.**/
        public void withdraw(double amount) {
            double newBalance = balance - amount;
            balance = newBalance;
        }

         /**Deposits money into the bank account. @param amount the amount to deposit.**/
        public void deposit(double amount) {
        double newBalance = balance + amount;
        balance = newBalance;
        }

        /**Gets the current balance of the bank account. @return the current balance.**/
        public double getBalance() {
            return balance;
        }

        /**Gets the account number of this bank account.
         @return the account number**/
        public int getAccountNumber() {
        return accountNumber;
        }




        private double balance;
        private int accountNumber;
}