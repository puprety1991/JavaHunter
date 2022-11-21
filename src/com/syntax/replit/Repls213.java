package com.syntax.replit;

public class Repls213 {
    /*Create a method that will do temperature check. Anytime user passes temperture that is below 32 method should throw an Exception saying "It is freezing"
      In Main method call the method and handle an Exception
      **Expected Output:**
     java.lang.RuntimeException: It is freezing*/
    public static String toCheck(int temp){
        if(temp<32){
            throw new RuntimeException("It is freezing");

        }else{
            return"It is not freezing";
        }
    }
    public static void main(String[] args){
        try{
            System.out.println(toCheck(31));
        }catch(RuntimeException e){
            System.out.println(e);
        }
    }
}
