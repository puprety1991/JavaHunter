package com.syntax.class12;

import java.util.Arrays;

public class InterviewQuestionStringDemo {
    public static void main(String[] args) {
        String str = "I love java programming";
        /*
        toCharArray will convert a String to an array of chars
         */
        char[] charArrays = str.toCharArray();
        for(char charCharacters:charArrays) {
            System.out.print(charCharacters);
        }
        System.out.println(Arrays.toString(charArrays));
        int counter =0;
        for(char c: charArrays){
            if(c=='a'){
                counter++;
            }
        }
        System.out.println("Letter 'a' has appeared "+counter+" times.");
    }
}
