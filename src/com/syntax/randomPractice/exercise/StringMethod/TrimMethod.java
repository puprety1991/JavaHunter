package com.syntax.randomPractice.exercise.StringMethod;

public class TrimMethod {
    public static void main(String[] args) {
        String name = "hello     ";
        String save = name.trim(); // trim will delete all the white spaces
        System.out.println(save.length());
        System.out.println(save);
    }
}
