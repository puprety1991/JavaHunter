package com.syntax.class14;

public class Task {
    public static void main(String[] args) {
        /*
        Create a String that will hold a sentence. Write a program to get a new String without any spaces.
         */
        String str = "we love Java";
        str = str.replaceAll(" ","");
        System.out.println("Task1) "+str);
        /*
        Create a String that should be combination of letters, numbers and special characters.
         Find out how many Alphanumeric(abd AZ 284) characters are there in the String.
         */
        String newString = "FDFDegfg#$#2356$#$";
        String newstring = newString.replaceAll("[^A-z0-9]","");
        System.out.println("Task2) "+newstring.length());
        /*
        You have a String a=”Is it saturday? Is it raining? Do we have a Java Class today?”
       How would you find out how many sentences are in that String?
         */
        String sen = "Is it saturday? Is it raining? Do we have a Java Class today?";
        String[] newfile = sen.split("[?]");
        System.out.println("Task3) "+newfile.length);

        /*
        How would you reverse a String word by word? for example
        input=>This is sentence i want to reverse
        output=>sihT si ecnetnes i tnaw ot esrever
         */
        System.out.println("Task 4)");
        String newSent = "My life is beautiful";
        String[] reversWord = newSent.split(" ");
        for(int i=0; i<reversWord.length;i++){
            for(int j=reversWord[i].length()-1; j>=0;j--){
                System.out.print(reversWord[i].charAt(j));
            }
            System.out.print(" ");


        }
        System.out.println();
             //OR

        StringBuilder st = new StringBuilder();

        for(int k=0; k<reversWord.length;k++){
            String newWord = reversWord[k];
            StringBuilder string = new StringBuilder(newWord);
            string.reverse();
            //reversWord[k] = string.toString();
            System.out.print(string.toString()+" ");
        }
        /*
        palindrome
         */
        System.out.println();
        String msg = "word";
        StringBuilder stringBuilder = new StringBuilder(msg);
        stringBuilder.reverse();
        if(stringBuilder.toString().equals(msg)){
            System.out.println("Task5) The String is Palindrome");
        }else{
            System.out.println("Task5) The String is not Palindrome");
        }
        /*
        How would you swap 2 string without temporary variable
         */
        String str1 = "Python";
        String str2 = "Java";
        str1 = str1+str2;
        str2=str1.replace(str2,"");
        str1=str1.replace(str2,"");
        System.out.println(str1);
        System.out.println(str2);



    }
}
