package com.syntax.replit;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Repls212 {
    /*
      Create a method that will not be handling exception and throwing it at caller.
      In main method call method and handle the exception.
          **Expected Output:**
        java.io.FileNotFoundException:  (No such file or directory)
*/
    public static void main(String[] args){
        try{
            String path="/Users/apple/IdeaProjects/SDETBatch14Java/Data/Test.xlsx";
            FileInputStream fileInputStream=new FileInputStream(path(path));
        }catch(FileNotFoundException e){
            System.out.println("java.io.FileNotFoundException:  (No such file or directory)");
        }

    }
    public static String path(String path){
        return path;

    }
}
