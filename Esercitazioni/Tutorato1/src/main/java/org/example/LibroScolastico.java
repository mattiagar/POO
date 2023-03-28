package org.example;

public class LibroScolastico extends Libro{
    LibroScolastico(String ordGrad,String materia, String cD){
        super();
        this.ordGrad = ordGrad;
        this.materia = materia;
        this.cD =cD;
    }
    LibroScolastico(String titolo,int pagine,String capitoli,String ordGrad,String materia, String cD){
        super(titolo,pagine,capitoli);
        this.ordGrad = ordGrad;
        this.materia = materia;
        this.cD =cD;
    }

    LibroScolastico(String titolo, String autore,int pagine, String capitoli,String ordGrad,String materia, String cD){
        super(titolo,autore,pagine,capitoli);
        this.ordGrad = ordGrad;
        this.materia = materia;
        this.cD =cD;
    }

    public String getMateria() {
        return materia;
    }

    public String getcD() {
        return cD;
    }

    public String getOrdGrad() {
        return ordGrad;
    }

    @Override
    public boolean equals(Libro l) {
        return super.equals(l);
    }

    @Override
    public String getAutore() {
        return super.getAutore();
    }

    @Override
    public String getTitolo() {
        return super.getTitolo();
    }

    @Override
    public int getPagine() {
        return super.getPagine();
    }

    @Override
    public String getCapitolii() {
        return super.getCapitolii();
    }

    private String ordGrad,materia, cD;
}
