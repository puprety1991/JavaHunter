package com.syntax.class13;

public class StringDemo {
    public static void main(String[] args) {
        String str = "Today is Sunday";
        String day = str.substring(9);
        System.out.println(day);

        char c = str.charAt(1);//calling the method charAt on str object.
        System.out.println(c);
        char[] charArray = str.toCharArray();
        System.out.println(charArray);

        for(int i=charArray.length-1; i>=0; i--){
            System.out.print(charArray[i]);
        }
        System.out.println();
        System.out.println(str.indexOf("a"));
        System.out.println(str.indexOf("a",6));
    }
}
