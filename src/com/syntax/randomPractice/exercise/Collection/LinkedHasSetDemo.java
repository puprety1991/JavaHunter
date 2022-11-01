package com.syntax.randomPractice.exercise.Collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class LinkedHasSetDemo {
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<String>();
        Set<String> LinkedHashSet = new LinkedHashSet<>();
        Set<String> treeSet = new TreeSet<>();
        hashSet.add("Apple");
        hashSet.add("Mango");
        hashSet.add("Grapes");
        hashSet.add("Orange");
        hashSet.add("Avocado");
        hashSet.add("Apple");
        System.out.println(hashSet);

        LinkedHashSet.add("Apple");
        LinkedHashSet.add("Mango");
        LinkedHashSet.add("Grapes");
        LinkedHashSet.add("Orange");
        LinkedHashSet.add("Avocado");
        LinkedHashSet.add("Apple");
        System.out.println(LinkedHashSet);

        treeSet.add("Apple");
        treeSet.add("Mango");
        treeSet.add("Grapes");
        treeSet.add("Orange");
        treeSet.add("Avocado");
        treeSet.add("Apple");
        System.out.println(treeSet);
    }
}
