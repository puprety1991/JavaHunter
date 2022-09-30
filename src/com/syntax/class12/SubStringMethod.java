package com.syntax.class12;

public class SubStringMethod {
    public static void main(String[] args) {
        /*
        subString() gives you smaller string from a String we can start the starting
        part to this method, and it will return us the substring from that index
         */
        String str = "I am always confused";
        System.out.println(str.substring(2));
        System.out.println(str.substring(5));
        System.out.println(str.substring(12,20));

        //convert integer to string
        int num = 1232323;
        String numStr = String.valueOf(num).substring(1,5);
        System.out.println(numStr);
        //convert string to integer
        num = Integer.parseInt(numStr);
        System.out.println(num);

    }
}
