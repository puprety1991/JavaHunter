package com.syntax.randomPractice.exercise.Exceptions;

public class Exception {
    public static void main(String[] args) {
        System.out.println("Important line of code");
        System.out.println("Normal line of code");
        try{
            System.out.println(10/0);
        }catch (java.lang.Exception e){
            System.out.println("Can not divide by zero");
        }

        System.out.println("Important line of code");

    }
}
