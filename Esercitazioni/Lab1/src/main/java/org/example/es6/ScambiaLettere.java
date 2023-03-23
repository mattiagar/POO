package org.example.es6;



public class ScambiaLettere {
    ScambiaLettere(String parola){
        this.parola = parola;
    }

    public void scambio(){

        for(int i = 0;i<parola.length();i++){
            c = parola.substring(i,i+1);
            if(c == "e")
                c = c.replace("e","o");

            else {
                if(c == "o")
                    c = c.replace("o","e");
            }

            System.out.print(c);

        }


    }

    private String parola,c;

}