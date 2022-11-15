package com.syntax.review.class11;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileDemo1 {
    public static void main(String[] args) throws IOException {
        /*
         We want to have a method that can help us read data from properties file
         this method should be available to any other class in project and once we pass
         key it should give us its value
         */
        System.out.println(getProperty("Username"));

    }
    public static String getProperty(String key) throws IOException {
        String path=System.getProperty("user.dir")+"/"+"utils"+"/"+"ConfigData.properties";
        FileInputStream file = new FileInputStream(path);
        Properties properties = new Properties();
        properties.load(file);
        return properties.getProperty(key);
    }
}
