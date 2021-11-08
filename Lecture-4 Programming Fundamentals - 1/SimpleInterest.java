package com.prateek;

import java.util.Scanner;

public class SimpleInterest {

    public static void main(String[] args) {
        int p,t;
        double r;
        //Take Input
        Scanner myScanner = new Scanner(System.in);
        p = myScanner.nextInt();
        r = myScanner.nextDouble();
        t = myScanner.nextInt();
        double si = (p*r*t)/100;
        System.out.println("Principal " + p + "Rate "+ r + "Time " + t);
        System.out.println("Simple Interest is " + si);
    }

}
