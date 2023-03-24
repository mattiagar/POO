package org.example.studente;

public class Student {
    Student (){

    }

    public void registra(double voto){
        voti += voto;
        i++;

    }

    public void media(){
        mediaVoti = voti/i;
    }

    public double getMediaVoti() {
        return mediaVoti;
    }

    private int i;
    private double voti, mediaVoti;
}
