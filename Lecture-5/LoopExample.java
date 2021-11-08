package com.prateek;

public class LoopExample {

    public static void main(String[] args) {

        for(int calories = 1; calories <= 100; calories = calories + 1){

            if(calories==50){
                System.out.println("Yea halfway done, take some rest");
                break;
            }

            System.out.println("Burning Calorie"  + calories);

            if(calories%10==0) {
                System.out.println("Great work, Keep going");
                continue;
            }
        }

        //Put Another Loop
        System.out.println("Break Over, let's resume workout");
        for(int c=51;c <=100; c++){
            System.out.println("Brunign calories" + c);
        }


    }
}
