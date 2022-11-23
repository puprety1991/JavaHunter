package com.syntax.review.class12;

import com.syntax.utils.ExcelReader;

import java.io.IOException;

public class ExcelDemo2 {
    public static void main(String[] args) {
        try{
            ExcelReader.read("dkjbfkjdbf");}
        catch (IOException e){
            System.out.println("Please contact our support team at support@syntax.com");
        }
    }
}
