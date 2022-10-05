package com.syntax.replit;

public class Repls134 {
    /*
    count the number of vowels in the string s.
     Assume s is all lowercase.
     */
    static int countVowels(String s){
        int count=0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == 'a'){
                count++;//3
            }if(s.charAt(i) == 'e'){
                count++;
            }if(s.charAt(i) == 'i'){
                count++;
            }if(s.charAt(i) == 'o'){
                count++;//1
            }if(s.charAt(i) == 'u'){
                count++;
            }

        }
        return count;
    }

    //test case below (dont change):
    public static void main(String[] args){
        System.out.println(countVowels("obama")); //3
        System.out.println(countVowels("happy friday! i love weekends")); //9
    }
}
