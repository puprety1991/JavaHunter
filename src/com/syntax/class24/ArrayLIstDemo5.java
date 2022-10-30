package com.syntax.class24;

import java.util.ArrayList;

public class ArrayLIstDemo5 {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        // Use add method to insert elements in an arrayList
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Black");
        System.out.println(colors); // remove from actual value
        colors.remove("Blue");
        colors.remove(1);   // remove from  index
        System.out.println(colors);
    }
}
