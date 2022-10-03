package com.syntax.replit;

public class Repls131 {
    /*
    Then complete the method by programming the following behavior
    Returns every 3rd letter of the String s,
    starting from the first letter.
    See below examples.
        thirdLetter("hello there") ==> "hltr"
        thirdLetter("technology") ==> "thly"
     */
    static String thirdLetter(String s){
        String store ="";
        for(int i=0;i<s.length();i+=3){
            store+=s.charAt(i);
        }
        return store;
    }

    //test case below (dont change):
    public static void main(String[] args){
        System.out.println(thirdLetter("hello there")); //"hltr"
        System.out.println(thirdLetter("technology")); //"thly"
    }
}
