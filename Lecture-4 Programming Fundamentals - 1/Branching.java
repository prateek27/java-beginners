package com.prateek;

public class Branching {

    public static void main(String[] args) {

        int marks = 90;
        if(marks > 80){
            System.out.println("Let's Party");
        }
        else if(marks > 60){
            System.out.println("Got Passed!");
        }
        else if(marks > 50){
            System.out.println("On Borderline");
        }
        else{
            System.out.println("Work Hard");
        }
    }
}
