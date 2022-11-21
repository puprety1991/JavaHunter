package com.syntax.class30;

public class ExceptionDemo2 {
    public static void main(String[] args) {
        System.out.println("1");
        System.out.println("2");
        System.out.println("3");
        System.out.println("4");
        System.out.println("5");
        System.out.println("6");

        try{
            int[] arr = new int[-5];
        }catch (NegativeArraySizeException e){
            System.out.println(e);
        }

        System.out.println("7");
        System.out.println("8");
        System.out.println("9");
        justAnotherMethod();

    }

    private static void justAnotherMethod() {
        int[] arr = new int[-5];
    }
}
