package com.syntax.class14;

public class MethodReturns {
    boolean isEven(int number){
        if(number%2==0){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        MethodReturns toCheck = new MethodReturns();
        if(toCheck.isEven(4)){
            System.out.println("Number is Even.");
        }else{
            System.out.println("Number is Odd.");
        }
    }
}
