package com.syntax.class20;

public class Task3 {
    /*
    Create 1 class with a static method that has 3 overloaded forms.
     Then call each overloaded method with specific arguments and observe result.
     */
    static void toCheck(String day, boolean isRaining,String rainingDay){
        if(day.equalsIgnoreCase(rainingDay)){
            if(isRaining){
                System.out.println("It's raining on "+day);
            }else{
                System.out.println("It's not raining on "+day);
            }
        }else{
            System.out.println("Please matching day");
        }
    }
    static void toCheck(int age, double weight){
        System.out.println("You age "+age+" and weight is "+weight);
    }
    static void toCheck(double salary, int expYear){
        if(expYear>5){
            if(salary>10000) {
                System.out.println("You have good salary");
            }else{
                System.out.println("You eligible for raise your salary");
            }
        }
    }

    public static void main(String[] args) {
        toCheck("Friday",true,"Friday");
        toCheck(25,150.0);
        toCheck(12000.0,6);
    }

}

