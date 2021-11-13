package com.prateek;

import java.util.Scanner;

public class LectureSeven {

    static int factorial(int n){
        //base case (smallest value of n)
        if(n==0){
            return 1;
        }

        // recursive case

        int ans = n * factorial(n-1);
        System.out.println(ans);
        return ans;
    }
    static void sayHi(){
        System.out.println("Say hi");
    }


    static void goToParty(int x,int N){
        //Base
        if(x==N){
            System.out.println("Let's Party");
            return;
        }
        //Rec Case
        System.out.println("Take a Step " + (x));
        goToParty(x+1,N);
        System.out.println("Coming back from the party " + (x));
    }

     static void inc(int n){
        if(n==0){
            return;
        }

        //rec code
        inc(n-1); //assume
         System.out.println(n);

    }

    static void dec(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        dec(n-1);
    }

    static int gcd(int a,int b){
        if(b==0){
            return a;
        }
        return gcd(b,a%b);
    }

    static void gcdOfList(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n>=2){
            int a = sc.nextInt();
            int b = sc.nextInt();

            int ans = gcd(a,b);
            for(int i=3; i<=n; i++){
                int current = sc.nextInt();
                ans = gcd(ans, current);
            }
            System.out.println("List gcd " + ans);
        }
    }

    //Maths Problems
    static void primeFactor(int n){

        for(int i=2; i*i<=n; i++){
            if(n%i==0){
                //loop
                int cnt = 0;
                while(n%i == 0){
                    cnt++;
                    n = n/i;
                }
                System.out.print(i+"^"+cnt + ",");
            }
        }
        if(n!=1){
            System.out.print(n+"^"+1);
        }
    }




    public static void main(String[] args) {
//        inc(5);
//        dec(5);
//        sayHi();
//        Scanner sc = new Scanner(System.in);
            int n = 5;
           //System.out.println(factorial(n));
//        goToParty(0,5);
        //System.out.println(gcd(0,12));

        //gcdOfList();
        primeFactor(105);
        System.out.println();
        primeFactor(88);
    }
}
