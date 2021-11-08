package com.prateek;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int i = 2;
        while(i < n){
            if(n%i == 0){
                System.out.println("Not Prime");
                break;
            }
            i = i + 1;
        }

        //Number is Prime
        if(i==n) {
            System.out.println("Prime");
        }

        System.out.println("This output should always Appear");
    }
}
