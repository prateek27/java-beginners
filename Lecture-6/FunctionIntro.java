package com.prateek;


public class FunctionIntro {

    static void sayHello(String name){
        System.out.println("Hello " + name );
    }
    static void sayHello(){
        System.out.println("Hello ");
    }

    static int square(int side){
        return side * side;
    }

    static String sendHi(){
        return "hi";
    }

    //Function Define
    static void squareArea(int side){
        System.out.println("Area is " + side*side);
    }

    public static void main(String[] args) {
        int x = 5;

        int area = square(x);
        System.out.println("In Main area is " + area);
        squareArea(x); // Function Call


        sayHello("Prateek");
        sayHello("Sidharth");
        sayHello();

    }
}
