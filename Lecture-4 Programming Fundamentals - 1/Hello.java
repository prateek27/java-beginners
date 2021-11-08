package com.prateek;

import java.util.Scanner;

public class Hello {
    //Read a Name and Print "Hello Name"
    // Figure out what method will read a string?
    // What datatype
    public static void main(String[] args) {
        String name;
        Scanner sc = new Scanner(System.in);
        name = sc.next();
        System.out.println("Hello " + name);

        int x = 80;
        boolean b0 = (x > 20);
        boolean b1 = false;
        System.out.println(b0);
        System.out.println(b1);
    }
}
