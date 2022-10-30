package com.syntax.class24;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListDemo3 {
    public static void main(String[] args) {
        ArrayList<Character> chars = new ArrayList<>(Arrays.asList('X','Z','C','R'));
        System.out.println(chars);
        ArrayList<Boolean> bool = new ArrayList<>();
        bool.add(true);
        bool.add(true);
        bool.add(false);
        bool.add(false);
        System.out.println(bool);
        ArrayList<Double> doubles = new ArrayList<>();
        doubles.add(5.0);
        doubles.add(5.4);
        doubles.add(5.7);
        System.out.println(doubles);
        ArrayList<Float> floats = new ArrayList<>();
        floats.add(5.0f);
        floats.add(5.4f);
        floats.add(5.7f);
        System.out.println(floats);


    }
}
