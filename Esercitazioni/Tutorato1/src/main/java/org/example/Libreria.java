package org.example;

import java.util.ArrayList;

public class Libreria extends Libro{
    Libreria(){

    }
    public void addBook(Libro l){
        libreria.add(l);
    }

    public void ricerca(String titoloR){
        for(int i = 0; i<libreria.size();i++){
            if(titoloR.equals(libreria.get(i).getTitolo())){
                System.out.println("Il libro è nella libreria.");
                break;
            }
            else{

            }
        }
    }

    public void getLibreria(){
        for(int i= 0; i<libreria.size();i++){
            System.out.println(libreria.get(i).toString());
        }
    }

    ArrayList<Libro> libreria = new ArrayList<Libro>();
}
