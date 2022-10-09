package com.syntax.replit;

public class Repls140 {
    /*
    Create the maxLength method that will accept String array of words and return the word with the largest length.
    Method should be visible only within same package!
    **Expected Output:**
        this is long
     */
    static String maxLength(String[] word){
        int maxLen = 0;
        String store = "";
        for(int i=0;i<word.length;i++){
            if(word[i].length()>maxLen){
                store =word[i];
            }
        }
        return store;
    }
    public static void main(String[] args) {
        String[] arr = {"hey","yolo","hi","this is long"};
        System.out.println(maxLength(arr));
        //should print "this is long"


    }
}
