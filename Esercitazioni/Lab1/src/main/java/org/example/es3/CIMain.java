package org.example.es3;

import java.util.Scanner;

public class CIMain {
    public static void main(String[] args) {
        String parolaRT;
        char c1 = 0,c2 = 0,c3 = 0;
        //crea un oggetto scanner che abbia lo standard input come fonte di dati
        Scanner scan = new Scanner(System.in);
        for(int i = 0;i<3;i++){
            System.out.println("Inserire una parola: ");
            parolaRT = scan.nextLine();
            switch (i){
                case 0:
                    c1 = parolaRT.charAt(0);
                case 1:
                    c2 = parolaRT.charAt(0);
                case 2:
                    c3 = parolaRT.charAt(0);
            }


        }
        System.out.println("La concatenazzione è: " + c1+c2+c3);



    }
}
/**Scrivere un programma che date tre stringhe inserite a linea di
     comando visualizza la concatenazione delle loro iniziali. **/

