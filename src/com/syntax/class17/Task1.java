package com.syntax.class17;

public class Task1 {
    /*
    Write a java class that will have a constructor:
    one with parameters and second without any parameters.
    Create a separate Test class where you will execute both of the constructors 1 by 1.
     */
    private String fname;
    private String lname;
    private int age;
    private double weight;
    private double height;

    public Task1(){

    }

    public Task1(int age) {
        this.age = age;

    }
    public void youBecome(){
        if(age<13){
            System.out.println("You are baby");
        }else if(age>=13 && age<=19){
            System.out.println("You become Teenager");
        }else{
            System.out.println("You grown Up");
        }
    }
}
