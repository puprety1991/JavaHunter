package com.syntax.class20;

public class Task4 {
    /*
    Create 1 class with a private method that has 3 overloaded forms.
    Then call each overloaded method with specific arguments and observe result.
     */
    private static void toCal(int num1,int num2){
        System.out.println("Sum of two value is "+(num1+num2));
    }
    private static void toCal(double weight,int age){
        if(weight>200){
            if(age>30){
                System.out.println("You have chance to be diabetic");
            }
        }else{
            System.out.println("Please maintain you weight");
        }
    }
    private static void toCal(String day, int num){
        System.out.println(day+" lucky number is "+num);
    }

    public static void main(String[] args) {
        toCal(6,8);
        toCal(212.0,31);
        toCal("Sunday",7);
    }
}
