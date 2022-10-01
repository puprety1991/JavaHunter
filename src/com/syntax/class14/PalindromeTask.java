package com.syntax.class14;

public class PalindromeTask {
    /*
    Create a method that will print whether given String is palindrome or not.
     */
    boolean palidrome(String word){
        String reverse = "";
        for(int i=word.length()-1;i>=0; i--){
            reverse+=word.charAt(i);
        }
        if(reverse.equals(word)){
            return true;
        }else{
            return false;
        }

    }

    public static void main(String[] args) {
        PalindromeTask toCheck = new PalindromeTask();
        if(toCheck.palidrome("anna")){
            System.out.println("This is palindrome");
        }else{
            System.out.println("This is not a palindrome");
        }
    }
}
