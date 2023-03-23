package org.example.contapersone;

public class Main {
    public static void main(String[] args) {
        ContaPersone pulsante = new ContaPersone();

        pulsante.pulsantePremuto();
        pulsante.pulsantePremuto();
        pulsante.pulsantePremuto();
        pulsante.pulsantePremuto();
        pulsante.pulsantePremuto();
        pulsante.pulsantePremuto();
        pulsante.pulsantePremuto();
        pulsante.pulsantePremuto();
        pulsante.pulsantePremuto();
        pulsante.pulsantePremuto();

        System.out.println("Il conteggio è di: "+pulsante.getI());
    }
}
/**Supponiamo di voler realizzare un contapersone.
 Ogni volta che un operatore preme un pulsante il valore del conteggio viene incrementato.**/
