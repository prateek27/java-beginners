package com.prateek;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        //Scanner Object for Reading inputs
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //Range of Primes (a,b)

        //Check if N is Prime
        int i = 2;
        for( ; i < n ; i++){
            if(n%i==0){
                System.out.println("Not Prime");
                break;
            }
        }
        //we need to check if i == n then it is prime
        if(i==n){
            System.out.println("prime");
        }
    }
}
