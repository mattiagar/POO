package org.example.es3;

import java.util.Scanner;

public class InputChecker {
    InputChecker(){

    }

    public void controllo(){
        System.out.println("Inserire parola: ");
        parola = scan.nextLine();
        System.out.println(parola);
        System.out.println(s);
        if(parola == s || parola == si || parola == ok || parola == certo || parola == perche || parola == n || parola == no){
            if(parola == "S" || parola == si || parola == ok || parola == certo || parola == perche){
                System.out.println("OK");
            }
            else{
                System.out.println("FINE");
            }
        }

        else{
             System.out.println("Dato non corretto");
        }

    }

    private String parola, s = "S", si = "SI", ok = "OK", certo = "certo", perche = "perchè no?", n = "N", no = "NO";
    private Scanner scan = new Scanner(System.in);
}
