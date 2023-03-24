package org.example.es1;

public class Distributore {

    /**Il distributore ha zero lattine e zero gettoni. @param lattine sono le lattine iniziali, @param gettoni sono i gettoni iniziali.**/
    Distributore(){
        lattine = 0;
        gettoni = 0;
    }

    /**Il distributore ha setta le lattine iniziali e zero gettoni. @param lattine sono le lattine iniziali, @param gettoni sono i gettoni iniziali.**/
    Distributore(int initialLatttine){
        lattine = initialLatttine;
        gettoni = 0;
    }

    /**Quando il gettone è inserito, una lattina cade nel contenitore dove può essere presa dal cliente.**/
    public void inserisciGettone(){
        gettoni++;
        lattine--;

    }

    /**Il distributore può essere riempito con ulteriori lattine.**/
    public void addLattine(int newLattine){
        lattine += newLattine;

    }

    /**@return restituisce il numero totali di lattine ancora presenti nel distributore.**/
    public int getLattine() {
        return lattine;
    }

    /**@return restituisce il numero totali di gettoni inseriti nel distributore.**/
    public int getGettoni() {
        return gettoni;
    }

    private int lattine, gettoni;
}
