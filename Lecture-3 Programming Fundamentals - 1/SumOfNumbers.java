package com.prateek;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {

        //Read N and find sum of numbers from 1 to N
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int sum = 0;
        int current = 1;
        while(current <= N){
            sum = sum + current;
            current = current + 1;
        }
        System.out.println("Sum " + sum);
    }
}
