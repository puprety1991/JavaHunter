package com.syntax.class14;

public class Task {
    public static void main(String[] args) {
        /*
        Create a String that will hold a sentence. Write a program to get a new String without any spaces.
         */
        String str = "we love Java";
        str = str.replaceAll(" ","");
        System.out.println(str);
        /*
        Create a String that should be combination of letters, numbers and special characters.
         Find out how many Alphanumeric(abd AZ 284) characters are there in the String.
         */
        String newString = "FDFDegfg#$#2356$#$";
        String newstring = newString.replaceAll("[^A-z0-9]","");
        System.out.println(newstring.length());

    }
}
