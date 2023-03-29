package es3;

public class Ecocardiogramma extends EsameMedico{
    Ecocardiogramma(String nomeMedico, String tipologia, int eta){
        super(nomeMedico);
        this.tipologia = tipologia;
        this.eta = eta;
    }

    public void calcolaCosto(){
        if(tipologia.equalsIgnoreCase("contrasto"))
            costo = 45;
        else costo = 30;

        if(eta>65)
            costo = costo * 20 / 100;
    }

    @Override
    public double getCosto() {
        return costo;
    }

    private String tipologia;
    private int eta;
    private double costo;
}
