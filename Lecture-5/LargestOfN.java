package com.prateek;

import java.util.Scanner;

public class LargestOfN {
    public static void main(String[] args) {
        // Create a Scanner
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int largest = Integer.MIN_VALUE;

        for(int cnt=1; cnt<=n; cnt++){
            int current = sc.nextInt();
            if(current > largest){
                largest = current;
            }
        }
        System.out.println("largest " + largest);

    }
}
