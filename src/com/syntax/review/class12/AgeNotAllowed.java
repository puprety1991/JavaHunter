package com.syntax.review.class12;

public class AgeNotAllowed extends RuntimeException{
    AgeNotAllowed(String str){
        super(str);
    }
}
