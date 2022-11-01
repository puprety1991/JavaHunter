package com.syntax.randomPractice.exercise.Collection;

import java.util.ArrayList;

public class ArrayClassDemo1 {
    public static void main(String[] args) {
        ArrayList<Double> doubleArrayList = new ArrayList<>();
        doubleArrayList.add(18.99);
        doubleArrayList.add(23.49);
        doubleArrayList.add(12.69);
        System.out.println("--> Before Replacement <--");
        System.out.println(doubleArrayList);
       // Replaces The Value At Specified Index
        doubleArrayList.set(1,25.66);
        System.out.println("--> After replacement <--");
        System.out.println(doubleArrayList);
        doubleArrayList.remove(0);
        System.out.println(doubleArrayList);

        System.out.println("Printing from top to bottom.");
        for(Double singleNum:doubleArrayList){
            System.out.println(singleNum);
        }
        System.out.println("Looping in reverse Order.");
        for(int i=doubleArrayList.size()-1;i>=0;i--){
            System.out.println(doubleArrayList.get(i));
        }
    }
}
