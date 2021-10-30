package com.prateek;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");

        int x = 10;
        //Wrapper Class
        byte y = 8;
        long z = 1001;
        float pi = 3.14f;

        x = (int)pi;
        byte b1 = 2;
        byte b2 = 8;
        byte b3 = (byte)(b1 + b2); //adding two bytes gives an integer
        System.out.println(x + y + z);
        System.out.println("X " + x);
        System.out.println(pi + x);

        //Character
        char ch = 'A';
        System.out.println(ch + " " + (int)ch);
        System.out.println("नमस्ते");

        //Loop
        for(int i=0; i<=126; i++){
            System.out.println(i +" " + (char)i);
        }
    }
}
