package com.syntax.class28;

import java.util.LinkedList;
import java.util.List;

public class Task6 {
   /* Create a collection of integers in which you can keep duplicates.
    Write a logic to find sum of all integers*/
   public static void main(String[] args) {
       List<Integer>number = new LinkedList<>();
       number.add(50);
       number.add(33);
       number.add(50);
       number.add(43);
       number.add(90);
       int sum = 0;
       for(Integer num:number){
           sum+=num;
       }
       System.out.println("The total Sum: "+sum);
   }

}
