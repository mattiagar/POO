package org.example.es1;

public class MainSC {
    public static void main(String[] args) {
        ScambiaCaratteri parola = new ScambiaCaratteri("Stringa");
        parola.scambia();


        System.out.println("La nuova parola è: "+parola.getParola());
    }
}
/**Scrivere un programma che data una stringa di almeno 2 caratteri, ne costruisca un’altra dove il primo
 carattere è scambiato con l’ultimo, che viene poi stampata a video.**/

