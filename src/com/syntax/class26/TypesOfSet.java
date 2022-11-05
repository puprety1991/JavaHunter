package com.syntax.class26;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TypesOfSet {
    public static void main(String[] args) {
        //There are three types of set
        /*
        hasSet: it does not care about the insertion order
        */
        HashSet<Integer>num= new HashSet<>();
        num.add(11);
        num.add(44);
        num.add(33);
        num.add(22);
        System.out.println(num);
          /*
        LinkedSet: it stores as insertion order and print all the data accordingly
        */
        //Insertion speed is same as HasSet but retrieval speed is the worst.
        LinkedHashSet<Integer>num1= new LinkedHashSet<>();
        num1.add(11);
        num1.add(44);
        num1.add(33);
        num1.add(22);
        System.out.println(num1);

           /*
        TreeSet: it stores as insertion order and sorted the data and print all the data accordingly
        */
        TreeSet<Integer> num2= new TreeSet<>();
        num2.add(11);
        num2.add(44);
        num2.add(33);
        num2.add(22);
        System.out.println(num2);

    }
}
