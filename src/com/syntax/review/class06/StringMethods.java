package com.syntax.review.class06;

import java.sql.SQLOutput;

public class StringMethods {
    public static void main(String[] args) {
        String str = "hello";
        //toUpperCase() or toLowerCase()
        str.toUpperCase();
        System.out.println(str);//hello
        System.out.println("-------------------");
        str = str.toUpperCase();
        System.out.println(str);//HELLO

        //length() --> returns the length of this string.
        int size = str.length();
        System.out.println(size);

        //charAt() -> returns the char value at the specific index;
        char letter = str.charAt(1);
        System.out.println(letter);//str = HELLO -->E

        //how to get last character
        char lastChar = str.charAt(str.length()-1);
        System.out.println(lastChar);//str = HELLO -->O

        //indexOf--> returns the index within this string of the character.
        int index = str.indexOf(lastChar);
        System.out.println(index);//str = HELLO --> 4
        System.out.println(str.indexOf('a'));//str = HELLO -->-1

        //


    }
}
