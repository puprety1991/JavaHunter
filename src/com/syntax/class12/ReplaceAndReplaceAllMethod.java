package com.syntax.class12;

public class ReplaceAndReplaceAllMethod {
    public static void main(String[] args) {
        String str = "Batch 14 is good 343434%$%$^%^DFDFrgfdfd";
        /*
        1) replace method: replaces one String with another in a String
        2) replaceAll method: it takes a pattern and replace all the characters that follow that pattern
         */
        System.out.println(str.replace("good","Excellent"));
        System.out.println(str.replaceAll("[a-z]",""));//it won't show any lower case letters
        System.out.println(str.replaceAll("[^a-z]",""));//it will show only lower case letters
    }
}
