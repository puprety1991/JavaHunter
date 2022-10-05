package com.syntax.class16;

public class Task3 {
    /*
    Create a method that will accept a String as a parameter and return a new
    String that consist only of vowels. Method should be available inside the
    class only where it was declared and executed by calling it is name.
     */
    private String findVowel(String word){
        return word.replaceAll("[^aeiou]","");
    }

    public static void main(String[] args) {
        Task3 vowel = new Task3();
        System.out.println(vowel.findVowel("SyntaTechnology").toLowerCase());
    }

}
