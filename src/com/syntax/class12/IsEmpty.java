package com.syntax.class12;

public class IsEmpty {
    public static void main(String[] args) {
        String name = "";
        if(name.isEmpty()){
            System.out.println("It should not be empty");
        }
        /*
        isEmpty() returns true if a String is empty.
        this method will return false if you have a space in a String Variable.
        However, blank method does not count the spaces.
         */
        String name1 = " ";
        System.out.println(name1.isEmpty());// it counts space as a character
        System.out.println(name1.isBlank());//it won't count space as a character
    }
}
