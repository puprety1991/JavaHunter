package com.syntax.randomPractice.exercise.StringMethod;

public class Task3 {
    public static void main(String[] args) {
        // Create a String and print it in reverse order (sunday - yadnuS)
        String word = "Anna";
        String reverse = "";
        for(int i = word.length()-1; i>=0;i--){
            reverse+=word.charAt(i);;
        }
        System.out.println(reverse);
        System.out.println("is "+word+" 'palindrome': "+reverse.equalsIgnoreCase(word));
        StringBuilder stringBuilder = new StringBuilder("Anna");
        System.out.println(stringBuilder.reverse());
        System.out.println("--------------");
        //reverse our string word by word
        String sentence = "You are beautiful";

    }
}
