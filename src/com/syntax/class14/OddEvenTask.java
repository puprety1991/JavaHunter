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
    void findEven(int number){
        if(number%2==0){
            System.out.println(number+" is Even Number");
        }else{
            System.out.println(number+" is Odd Number");
        }
    }

    public static void main(String[] args) {
        OddEvenTask toCheck = new OddEvenTask();
         //calling boolean method
        if(toCheck.isEven(5)){
            System.out.println("The number is Even");
        }else{
            System.out.println("The number is Odd");
        }
                //calling void method
        toCheck.findEven(65);

    }
}
