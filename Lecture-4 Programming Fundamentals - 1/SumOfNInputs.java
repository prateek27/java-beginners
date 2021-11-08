package com.prateek;

import java.util.Scanner;

public class SumOfNInputs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int sum = 0;

        int times = 1;
        while(times <= N){
            int current = sc.nextInt();
            sum = sum + current;
            times = times + 1;
        }
        System.out.println("Sum " + sum);
    }
}
