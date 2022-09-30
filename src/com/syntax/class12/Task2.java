package com.syntax.class12;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        /*
        Write a program that reads two people's first
        names and if they're expecting boy or girl?
        Based on the input suggests a name for a baby:
        Example Output:
            Mom’s first name? Mary
            Dad’s first name? Daniel
            Boy or Girl? boy
            Suggested baby name: DANRY

            Example Output:
            Mom’s first name? Mary
            Dad’s first name? Daniel
            Boy or Girl? girl
            Suggested baby name: MAIEL
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter dad's name?");
        String dadName = input.next();
        System.out.println("Please enter mom's name?");
        String momName = input.next();
        System.out.println("You expecting Boy or Girl?");
        String gender = input.next();

        if(gender.toLowerCase().startsWith("bo")){
            System.out.println("Suggested boy name: "+(dadName.substring(0,dadName.length()/2)+momName.substring(momName.length()/2)).toUpperCase());
        }else if(gender.toLowerCase().startsWith("gi")){
            System.out.println("Suggested girl name: "+(momName.substring(0,momName.length()/2)+dadName.substring(dadName.length()/2)).toUpperCase());
        }else{
            System.out.println("No Suggestions!!!!!");
        }

    }
}
