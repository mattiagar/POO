package org.example.es4;

public class RicercaOccorrenze {
    RicercaOccorrenze(String parola){
        this.parola = parola;

    }

    public void controllo(){
        a = parola.charAt(0);
        posizione = parola.indexOf(a,1);

    }

    public int getPosizione() {
        return posizione;
    }

    private String parola;
    private char a;
    private int posizione;
}
