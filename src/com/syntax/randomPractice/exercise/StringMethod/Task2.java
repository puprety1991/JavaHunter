package com.syntax.randomPractice.exercise.StringMethod;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        /*
        Create a String and if the String is not empty perform the following:
          -> if the String has an odd number of characters and has 3 or more
          characters, print the character in the middle of the String
         */
        String string = "Strings";
        int len = string.length();
        if(!string.isEmpty()){
            if(len>3 && len%2 != 0){
                System.out.println(string.charAt(len/2));
            }

        }
        /*
        Write a program that reads two people's first name if
        they are expecting a boy or girl? based on Example:
        Mom's first name>Maria
        Dad's first name>Daniel
        Boy or girl>boy
        suggest baby name: Danria
        suggest baby girl name: Maiel
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter dad's name?");
        String dadName = input.next();
        System.out.println("Please enter mom's name?");
        String momName = input.next();
        System.out.println("You want to have boy or girl?");
        String babyDecision = input.next();

        if(babyDecision.toLowerCase().startsWith("b")){
            System.out.println("suggest boy name: "+(dadName.substring(0,dadName.length()/2)+momName.substring(momName.length()/2)).toUpperCase());
        }else if(babyDecision.toLowerCase().startsWith("g")){
            System.out.println("suggest girl name: "+(momName.substring(0,momName.length()/2)+dadName.substring(dadName.length()/2)).toUpperCase());
        }else{
            System.out.println("No suggestions!!");
        }
    }
}
