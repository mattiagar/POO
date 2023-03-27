package org.example.es1;

import java.util.Random;

public class Casino {

    Casino(){
        giocatore = 1000;
        casino = 100000;
    }

    public void lancio(int n, double bet){
        int a = generatore();
        if (giocatore >= bet) {
            if (a == n) {
                System.out.println("Hai vinto!");
                giocatore += bet * 5;
                casino -= bet * 5;
                System.out.println("Saldo: "+getGiocatore()+";/n Saldo Casino: "+getCasino());
            } else {
                System.out.println("Hai perso!");
                giocatore -= bet;
                casino += bet;
                System.out.println("Saldo: "+getGiocatore()+";/n Saldo Casino: "+getCasino());
            }
        }
        else
            System.out.println("Saldo troppo basso.");
    }

    public double getGiocatore() {
        return giocatore;
    }

    public double getCasino() {
        return casino;
    }

    private int generatore(){
        generatore = new Random();
        int n = generatore.nextInt(6);
        return n;
    }

    private double giocatore, casino;
    private Random generatore;
}
