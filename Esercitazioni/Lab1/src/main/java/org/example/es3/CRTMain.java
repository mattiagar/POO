package org.example.es3;

import java.util.Scanner;

public class CRTMain {
    public static void main(String[] args) {
        String parolaRT,a;
        //crea un oggetto scanner che abbia lo standard input come fonte di dati
        Scanner scan = new Scanner(System.in);
        System.out.println("Inserire una parola: ");
        parolaRT = scan.nextLine();

        CentraleRunTime parola = new CentraleRunTime(parolaRT);
        a = parola.srcCentrale();

        System.out.println("Il carattere centrale è: " + a);
    }
}
/**Scrivere un programma che data una stringa inserita a linea di comando restituisce il carattere centrale.**/

