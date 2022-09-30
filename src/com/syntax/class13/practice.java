package com.syntax.class13;

public class practice {
    public static void main(String[] args) {
        System.out.println("Task6) ");
        String str1 = "chop";
        String str2 = "non";
        System.out.println("str1: "+str1);
        System.out.println("str2: "+str2);

        str1 = str1+str2;  // LifeBeautiful
        System.out.println("-->After Swap<--");

        str2=str1.substring(0,str1.length()-str2.length());
        str1 = str1.substring(str2.length());



        System.out.println("str1: "+str1);
        System.out.println("str2: "+str2);
    }

}
