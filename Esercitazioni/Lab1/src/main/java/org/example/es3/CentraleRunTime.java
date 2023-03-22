package org.example.es3;

public class CentraleRunTime {

    public CentraleRunTime(String parola) {
        this.parola = parola;

    }

    public String srcCentrale() {
        String a;
        int n;

        n = parola.length() / 2;
        a = parola.substring(n, n + 1);

        return a;
    }

    private String parola;
}
