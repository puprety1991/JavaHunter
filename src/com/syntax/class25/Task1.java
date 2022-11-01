package com.syntax.class25;

import java.util.ArrayList;

public class Task1 {
    public static void main(String[] args) {
        /*Create an arrayList of words. Remove every word that ends with “e”.*/
        ArrayList<String> word = new ArrayList<>();
        word.add("element");
        word.add("Aeroplane");
        word.add("Java");
        word.add("Piano");
        word.add("Plane");
        var iterator=word.iterator();
        while(iterator.hasNext()){
            String letter = iterator.next();
            if(letter.endsWith("e")){
                iterator.remove();
            }
        }
        System.out.println();
        System.out.println(word);
    }
}
