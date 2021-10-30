package com.prateek;

public class LoopExample {
    public static void main(String[] args) {
        int Home = 10;
        int x = 0;

        while(x < Home){
            System.out.println("Take a step" + x);
            x = x + 2;
        }
        System.out.println("We stop at " + x);


    }
}
