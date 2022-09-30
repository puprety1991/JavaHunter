package com.syntax.class12;

public class Length {
    public static void main(String[] args) {
        String str = new String("Java"); // proper way of creating an object
        //simpler and shorter way provided by Java Creators to make our life easy.
        String sent = "Java"; // only works for String and Wrapper classes
        //counts the number of characters in a string including the spaces
        System.out.println(str.length());
        if(sent.length()<8){
            System.out.println("Sentence should be at least 8 characters");
        }
    }
}
