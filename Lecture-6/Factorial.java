package com.prateek;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        //Take T inputs and print sum of digits of each number
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int t=1; t<=T; t++){
            int number = sc.nextInt();
            int out = factorial(number);//sumOfDigits(number);
            System.out.println(out);
        }
    }

    static int factorial(int number){
        int ans = 1;
        for(int i=1; i<=number; i++){
            ans = ans * i;
        }
        return ans;
    }

    static int sumOfDigits(int number){
        int sum = 0;

        for( ;number!=0; number = number/10) {
            int last_digit = number % 10;
            sum = sum + last_digit;
        }
        return sum;
    }

}
