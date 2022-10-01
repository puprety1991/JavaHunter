package com.syntax.class14;

public class StringBufferVsStringBuilder {
    public static void main(String[] args) {
        //ctrl+tab we can switch one page to another
         StringBuilder stringBuilder = new StringBuilder("Today is java class");
         String str = "java is very easy";
         /*
         if we want to convert the String is a StringBuilder we can use the below syntax.
          */
         StringBuilder stringBuilder1 = new StringBuilder(str);
         stringBuilder1.reverse();
        System.out.println(stringBuilder1);
        /*
        if we want to convert from a StringBuilder to a String we can use the below syntax(.toString()).
         */
        String newString = stringBuilder1.reverse().toString().toUpperCase();
        System.out.println(newString);

    }
}
