package com.syntax.class24;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        // Syntax to create an arrayList
        ArrayList<String> colors = new ArrayList<>();
        // Use add method to insert elements in an arrayList
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Black");
        System.out.println(colors);
        // Get method prints individuals elements from arrayList
        System.out.println(colors.get(2));
        System.out.println(colors.get(0));
        // size me
        System.out.println(colors.size());
        System.out.println("----------");
        // Getting all the elements through Normal loop
        for (String color : colors) {
            System.out.print(color+" ");
        }
    }
}
