package com.syntax.class28;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class fileDemo {
    public static void main(String[] args) throws IOException {
           /*
        rightclick on your file and click copypathreference then click from Content root
         */
        var path="/Users/puskaruprety/eclipse_workplace/JavaBasics/src/com/syntax/utils/ConfigData.properties"; //location of the file
        var fileInputStream=new FileInputStream(path); //it helps us Navigate to the file
        var properties=new Properties(); // that special software which helps us read data from that file
        properties.load(fileInputStream); //loads all the data from the file inside(Memory)
        System.out.println(properties.getProperty("URl"));
        System.out.println(properties.getProperty("password"));
    }
}
