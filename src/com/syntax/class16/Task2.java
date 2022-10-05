package com.syntax.class16;

public class Task2 {
    /*
    Create a method that will take a String as a parameter and returns reversed String.
    Method should be available to all classes within your project and accessible by class name.
     */
    public String reverseWord(String word){
        StringBuilder stringBuilder = new StringBuilder(word);
        stringBuilder.reverse();
        String reserve = stringBuilder.toString();
        return reserve;
    }

    public static void main(String[] args) {
        Task2 str = new Task2();
        System.out.println(str.reverseWord("Hello"));
    }
}
