package es3;

import java.util.GregorianCalendar;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner st = new Scanner(System.in), st1 = new Scanner(System.in);
        String nome, referto;
        GregorianCalendar data;
        int giorno, mese, anno;


        System.out.println("Inserire nome del medico");
        nome = st.nextLine();
        EsameMedico esame1 = new EsameMedico(nome);
        System.out.println("Inserire nome referto:");
        referto = st.nextLine();
        System.out.println("Inserire anno referto:");
        anno = st.nextInt();
        System.out.println("Inserire mese referto:");
        mese = st.nextInt();
        System.out.println("Inserire giorno referto:");
        giorno = st.nextInt();
        data = new GregorianCalendar(anno,mese,giorno);
        esame1.effettuaesame(referto,data);
        System.out.println(esame1.toString());

        System.out.println("Inserire nome del medico:");
        nome = st1.nextLine();
        EsameMedico esame2 = new EsameMedico(nome);
        System.out.println("Inserire nome referto:");
        referto = st1.nextLine();
        System.out.println("Inserire anno referto:");
        anno = st1.nextInt();
        System.out.println("Inserire mese referto:");
        mese = st1.nextInt();
        System.out.println("Inserire giorno referto:");
        giorno = st1.nextInt();
        data = new GregorianCalendar(anno,mese,giorno);
        esame2.effettuaesame(referto,data);
        System.out.println(esame2.toString());




    }
}
