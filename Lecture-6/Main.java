package com.prateek;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int N = 6;
        int F = 32;

        for(int i=1; i<=N; i++){
            //Calc C
            double C = (double)5 * (F-32)/9;
            // Print
            System.out.println(F + " F - " + String.format("%.1f",C) + " C " );
            //Update F
            if(i==1){
                F = F + 8;
            }
            else{
                F = F + 10;
            }
        }
    }
}
