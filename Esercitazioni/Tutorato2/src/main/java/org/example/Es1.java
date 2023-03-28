package org.example;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Es1 {
    Es1(){

    }

    public void addArray(){
        int i = 0;
        do{
            System.out.println("Aggiungi numero:");
            input = in.nextInt();
            if(input >= 0){
                a[i] = input;
                i++;
            }

        }while(input >= 0);

        calcolo();
    }

    public void calcolo(){
        int p=0, d = 0, somma = 0;
        for(int i = 0; i<100;i++){
            if(i % 2 == 0)
                p += a[i];
            else
                d += a[i];
        }
        somma = p - d;
        System.out.println(somma );
    }

    private int[] a = new int [100];
    private Scanner in = new Scanner(System.in);
    private int input;
}
