package com.prateek;

import java.util.Scanner;

public class LargestNumber {

    //Read 3 Numbers and find the largest number
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        if(a > b && a > c){
            System.out.println("Largest is " + a);
        }
        else if(b > a && b > c){
            System.out.println("Largest is " + b);
        }
        else{
            System.out.println("Largest is " + c);
        }
    }
}
