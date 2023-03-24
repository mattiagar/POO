package org.example.distributorebibite;

public class DMain {
    public static void main(String[] args) {
        Distributore distributore = new Distributore(20);

        distributore.inserisciGettone(); //1 gettone, 19lattine;
        distributore.inserisciGettone(); //2 gettoni, 18lattine;
        distributore.inserisciGettone(); //3 gettoni, 17lattine;
        distributore.inserisciGettone(); //4 gettoni, 16lattine;
        distributore.inserisciGettone(); //5 gettoni, 15lattine;

        distributore.addLattine(5); //5 gettoni, 20lattine;

        System.out.println("Nel distributore sono presenti "+distributore.getGettoni()+" gettoni e "+distributore.getLattine()+" lattine.");
    }
}
/**Un distributore di bibite contiene lattine di bibite.
 Per comprare una bibita il cliente deve inserire un gettone. Quando il gettone è inserito, una lattina cade nel contenitore dove può essere presa dal cliente.
 Il distributore può essere riempito con ulteriori lattine. Vogliamo determinare quante lattine e gettoni sono presenti nella macchina ad un dato istante.
 1. Quali metodi sono necessari per la classe Distributore?
 2. Tradurre le descrizioni informali in Java signatures.
 3. Aggiungere le variabili di istanza (i.e., attributi) necessarie.
 4. Implementare e testare la classe ottenuta.**/
