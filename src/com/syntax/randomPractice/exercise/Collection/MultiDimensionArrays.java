package com.syntax.randomPractice.exercise.Collection;

import java.util.ArrayList;

public class MultiDimensionArrays {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>>outArrayLists = new ArrayList<>();
        ArrayList<Integer>innerArrayList=new ArrayList<>();
        innerArrayList.add(10);
        innerArrayList.add(20);
        innerArrayList.add(30);
        innerArrayList.add(40);
        outArrayLists.add(innerArrayList);
    }
}
