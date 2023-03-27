package org.example.es1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Casino scommessa = new Casino();

        Scanner betto = new Scanner(System.in);
        double bet;
        Scanner dado = new Scanner(System.in);
        int n;
        String risposta;
        boolean done = false;
        Scanner in = new Scanner(System.in);


        do {
            System.out.println("Inserisci il numero del dado:");
            n = dado.nextInt();
            System.out.println("Inserisci l' importo da scommettere:");
            bet = betto.nextDouble();
            scommessa.lancio(n, bet);
            System.out.println("Vuoi effettuare un' altra scommessa?");
            risposta = in.nextLine();
            if (risposta.equals("si") && scommessa.getGiocatore()>0)
                done = false;
            else
                done = true;
        }while (!done);
        //System.out.println("Hello world!");
    }

}
