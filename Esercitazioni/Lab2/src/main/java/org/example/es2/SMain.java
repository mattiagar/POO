package org.example.es2;

public class SMain {
    public static void main(String[] args) {
        Student studente = new Student();

        studente.registra(25);
        studente.registra(24);
        studente.registra(26);

        studente.media();

        System.out.println("Media studente: "+studente.getMediaVoti());
    }
}
/**Una classe Student dove siamo interessati a registrare i voti degli esami di uno studente e recuperare il voto medio.**/
