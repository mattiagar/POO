package org.example;

public class MainL {
    public static void main(String[] args) {
        Libreria l = new Libreria();
        Libro bho = new Libro("Dio",38,"bho");
        Libro bho2 = new Libro("Dip",38,"bho");
        Libro bho3 = new Libro("Dii",38,"bho");

        l.addBook(bho);
        l.addBook(bho2);
        l.addBook(bho3);
        l.ricerca("Dio");

        l.getLibreria();



        //System.out.println("Hello world!");
    }



}
