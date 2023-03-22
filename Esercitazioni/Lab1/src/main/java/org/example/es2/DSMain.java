package org.example.es2;


public class DSMain {
    public static void main(String[] args) {
        DivideStringa parola = new DivideStringa("Stringa");
        parola.scambia();


        System.out.println("La nuova parola è: " + parola.getParola());
    }
}
/**Scrivere un programma che data una stringa di almeno 2 caratteri,
 divida la stringa in due parti della stessa dimensione e poi le inverta.**/