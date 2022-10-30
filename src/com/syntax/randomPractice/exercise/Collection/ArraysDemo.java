package com.syntax.randomPractice.exercise.Collection;

import java.util.ArrayList;

public class ArraysDemo {
    public static void main(String[] args) {
        ArrayList <Integer> arrayList = new ArrayList<>();
        arrayList.add(32);
        arrayList.add(12);
        arrayList.add(56);
        arrayList.add(25);
        System.out.println(arrayList);
        System.out.println(arrayList.size());
        arrayList.remove(2);
        arrayList.remove(new Integer(56));
        System.out.println(arrayList);
        System.out.println("-----------------");
        ArrayList<Integer> arrayList1 = new ArrayList<>(arrayList);
        System.out.println(arrayList1);
    }
}
