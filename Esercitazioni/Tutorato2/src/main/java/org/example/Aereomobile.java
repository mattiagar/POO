package org.example;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Aereomobile {

    Aereomobile(){

        giorno = cal.get(Calendar.DAY_OF_MONTH);
        mese = cal.get(Calendar.MONTH);
        anno = cal.get(Calendar.YEAR);
        dataRev = new GregorianCalendar(mese,giorno,anno);
    }

    Aereomobile(GregorianCalendar dataRev, GregorianCalendar proxVolo, int prenotati){
        this.dataRev = dataRev;
        System.out.println(dataRev.get(Calendar.DAY_OF_MONTH));
        this.proxVolo = proxVolo;
        this.prenotati = prenotati;
    }


    private GregorianCalendar dataRev,  proxVolo;
    private Calendar cal = new GregorianCalendar();
    private int prenotati,giorno, mese, anno;
}
