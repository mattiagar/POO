package org.example;

import java.util.ArrayList;

public class Libro {
    Libro(){
        titolo = "Sconosciuto";
        autore = "Sconosciuto";
        pagine = 0;
        id = 0;
        capitolii = null;
    }

    Libro(String titolo,int pagine,String capitoli){
        this.titolo = titolo;
        this.pagine = pagine;
        capitolii = capitoli;
        autore = "Sconosciuto";
        id++;

    }

    Libro(String titolo, String autore,int pagine, String capitoli){
        this.titolo = titolo;
        this.autore = autore;
        this.pagine = pagine;
        this.capitolii = capitoli;
        id++;

    }

    public boolean equals(Libro l){
        if(l.getAutore().equals(getAutore()) && l.getTitolo().equals(getTitolo()) && l.getPagine() == getPagine() && l.getCapitolii().equals(getCapitolii()))
            done = true;

        return done;
    }

    public String toString(){


        return "Titolo: "+getTitolo()+", Autore: "+getAutore()+", Pagine: "+getPagine()+", Capitoli: "+getCapitolii();
    }

    public void getInitial(){
        int f = 0;
        String autore = getAutore(),iniziali = autore.substring(0,1),c ="";
        boolean done = false;
        if(autore.equalsIgnoreCase("Sconosciuto" )|| autore.equals(null))
            System.out.println("Campo autore non compilato correttamente.");
        else{
            System.out.print("Le iniziali sono: "+iniziali);
            do{
                int s = 0;
                s = autore.indexOf(' ',f);
                f = s;
                if(s == -1)
                    done = true;
                else{
                    c = (autore.substring(s+1,s+2));
                    System.out.print(c);
                }
            }while(!done);




        }

    }



    public String getTitolo() {
        return titolo;
    }

    public String getAutore() {
        return autore;
    }

    public static int getId() {
        return id;
    }

    public int getPagine() {
        return pagine;
    }

    public String getCapitolii() {
        return capitolii;
    }

    static int id;
    private String titolo, autore,capitolii;
    private int pagine;
    private ArrayList<String> capitoli = new ArrayList<String>();
    private boolean done = false;
}
