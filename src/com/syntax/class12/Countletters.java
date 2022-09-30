package com.syntax.class12;

public class Countletters {
    public static void main(String[] args) {
        String sent = "Love has no value unless it is shared.";
        int count = 0;
        char [] array = sent.toCharArray();
        for(char charArrays:array){
            if(charArrays == 's'){
                count++;
            }
        }
        System.out.println("The letter 's': "+count);
    }
}
