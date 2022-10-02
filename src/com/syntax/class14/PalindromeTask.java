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
        if(reverse.equalsIgnoreCase(word)){
            return true;
        }else{
            return false;
        }
    }
                //using void behaviour
    void isPalindrome(String name){
        name = name.toLowerCase();//if we convert to lower it will save in name
        StringBuilder word = new StringBuilder(name);
        word.reverse();
        if(name.equals(word.toString())){
            System.out.println(name+ " is palindrome");
        }else{
            System.out.println(name+" is not palindrome");
        }
    }
    public static void main(String[] args) {
        PalindromeTask toCheck = new PalindromeTask();
        if(toCheck.palidrome("Anna")){
            System.out.println("This is palindrome");
        }else{
            System.out.println("This is not a palindrome");
        }
                    //calling from void
        toCheck.isPalindrome("AbA");
    }
}
