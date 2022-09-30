package com.syntax.class13;

import java.util.Arrays;

public class Task {
    public static void main(String[] args) {
        /*
        Create a String that will hold a sentence. Write a program to get a new String without any spaces.
         */
        String quotes = "Life Is Beautiful";
        String newString = quotes.replaceAll(" ","");
        System.out.println("Task1) "+quotes+" ->(after removing spaces)-> "+newString);
        /*
        Create a String that should be combination of letters,
         numbers and special characters.
         Find out how many Alphanumeric(abd AZ 284) characters are there in the String.

         */
        String str = "fdffdeDFDFER343414@^%^%";
        String newStr = str.replaceAll("[^A-Za-z0-9]","");
        System.out.println("Task2) There are '"+newStr.length()+"' Alphanumeric(abd AZ 284) characters.");
        /*
        You have a String a=”Is it saturday? Is it raining? Do we have a Java Class today?”
        How would you find out how many sentences are in that String?
         */
        String sentence = "Is it saturday? Is it raining? Do we have a Java Class today?";
        String[] array = sentence.split("[?]");
        int length = array.length;
        System.out.println("Task3) There are "+length+" sentences.");
        System.out.println(Arrays.toString(array));

    }
}
