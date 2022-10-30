package com.syntax.randomPractice.exercise.Collection;

import java.util.ArrayList;

public class Task {
   /* Create an ArrayList that will store 5 names into it.
    Find out whether the given ArrayList is empty or not?
    Check whether the specific name is present in an ArrayList or not?
    Find the size of your arrayList and print all values from that*/
   public static void main(String[] args) {
       ArrayList<String>names= new ArrayList<>();
       names.add("Oscar");
       names.add("Robin");
       names.add("Anna");
       names.add("sarah");
       names.add("Kali");

       if(!names.isEmpty()){
           if(names.contains("hello")){
               System.out.println("It contains your given name in arrayList");
               System.out.println("Size of Array: "+names.size());
               System.out.println(names);
           }else{
               System.out.println("Doesn't contain  your given name in arrayList ");
               System.out.println("Size of Array: "+names.size());
               System.out.println(names);
           }
       }
   }
}
