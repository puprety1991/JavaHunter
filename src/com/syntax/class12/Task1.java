package com.syntax.class12;

public class Task1 {
    public static void main(String[] args) {
        /*
        Create a String and if the String is not empty perform the following:
        if the String has an odd number of characters and has 3 or more characters,
        print the character in the middle of the String.
         */
        String word = "Japan";
        if(word.isEmpty()) {
            System.out.println("It is an empty String");
        }
        else if(word.length()%2==0){
            System.out.println("It is an even number of Characters");

        }else{
                if(word.length()>3){
                    System.out.println("The middle character of '"+word+"' is: "+word.charAt(word.length()/2));
                }else{
                    System.out.println("It is less than 3 characters");
                }

        }
              //OR
        String str="hello";
        int length=str.length();
        if(!str.isEmpty() && length%2!=0 && length>=3) {

            int middleIndex=length/2;
            System.out.println("The middle character of '"+str+"' is: "+str.charAt(middleIndex));
       }

        /*
        Create a String and print it in reverse order (Sunday → yadnuS).
         */
        String day ="Monday";
        char[] days = day.toCharArray();
        String reverse = "";
        for(int i=days.length-1; i>=0; i--){
            reverse+=days[i];

        }
        System.out.println(day+" -> "+reverse);
                //OR
        String str1 = "yadnuS";
        System.out.print(str1+" -> ");
        for(int j=str1.length()-1; j>=0; j--){
            System.out.print(str1.charAt(j));
        }

    }
}
