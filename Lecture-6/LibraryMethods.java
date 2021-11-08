package com.prateek;

public class LibraryMethods {

    static int binaryToDecimal(int number){

        int p = 1;
        int ans = 0;

        while(number > 0){
            int last_digit = number % 10;
            ans = ans + last_digit * p;
            p = p * 2;
            number = number / 10;
        }
        return ans;
    }

    static int decimalToBinary(int number){
        int p = 1;
        int ans = 0;

        while(number > 0){
            int rem = number % 2;
            ans = ans + rem * p;
            p = p * 10;
            number = number / 2;
        }
        return ans;


    }

    public static void main(String[] args) {
        int a = 10,b=20;
        System.out.println(Math.min(a,b));
        System.out.println(Math.floor(3.876));
        System.out.println(Math.sqrt(10));
        System.out.println((int)Math.pow(5,4));
        System.out.println(Math.abs(-50));
        System.out.println(binaryToDecimal(10101));
        System.out.println(decimalToBinary(21));
    }
}
