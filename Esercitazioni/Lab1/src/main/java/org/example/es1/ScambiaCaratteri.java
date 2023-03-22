package org.example.es1;

public class ScambiaCaratteri {
    public ScambiaCaratteri(String parola){
        this.parola = parola;
        controllo();

    }

    public void controllo(){
        if(parola.length()<2)
            System.out.println("Scegliere una parola più lunga.");
    }

    public void scambia(){
        int n = parola.length();
        String a,b,central;
        a = parola.substring(0,1);
        b = parola.substring(n-1,n);
        central = parola.substring(1,n-1);
        parola = b.concat(central.concat(a));
    }

    public String getParola() {
        return parola;
    }

    private String parola;
}
