package com.syntax.class25;

import java.util.ArrayList;

public class TaskReview {
     /* Create an ArrayList that will store 5 names into it.
    Find out whether the given ArrayList is empty or not?
    Check whether the specific name is present in an ArrayList or not?
    Find the size of your arrayList and print all values from that*/
     public static void main(String[] args) {
       /*  // Non-generic way of using collections framework this is how your ancestors use to write code before java
         //ArrayList<String> names = new ArrayList<>();*/
         ArrayList<String> names = new ArrayList<>(5);
         names.add("Sarah");
         names.add("Janel");
         names.add("Ben");
         names.add("Robin");
         names.add("Oscar");

     }


}
