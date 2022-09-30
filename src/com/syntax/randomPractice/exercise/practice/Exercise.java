package com.syntax.randomPractice.exercise.practice;

import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String babyboyName = "aarnave";
        String babygirlName = "aayana";
        System.out.println("Mom's First name?");
        String fname = input.next();
        System.out.println("Dad's First name?");
        String fname1 = input.next();
        System.out.println("Boy or Girl?");
        String ans = input.next();

        if(ans.equalsIgnoreCase("boy")){
            System.out.println("Suggested baby name: "+babyboyName.toUpperCase());
        }else if(ans.equalsIgnoreCase("girl")){
            System.out.println("Suggested baby name: "+babygirlName.toUpperCase());
        }else{
            System.out.println("You enter invalid input!!!!!");

        }

    }
}
