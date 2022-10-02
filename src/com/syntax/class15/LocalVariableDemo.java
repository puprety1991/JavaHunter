package com.syntax.class15;

public class LocalVariableDemo {
    String name = "hello";
    public static void main(String[] args) { //cannot access where there is static
        int number = 0; // this is local variable which is inside the main method
    }
    void displayNum(){
       //System.out.println(number); --> we cannot access 'number' variable outside the main.
        System.out.println(name);
    }

}
