package com.syntax.review.class12;

public class ExceptionDemo1 {
    public static void main(String[] args) throws AgeNotAllowed {
        int age=15;
        if(age<18){
            throw new AgeNotAllowed("Only Adults are allowed");
        }
    }
}
