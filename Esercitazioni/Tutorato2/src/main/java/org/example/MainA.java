package org.example;

import java.util.GregorianCalendar;

public class MainA {
    public static void main(String[] args) {
        int giorno = 27, mese = 03, anno = 2023;
        GregorianCalendar dataRev = new GregorianCalendar(mese,giorno,anno);
        Aereomobile mobile = new Aereomobile(dataRev,dataRev,5);
        System.out.println("Hello world!");
    }
}
