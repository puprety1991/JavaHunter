package com.syntax.class24;

import java.util.ArrayList;

public class ArrayListDemo2 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(20);
        numbers.add(21);
        numbers.add(67);

        int a=65;
        numbers.add(a);
        System.out.println(numbers);
        for (Integer number : numbers) {
            System.out.print(number + " ");
        }
        // int => Integer
        // boolean => Boolean
        // byte => Byte
        // double => Double
        // long => Long
        // float => Float
        // char => Character
    }
}
