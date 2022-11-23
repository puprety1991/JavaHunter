package com.syntax.review.class12;

import com.syntax.utils.ExcelReader;

import java.io.IOException;

public class ExceptionDemo {
    public static void main(String[] args) {
        try {
            ExcelReader.read("jfkdfjdkfjdkf");
        } catch (IOException e) {
            throw new RuntimeException(e);
           // e.printStackTrace();
        }
    }
}
//