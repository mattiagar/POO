package org.example.es2;

public class DivideStringa {

    public DivideStringa(String parola){
        this.parola = parola;
        controllo();

    }

    public void controllo(){
        if(parola.length()<2)
            System.out.println("Scegliere una parola più lunga.");
    }

    public void scambia(){
        int done,resto = parola.length()%2,n;
        String a,b,central;
        n = parola.length()/2;
        if(resto==0)
            done = 0;
        else
            done = 1;
        if (done ==1){
            a = parola.substring(0,n);
            b = parola.substring(n+1,n*2+1);
            central = parola.substring(n,n+1);
            parola = b.concat(central.concat(a));

        }
        else{
            a = parola.substring(0,n);
            b = parola.substring(n+1,n*2);
            parola = b.concat(a);
        }
    }

    public String getParola() {
        return parola;
    }

    private String parola;
}
