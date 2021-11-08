package com.prateek;

import java.util.Scanner;

public class CharPattern
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for(int i=1; i<=N; i++) {
            //Print i chars in ith Row starting from value 'A'
            int value = (int)'A';

            //Increasing Part (i times)
            for (int cnt = 1; cnt <= i; cnt++) {
                System.out.print((char)value);
                value = value + 1;
            }
            //Decreasing Part (i - 1 times)
            value = value - 2;
            for(int cnt = 1; cnt <= i - 1; cnt++){
                System.out.print((char)value);
                value = value - 1;
            }

            //print a new line
            System.out.println();
        }
    }
}
