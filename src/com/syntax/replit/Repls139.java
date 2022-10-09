package com.syntax.replit;

public class Repls139 {
    /*
    Create a method that will be available to all classes in your project with following specifications:
    Returns: a String
    Name: alphabetical
    Parameters: a String called str
    Purpose: Return a string that is composed of each letter as long as the letter is later on in the alphabet
    than its previous one.  You can assume actual parameters are lowercase.See below examples.
    Additional Info:
        You can use < and > to compare characters (not Strings), where characters later on in the alphabet are "greater".
          Examples:
            'a' < 'b' ==> True
            'a' < 'a' ==> False
            'a' > 'b' ==> False
        Examples:
            alphabetical("hello") ==> "hlo"
            alphabetical("software") ==> "stwr"
            alphabetical("language") ==> "lnug"
    **Expected Output:**
        hlo
        stwr
        lnug
     */
   String  alphabetical(String str) {
           String result="";
       //System.out.println(str.length());==> print 8 for the software
           for(int i=0;i<str.length()-1;i++) {
               if(i==0){
                  result+=str.charAt(i);                          //length of software = 8 (8-1)=7
                                                                 // 0-s, 1-o, 2-f, 3-t, 4-w, 5-a, 6-r, 7-e
                   }if(str.charAt(i+1)>str.charAt(i)){          //i =0-s,
                       result = result + str.charAt(i+1);       // i+1=
                   }
               }                                                        //116>102-true

           return result;
       }
        public static void main(String[] args){
            Repls139 main = new Repls139();
            System.out.println(main.alphabetical("hello"));
            System.out.println(main.alphabetical("software"));
            System.out.println(main.alphabetical("language"));


        }
}
