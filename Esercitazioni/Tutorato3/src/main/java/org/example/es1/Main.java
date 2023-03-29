package org.example.es1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Televisore t1;
        Televisore t2;
        Televisore t3;
        Televisore t4;

        Scanner in1 = new Scanner(System.in), in2 = new Scanner(System.in),in3 = new Scanner(System.in), in4 = new Scanner(System.in);
        int c1, c2, c3, c4;
        String s1, s2, s3, s4;

        System.out.println("NC tv1:");
        c1 = in1.nextInt();
        t1 = new Televisore(c1);
        System.out.println("S tv1:");
        s1 = in1.nextLine();
        t1.associa(s1,c1);
        System.out.println("NC tv2:");
        c2 = in2.nextInt();
        t2 = new Televisore(c2);
        System.out.println("NC tv3:");
        c3 = in3.nextInt();
        t3 = new Televisore(c3);
        System.out.println("NC tv4:");
        c4 = in4.nextInt();
        t4 = new Televisore(c4);


        //System.out.println("NC tv1:");
    }
}