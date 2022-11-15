package com.syntax.class28;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class Task2 {
   /* Create a map of countries with its capital that will store countries in alphabetical order.
    Print all keys and values from a country map using for each loop and iterator.
    Print all values from a country map using for each loop and iterator.*/
    public static void main(String[] args) {
        Map<String,String>countries = new TreeMap<>();
        countries.put("USA","Washington");
        countries.put("Nepal","Kathmandu");
        countries.put("Bhutan","Thimpu");
        countries.put("United Kingdom","London");
        countries.put("India","Delhi");
        countries.put("Bangladesh","Dhaka");
        System.out.println("----> Keys & Values <----");
        countries.forEach((k,v) -> System.out.println("Keys: "+k+" -> Values: "+v));
        System.out.println();
        Iterator<Map.Entry<String, String>> iterator = countries.entrySet().iterator();
        while(iterator.hasNext()){
            var country = iterator.next();
            System.out.println("Keys: "+country.getKey()+" -> Values: "+country.getValue());
        }
        System.out.println("----> Values <----");
        countries.forEach((k,v) -> System.out.println("Values: "+v));
        System.out.println();
        Iterator<String> iterator1 = countries.values().iterator();
        while(iterator1.hasNext()){
            var country = iterator1.next();
            System.out.println("Values: "+country);
        }


    }
}
