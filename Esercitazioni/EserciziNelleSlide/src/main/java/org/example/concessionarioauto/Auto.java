package org.example.concessionarioauto;

public class Auto {
    Auto(String marca,String nome,String targa,double serbatoio, double kmL){
        this.marca = marca;
        this.nome = nome;
        this.targa = targa;
        this.serbatoio = serbatoio;
        this.kmL = kmL;

    }

    public void autonomia(){
        autonomia =serbatoio/kmL;
    }

    public double getAutonomia() {
        return autonomia;
    }

    private String marca,nome,targa;
    private double serbatoio, kmL,autonomia;
}
