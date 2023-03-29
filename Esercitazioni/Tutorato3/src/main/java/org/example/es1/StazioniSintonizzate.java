package org.example.es1;

public class StazioniSintonizzate extends Televisore {
    StazioniSintonizzate(int c){
        super(c);
    }

    public static int qunteStazioni(Televisore[] t, String s){
        for(int i = 0; i < t.length; i++){
            for(int j = 0; j < t[i].quantiCanali()-1; j++){
                String r = t[i].qualeStazione(j);
                if(s.equals(r)){
                    acc++;
                    break;
                }
            }
        }
        return acc;
    }
    private static int acc = 0;
}
