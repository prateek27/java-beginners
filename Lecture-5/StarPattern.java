package com.prateek;

import java.util.Scanner;

public class StarPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //Print the Star Pattern
        for(int i=1; i<=n; i++){

            //Spaces
            for(int cnt=1; cnt<=n-i; cnt++){
                System.out.print(" ");
            }
            // Stars
            for(int cnt=1; cnt<= 2*i - 1; cnt++){
                System.out.print("*");
            }
            //New Line
            System.out.println();
        }
    }
}
