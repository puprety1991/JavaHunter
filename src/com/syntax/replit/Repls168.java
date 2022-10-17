package com.syntax.replit;

public class Repls168 {
    /*
    Create an instance final method that will reverse a String and return that new String
    Call method from the main method
     */
    static final String reverse(){
        String str = "hello";
        String newStr="";
        for(int i=str.length()-1;i>=0;i--){
            newStr +=str.charAt(i);
        }
        return newStr;
    }
    public static void main(String[] args){
        System.out.println(reverse());
    }

}
