package com.syntax.replit;

import java.util.Iterator;
import java.util.LinkedList;

public class Repls193 {
  /*  Create Linked List that will store Integer Objects
    Add the values below:
      111 222 333 444 555 666
    Create a logic to calculate sum of the all the values in list.
    Print the result of sum.
     **Expected Output:**
    Result of sum is 2331 */
  public static void main(String[] args){
      LinkedList<Integer> num = new LinkedList<>();
      num.add(111);
      num.add(222);
      num.add(333);
      num.add(444);
      num.add(555);
      num.add(666);
      int sum=0;
      Iterator<Integer> it = num.iterator();
      while(it.hasNext()){
          int number = it.next();
          sum+=number;
      }
      System.out.println("Result of sum is "+sum);
  }
}
