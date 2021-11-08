package com.prateek;

public class Cont {
    public static void main(String[] args) {
        //Continue;

        int i = 1;
        while(i<=10){
            if(i==7){
                System.out.println(i);
                i = i + 1;
                continue;
            }
            System.out.println(i);
            i = i + 1;
        }
    }
}
