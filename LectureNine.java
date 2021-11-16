package com.prateek;

import java.util.Scanner;

public class LectureNine {

    static Scanner sc = new Scanner(System.in);

    // 1 D Array
    public static void main(String[] args) {
       // arrayHardcode();
        //Method Call to Input
        int[] myInputArr = takeInput();
        printArray(myInputArr);

    }

    static void arrayHardcode(){
        //Array of Integers
        int[] arr = {10,20,30,12};

        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        //Out of Bounds Error
        // System.out.println(arr[4]);

        //Length
        System.out.println("Length " + arr.length);
        // Loop
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + ",");
        }

        //Enhanced For Loop
        for(int val : arr){
            System.out.print(val + ";");
        }


    }

    //Take Input the Size of the array and create array of that size
    // returns the arrays
    public static int[] takeInput(){

        int n = sc.nextInt();
        int[] arr = new int[n];
        int x = 10;
        //Read Inputs from the user and store in inside array

        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    static void printArray(int[] arr){
        for(int val : arr){
            System.out.println(val);
        }
    }





}
