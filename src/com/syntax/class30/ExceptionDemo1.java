package com.syntax.class30;

public class ExceptionDemo1 {
    public static void main(String[] args) {
        System.out.println("Some Important line of code 1");
        System.out.println("Some Important line of code 2");

        String name=null;
        try{
            System.out.println(name.length());
        }catch(java.lang.Exception e){
            System.out.println(e);
        }

        System.out.println("Some Important line of code 3");
        System.out.println("Some Important line of code 4");

    }
}
