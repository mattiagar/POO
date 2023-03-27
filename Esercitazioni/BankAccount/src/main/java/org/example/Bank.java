package org.example;

import java.util.ArrayList;

public class Bank {
    Bank(){

    }

    void addAccount (double initialBalance,int accountNumber) {
        conto = new BankAccount(accountNumber, initialBalance);
        conti.add(conto);
    }

    public void deposit(int accountNumber, double amount){

      for (int i = 0; i<conti.size(); i++){
          if(accountNumber == conti.get(i).getAccountNumber()){
              conti.get(i).deposit(amount);
              break;
          }
      }
    }

    public void withdraw(int accountNumber, double amount){

        for (int i = 0; i<conti.size(); i++){
            if(accountNumber == conti.get(i).getAccountNumber()){
                conti.get(i).withdraw(amount);
                break;
            }
        }
    }

    public void trasfer(int fromAN, int toAN, double amount){
        int a = -1 , b = -1;
        for (int i = 0; i<conti.size(); i++){
                if(fromAN == conti.get(i).getAccountNumber()){
                    a = i;
                    break;
                }
        }
        for (int i = 0; i<conti.size(); i++){
            if(toAN == conti.get(i).getAccountNumber()){
                b = i;
                break;
            }
        }
        conti.get(a).withdraw(amount);
        conti.get(b).deposit(amount);
    }

    public double getBalance(int accountNumber){
        int a = -1;
        for (int i = 0; i<conti.size(); i++){
            if(accountNumber == conti.get(i).getAccountNumber()){
                a = i;
                break;
            }
        }
        return conti.get(a).getBalance();
    }


    ArrayList<BankAccount> conti = new ArrayList<BankAccount>();
    private  BankAccount conto;

}
