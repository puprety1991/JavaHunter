package com.syntax.class26;

import java.util.ArrayList;
import java.util.HashSet;

public class WhenToUseSets {
    public static void main(String[] args) {
        ArrayList<Integer>numbers=new ArrayList<>();
        numbers.add(100);
        numbers.add(140);
        numbers.add(100);
        numbers.add(180);

        HashSet<Integer>num = new HashSet<>(numbers);
        System.out.println(num);

       // System.out.println(new HashSet<>(numbers));

    }
}
