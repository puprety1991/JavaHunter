package com.syntax.review.class12;

import com.syntax.utils.ConfigReader;

import java.io.IOException;

public class ExceptionDemos {
    public static void main(String[] args) {
        try {
            ConfigReader.read("skjdbfjsdhbf");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("important line of code");
    }
}
