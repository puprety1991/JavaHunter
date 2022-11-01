package com.syntax.replit;

import java.util.LinkedList;

public class Repls192 {
   /* Create a Linked List that will store all prime numbers from 1 to 100
    Step 1. Create a method that will identify either number is prime or not
    Step 2. Add all prime numbers into Linked List
    Print Linked List: */

   public static void main(String[] args){
       LinkedList<Integer> num=new LinkedList<>();
       for(int i=1;i<=100;i++){
           boolean flag = false;
           if(i==1){
               flag=true;
           }else{
               for (int j = 2; j <= i / 2; ++j) {
                   if (i % j == 0) {
                       flag = true;
                       break;
                   }
               }
           }
           if (!flag)
               num.add(i);

       }
       System.out.println(num);

   }
}
