package com.syntax.replit;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Repls194 {
    /*Create a method that will remove an element
    based on the specified condition from given List and return new List;
    Output -> [USA, Kazakhstan, Pakistan, Russia]*/
    public static void main(String[] args) {
        List<String> countries = new LinkedList<>();
        countries.add("Armenia");
        countries.add("USA"); //
        countries.add("Kazakhstan");//
        countries.add("Australia");
        countries.add("Pakistan");//
        countries.add("Russia");//
        countries.add("Azerbaijan");
        Iterator<String> it=countries.iterator();
        while(it.hasNext()){
            String country = it.next();
            if(!(country.startsWith("U")||country.startsWith("K")||country.startsWith("P")||country.startsWith("R"))){
                it.remove();
            }
        }
        System.out.println(countries);
    }
}
