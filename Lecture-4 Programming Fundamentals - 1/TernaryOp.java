package com.prateek;

import java.util.Scanner;

public class TernaryOp {
    public static void main(String[] args) {
        //Replace for small if-else blocks
        int marks = 70;
        String action = marks > 80 ? "Let's Party" : "Work hard" ;
        System.out.println(action);

        int count;
        Scanner sc = new Scanner(System.in);
        count = sc.nextInt();

        String bottle = count > 1 ? "bottles" : "bottle";
        System.out.println("I want to buy " + count + " beer " + bottle);

    }

}
