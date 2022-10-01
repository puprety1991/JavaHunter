package com.syntax.class14;

public class OddEvenTask {
    /*
    Create a method that will take a number and prints whether the number is even or odd.
     */
    boolean isEven(int num){
        if(num%2==0){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        OddEvenTask toCheck = new OddEvenTask();
        if(toCheck.isEven(5)){
            System.out.println("The number is Even");
        }else{
            System.out.println("The number is Odd");
        }
    }
}
