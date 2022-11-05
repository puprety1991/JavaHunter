package com.syntax.class26;

import java.util.TreeSet;

public class Task4 {
  /*  Create a Set collection in which you need to add names of the countries.
      In this set we want all objects to be sorted in alphabetical order.
      Using 2 different ways retrieve all elements from set.*/
    public static void main(String[] args) {
        TreeSet<String>countries=new TreeSet<>();
        countries.add("Japan");
        countries.add("USA");
        countries.add("India");
        countries.add("Australia");
        countries.add("Korea");
        System.out.println(countries);
        var iterator=countries.iterator();
        while ((iterator.hasNext())){
            var country=iterator.next();
            System.out.print(country+" ");
        }


    }
}
