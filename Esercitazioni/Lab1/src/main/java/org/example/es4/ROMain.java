package org.example.es4;

public class ROMain {
    public static void main(String[] args) {
        int n;
        RicercaOccorrenze parola = new RicercaOccorrenze("Stringa");

        parola.controllo();
        n = (parola.getPosizione()+1);
        if (n == 0)
            n = -1;
        System.out.println("La posizione è: " +n); //Il più 1 serve perchè se no si indicherebbe il numero di posizione all'interno della stringa;
    }
}
/**Scrivere un programma che data una stringa s controlla se il primo carattere di s è ripetuto nella stringa stampando la posizione in cui è ripetuto o -1.**/
