package com.syntax.class13;

public class Task1 {
    public static void main(String[] args) {
        /*
        How would you reverse a String word by word? for example
        // input=>This is sentence i want to reverse
        // output=>sihT si ecnetnes i tnaw ot esrever

         */
        String str = "Life is beautiful";
        int j;
        String[] arr = str.split(" ");
        String reversSent="";
        for(int i = 0; i<arr.length;  i++){
            String arr1 = arr[i];
            String reverse = "";
            for(j=arr1.length()-1; j>=0; j--){
                reverse+=arr1.charAt(j);
            }
            reversSent+=reverse+" ";
        }
        System.out.println("Task4) "+str+" --> "+reversSent);
                      //OR
        for(int k=0; k<arr.length; k++){
            for(int m=arr[k].length()-1; m>=0; m--){
                System.out.print(arr[k].charAt(m));
            }
            System.out.print(" ");
        }
        System.out.println();
        System.out.println("************************");
        //How would you check if String is palindrome or not? aba=> true
        //Abbc =>false
        String file = "anna";
        String rev = "";
        char[] newArray = file.toCharArray();
        for(int i=newArray.length-1; i>=0; i--){
            rev+=newArray[i];
        }
        if(file.equals(rev)){
            System.out.println("Task5) "+file+" is Palindrome");
        }else{
            System.out.println("Task5) "+file+ " Sorry, it is not Palindrome");
        }
        System.out.println("************************");
        //How would you swap  2 strings without a temporary variable?
        System.out.println("Task6) ");
        String str1 = "Life";
        String str2 = "Beautiful";
        System.out.println("str1: "+str1);
        System.out.println("str2: "+str2);

        str1 = str1+str2;  // LifeBeautiful
        System.out.println("-->After Swap<--");

        str2=str1.substring(0,str1.length()-str2.length());
        str1 = str1.substring(str2.length());
        System.out.println("str1: "+str1);
        System.out.println("str2: "+str2);

    }
}

