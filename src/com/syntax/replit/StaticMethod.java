package com.syntax.replit;

public class StaticMethod {
    String consorletter(String word, String letter){
        return word.replaceAll(letter,"*");
    }
    public static void main(String[] args){
        StaticMethod str = new StaticMethod();
        System.out.println(str.consorletter("banana","a"));
        String display = str.consorletter("computer science", "e");
        System.out.println(display);

        StaticMethod str1 = new StaticMethod();
        String displays = str1.consorletter("trick or treat","t");
        System.out.println(displays);

    }
}
//bnn