package com.prateek;

import java.util.Scanner;

public class Digits {
    // Given T Numbers, you have to print the no of digits in each number
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int i=1; i<=T; i++){
            int number = sc.nextInt();
            //System.out.println(number);
            int cnt = 0;
            while(number!=0){
                cnt++;
                number = number/10;
            }
            System.out.println("Count " + cnt);
        }
    }



}
