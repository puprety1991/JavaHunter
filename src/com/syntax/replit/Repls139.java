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
        lnug   result=result+charAt(i)
     */
   String  alphabetical(String str) {
           String result="";
       //System.out.println(str.length());==> print 8 for the software
           for(int i=0;i<str.length()-1;i++) {
               if(i==0){
                  result+=str.charAt(i);//result= h
                   }if(str.charAt(i+1)>str.charAt(i)){//charAt(2)>charAt(1)
                       result = result + str.charAt(i+1);//result=h+l=hl
                   }
               }
                                                            // str= hello->5--0h-e1-
//3>2

           return result;
       }
        public static void main(String[] args){
            Repls139 main = new Repls139();
            System.out.println(main.alphabetical("hello"));
            System.out.println(main.alphabetical("software"));
            System.out.println(main.alphabetical("language"));



        }
}
/// hello->5
