package com.syntax.randomPractice.exercise.StringMethod;

public class ReplaceAll {
    public static void main(String[] args) {
        String name = "PrakritiPathak2325454";
        System.out.println(name.replaceAll("Pathak","Uprety")); // it will change all string
        String number = "123456789";
        System.out.println(name.replaceAll("[^b1-5]",""));
    }
}
