package com.syntax.class28;

import java.util.LinkedHashSet;
import java.util.Set;

public class Task5 {
   /* Create the collection that will store single uniques Objects of a
   String type in which order is preserved.
    Write a logic to concatenate all string from the collection.*/
    public static void main(String[] args) {
        Set<String>words=new LinkedHashSet<>();
        words.add("the");
        words.add("wonderful thing");
        words.add("i decided");
        words.add("to do");
        words.add("was to");
        words.add("share my");
        words.add("life and");
        words.add("my heart");
        words.add("with");
        words.add("you!");
        for(String word:words){
            System.out.print(word+" ");
        }


    }
}
