package com.syntax.HackerRank;

import java.util.Scanner;

public class OddEven {
    /*
    Task
    Given an integer,'n', perform the following conditional actions:
    If 'n' is odd, print Weird
    If 'n' is even and in the inclusive range of 2 to 5, print "Not Weird"
    If 'n' is even and in the inclusive range of 6 to 20 , print "Weird"
    If 'n' is even and greater than 20, print "Not Weird"
    NOTE: TRY TO SOLVE USING CONSTRUCTOR AND METHOD WHICH WE JUST LEARN. YOU CAN CREATE OBJECT IN SAME CLASS.
     */
   static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter a number?");
        int N = scanner.nextInt();
        if (N >= 6 && N <= 20) {
            System.out.println("Weird");

        }
        if (N % 2 == 0) {
            if((N>=2 && N<=5)||(N>20)){
                System.out.println("Not Weird");
            }


        } else if(!(N >= 6 && N <= 20)) {
            System.out.println("Weird");

        }

    }
}

