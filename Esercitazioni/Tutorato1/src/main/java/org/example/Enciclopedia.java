package org.example;

public class Enciclopedia extends Libro{
    Enciclopedia(String titolo,String autore){

        super(titolo,autore, 00, null);
    }

    @Override
    public boolean equals(Libro l) {
        return super.equals(l);
    }

    @Override
    public String getAutore() {
        return super.getAutore();
    }

    @Override
    public String getTitolo() {
        return super.getTitolo();
    }
}
