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
           int j=1;
           for(int i=0;i<str.length()-1;i+=2) {
               if(j<str.length()){
                   if ((str.charAt(i) > str.charAt(j))||(str.charAt(i) == str.charAt(j))) {
                       result = result + str.charAt(i);
                       j+=2;

                   }else if(str.charAt(j) > str.charAt(i)) {
                       result = result + str.charAt(j);
                       j += 2;
                   }
               }

           }
           return result;
       }
        public static void main(String[] args){
            Repls139 main = new Repls139();
            String output = main.alphabetical("hello");
            System.out.println(output);

            Repls139 main1 = new Repls139();
            String output1 = main.alphabetical("software");
            System.out.println(output1);

            Repls139 main2 = new Repls139();
            String output2 = main.alphabetical("language");
            System.out.println(output2);

        }
}
