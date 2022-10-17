package com.syntax.replit;
public class Repls175 implements FirstInterface, SecondInterface{
    /*
    Step1: Create Interface as FirstInterface and create undefined method as firstMethod (without parameter)
    Step 2: Create another interface as SecondInterface in which create a method as secondMethod (Without Parameter)
    Step 3: Inherit both interfaces to Main class.
    Step 4: Execute both methods
     */
    public void firstMethod(){
        System.out.println("First Method implementing multiple Inheritance");
    }
    public void secondMethod(){
        System.out.println("Second Method implementing multiple Inheritance");
    }
    public static void main(String[] args){
        FirstInterface user = new Repls175();
        SecondInterface user1 = new Repls175();
        user.firstMethod();
        user1.secondMethod();
    }
}
    interface FirstInterface{
        void firstMethod();
    }
    interface SecondInterface {
        void secondMethod();
    }
