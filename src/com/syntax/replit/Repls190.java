package com.syntax.replit;

import java.util.LinkedList;

public class Repls190 {
  /*  Create Linked List that will store first 10 numbers of fibonacci series
    Print number from Linked List 1 by 1 all in 1 line
        **Expected Output:**
         0 1 1 2 3 5 8 13 21 34 */
  public static void main(String[] args){
      LinkedList<Integer> num=new LinkedList<>();
      int num1=0;
      int num2=1;
      for(int i=1;i<=10;i++){
          num.add(num1);
          int num3=num1+num2;
          num1=num2;
          num2=num3;
      }
      for(int i=0;i<10;i++){
          System.out.print(num.get(i)+" ");
      }
  }
}
