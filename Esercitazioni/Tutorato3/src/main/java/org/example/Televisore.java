package org.example;

import java.util.ArrayList;

public class Televisore {
    Televisore(int c){
        nCanali = c;
        stazioni = new String[nCanali-1];
    }


    public int quantiCanali(){
        return nCanali;
    }

    public void associa(String s, int c){
        stazioni[c-1] = s;
    }

    public String qualeStazione(int c){
        String a = "";
        if(c<=nCanali && c>0)
            a = stazioni[c-1];
        else
            a = "Stazione inesistente.";
        return a;
    }


    private int nCanali;
    private String[] stazioni;
    private String stazione;
}
