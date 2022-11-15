package com.syntax.class29;

import com.syntax.utils.ConfigReader;

import java.io.IOException;

public class FileDemo {
    public static void main(String[] args) throws IOException {
       var fileReader= ConfigReader.read("/Users/puskaruprety/eclipse_workplace/JavaBasics/src/com/syntax/utils/ConfigData.properties");
        System.out.println(fileReader.getProperty("URL"));
    }
}
