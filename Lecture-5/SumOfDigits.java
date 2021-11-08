package com.prateek;

public class SumOfDigits {
    public static void main(String[] args) {
        int n = 315;
        int sum = 0;
        while(n!=0){
            int last_digit = n%10;
            sum += last_digit;
            n = n / 10;
        }
        System.out.println(sum);
    }
}
