package com.syntax.class13;

public class StringBuilderDemo {
    public static void main(String[] args) {
        /*
        StringBuilder allows any methods to change the original contents of the variables
        because StringBuilder is mutables.
         */
        StringBuilder stringBuilder = new StringBuilder("Life Is Beautiful.");
        System.out.println(stringBuilder);
        /*
        String does not allow any methods to change the original contents of the variables
        because String is immutable.
         */
        stringBuilder.reverse();
        System.out.println(stringBuilder);
        String country = "USA";
        String home = "USA";


    }
}
