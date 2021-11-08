package com.prateek;

public class GCD {
    public static void main(String[] args) {
        int a = 8;
        int b = 12;
        int gcd = 1;

        //System.out.println("Min " + Math.min(11,6));
        int limit = a < b ? a : b;

        for(int i=1; i<= limit; i++){
            if(a%i==0 && b%i==0){
                gcd = i;
            }
        }

        System.out.println(gcd);
        int lcm  = a * b / gcd ;
        System.out.println("LCM " + lcm);
    }
}
