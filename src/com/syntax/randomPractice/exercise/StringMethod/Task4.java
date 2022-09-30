package com.syntax.randomPractice.exercise.StringMethod;

public class Task4 {
    public static void main(String[] args) {
        /*
        Create a String that will hold a sentence. Write a program to get a new String without any spaces.
         */
        String quotes = "Life is beautiful";
        String[] array = quotes.split(" ");
        for(String sent:array){
            System.out.print(sent);
        }
        System.out.println();
        //or
        System.out.println(quotes.replaceAll("[^A-Za-z]",""));
        /*
        Create a String that should be combination of letters, numbers and special characters.
        Find out how many alpha characters are there in String.
         */
        String pass = "Nepal@#$143";
        String newAlpha = pass.replaceAll("[^A-z]","");
        System.out.println(newAlpha+" Alpha characters amount: "+newAlpha.length());

        /*
        You have a String a = "Is it saturday? Is it raining? Do you have Java Class today?"How would you find out how
        many sentences are in that String>?
         */
        String sent = "Is it saturday? Is it raining? Do you have Java Class today?";
        String anotherSent = sent.replaceAll("[A-Z a-z]","");
        System.out.println(anotherSent);
        System.out.println("Amount of sentences: "+anotherSent.length());

    }
}
