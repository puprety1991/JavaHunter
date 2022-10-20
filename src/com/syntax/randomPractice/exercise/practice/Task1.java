package com.syntax.randomPractice.exercise.practice;

public class Task1 {
  /*  Write a program that create 2d array, of size 3x3.
 - Find total number of evens and odd numbers in the array.
 -Find total sum of evens and odds
 -count 0*/
  public static void main(String[] args) {
      int [][] num={
              {78,23,0},
              {23,54,23},
              {0,43,65}
      };
      int count=0;
      int numEven=0;
      int numOdd=0;
      int sumEven=0;
      int sumOdd=0;
      for(int i=0;i<num.length;i++){
          for(int j=0;j<num[i].length;j++){
              if(num[i][j]==0){
                  count++;
              }
              if(num[i][j]%2==0){
                  sumEven+=num[i][j];
                  numEven++;
              }else{
                  sumOdd+=num[i][j];
                  numOdd++;
              }
          }
      }
      System.out.println("Even number:"+numEven);
      System.out.println("Odd number: "+numOdd);
      System.out.println("sum of even: "+sumEven);
      System.out.println("sum of odd: "+sumOdd);
      System.out.println("number of 0: "+count);
  }

}
