package com.prateek;

import java.util.Scanner;

public class TrianglePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for(int i=1; i<=N; i++) {

            //Print i stars in ith Row
            for (int stars = 1; stars <= i; stars++) {
                System.out.print("*");
            }
            //print a new line
            System.out.println();
        }
    }
}
