package org.example.concessionarioauto;

public class Main {
    public static void main(String[] args) {

    Auto auto1 = new Auto("Audi","A3","XX000XX",150.00,10);
    Auto auto2 = new Auto("BMW","X5","XX001XX",17.00,17);

    auto1.autonomia();
    auto2.autonomia();

    System.out.println("L'autonomia dell'auto 1 è di: "+auto1.getAutonomia()+" Km");
    System.out.println("L'autonomia dell'auto 2 è di: "+auto2.getAutonomia()+" Km");
}
}
/** Supponiamo di voler gestire i dati relativi ai modelli in vendita presso un concessionario d’auto.
    Per ogni modello occorre tener traccia della marca, del nome, della targa, della capacità del serbatoio e
    del numero dei chilometri che il modello è in grado di percorrere con un litro di carburante.
    Il titolare del concessionario potrebbe essere interessato a calcolare l’autonomia di ogni modello (in chilometri).
    Si definisca inoltre una classe TestAuto che permetta di creare 2 automobili e di calcolarne l’autonomia.**/
