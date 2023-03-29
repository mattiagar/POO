package es3;

import java.util.GregorianCalendar;

public class EsameMedico {
    EsameMedico(String nomeMedico){
        this.nomeMedico = nomeMedico;
    }

    public void effettuaesame(String referto, GregorianCalendar data){
        this.referto = referto;
        this.data = data;
    }

    public String toString(){
        return "Il referto "+referto+" è stato effettuato in data "+data.getTime()+" dal Dott. "+nomeMedico;
    }

    public double getCosto(){
        return costo;
    }


    private String nomeMedico, referto;
    private GregorianCalendar data;
    private double costo;
}
