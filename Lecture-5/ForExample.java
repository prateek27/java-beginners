package com.prateek;

import java.util.Scanner;

public class ForExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int i = 2;
        int sum = 0;
        for(; i<=n ; i = i + 2){
            sum = sum + i;
        }
        System.out.println("Sum Even " + sum);
    }
}
