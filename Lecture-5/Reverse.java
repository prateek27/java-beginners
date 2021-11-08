package com.prateek;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;
        int n1 = n;

        while(n!=0){
            int last_digit = n % 10;
            System.out.print(last_digit);
            n = n/10;
        }
        System.out.println();
        for( ; n1!=0; n1 = n1/10){
            System.out.print(n1%10);
        }

        //System.out.println(ans);
    }
}
