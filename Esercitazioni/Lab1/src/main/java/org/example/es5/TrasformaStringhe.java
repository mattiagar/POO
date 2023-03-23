package org.example.es5;

public class TrasformaStringhe {
    TrasformaStringhe (String parola){
        this.parola = parola;

    }

    public void trasforma(){
        c1 = parola.substring(0,1);
        central = parola.substring(1);
        c1 = c1.toUpperCase();
        parolaTrasformata = c1.concat(central);
        System.out.println("La nuova parola è: " +parolaTrasformata);

    }

    private String parola,c1,central,parolaTrasformata;
}
