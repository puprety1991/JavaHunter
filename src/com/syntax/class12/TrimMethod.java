package com.syntax.class12;

public class TrimMethod {
    public static void main(String[] args) {
        String str = " I love java ";
        //Remove the space before and after the
        //String but not ones which are present in berween
        System.out.println(str.trim().length());
    }
}
