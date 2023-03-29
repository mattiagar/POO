package es3;

public class Radiografia extends EsameMedico{
    Radiografia(String nomeMedico, String nomeFile, String nomeOggetto, boolean impegnativa){
        super(nomeMedico);
        this.nomeFile = nomeFile;
        this.nomeOggetto = nomeOggetto;
        this.impegnativa = impegnativa;
    }

    public void calcoloCosto(){
        if(impegnativa == true)
            costo = 13;
        else
            costo = 20;
    }

    @Override
    public double getCosto() {
        return costo;
    }

    private String nomeFile, nomeOggetto;
    private boolean impegnativa;
    private double costo;
}
