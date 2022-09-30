package com.syntax.randomPractice.exercise.StringMethod;

import java.util.Arrays;

public class Split {
    public static void main(String[] args) {
        String name = "Puskar+Prakriti=Puskrity";
        String [] arr = name.split("[^A-Z a-z]");
        for(String name1:arr){
            System.out.println(name1);
            //or

        }
        System.out.println(Arrays.toString(arr));
    }
}
