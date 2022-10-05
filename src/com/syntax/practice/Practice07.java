package com.syntax.practice;

import java.util.Scanner;

public class Practice07 {
    class Main {
        public static void main(String [] args){
            Scanner input =  new Scanner(System.in);
            System.out.println("Do you need a loan?");
            boolean decision = input.nextBoolean();
            String result = "null";

            if(decision){
                System.out.println("What is your credit score?");
                int score = input.nextInt();
                if(score>800){
                    result = "Definitely eligible";
                }else if(score>=701 && score<=800){
                    result = "Eligible";
                }else if(score>=600 && score<=700){
                    result = "Maybe eligible";
                }else if(score<600){
                    result = "Not eligible";
                }
                System.out.println("The eligibility is "+result);
            }else{
                System.out.println("Unknown");
            }

        }
    }
}
