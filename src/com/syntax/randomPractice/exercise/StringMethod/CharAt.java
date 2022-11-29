package com.syntax.randomPractice.exercise.StringMethod;

public class CharAt {
    public static void main(String[] args) {
        String sen = "the most wonderful thing i decided to do was to share my life and my heart with you";
        char c = sen.charAt(5);
        System.out.println(c);
        System.out.println(sen.charAt(0)); // we can access character through charAt(int index)
        System.out.println(sen.charAt(1));
        System.out.println(sen.charAt(2));
        for(int i=0; i<sen.length();i++){
            System.out.print(sen.charAt(i)+" ");
        }

    }
}
