package com.prateek;

public class DoWhile {
    public static void main(String[] args) {

        int x = 1;
        do{
            if(x>5){
                break;
            }
            System.out.println(x);
            x = x + 1;
        }
        while(true);
    }
}
