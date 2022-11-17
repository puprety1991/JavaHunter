package com.syntax.randomPractice.exercise.Exceptions;

import java.util.Scanner;

public class ExceptionDemo1 {
    public static void main(String[] args) {
        int[] arr = {10,20};
        Scanner scanner = new Scanner(System.in);
        System.out.println("This will execute always");
        try{
            int i = scanner.nextInt();
            System.out.println(arr[i]);
        }catch (ArrayIndexOutOfBoundsException var){
            System.out.println("Please specify correct index "+var);

        }

        System.out.println("May execute or may not execute");
        System.out.println("1000 lines of code");
     }
}
