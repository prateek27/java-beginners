package com.prateek;

public class SwitchCase {
    public static void main(String[] args) {
        int x = 4;
        char ch = 'A';

        switch (ch){
            case 'A':
                System.out.println("Its A");
        }

        switch (x){
            case 5:
                System.out.println("Its Five");
                break;
            case 6:
                System.out.println("Gone of the park");
                break;
            case 4:
                System.out.println("Its a boundary");
                break;
            default:
                System.out.println("Zero runs");
        }
    }

}
