package com.syntax.replit;

public class Repls133 {
    /*
    count the number of occurrences of 'a' or 'A' within s
     */
    static int countA(String s){
        int count = 0;
        for(int i=0; i<s.length();i++){
            if(s.charAt(i) == 'a'){
                count++;
            }if(s.charAt(i) == 'A'){
                count++;
            }
        }

        return count;
    }

    //test case below (dont change):
    public static void main(String[] args){
        System.out.println(countA("aaA")); //3
        System.out.println(countA("aaBBdf8k3AAadnklA")); //6
    }
}
