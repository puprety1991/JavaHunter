package com.syntax.review.class06;

public class review1 {
    public static void main(String[] args) {
        //how would you reverse a string
        String name = "Japan";
        String reverse = "";
        for(int i=name.length()-1;i>=0; i--){
            reverse+=name.charAt(i);
        }
        System.out.println(reverse);
                    //OR
        StringBuilder stringBuilder = new StringBuilder("JAPAN");
        System.out.println(stringBuilder.reverse());
        System.out.println(stringBuilder.toString().toLowerCase());


        String name1 = "Hello world";
        char[] array = name1.toCharArray();
        reverse="";
        for(int i=array.length-1; i>=0; i--){
            reverse+=array[i];

        }
        System.out.println(reverse);


    }
}
