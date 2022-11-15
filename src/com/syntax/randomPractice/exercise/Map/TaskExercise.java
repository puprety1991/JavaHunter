package com.syntax.randomPractice.exercise.Map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class TaskExercise {
    /*Crate a map  of Best Buy store. Place item id and item name into it.
    Example (7664847=Printer,7879885=TV etc).
    Retrieve all keys and values from a Best Buy Map using EntrySet.*/
    public static void main(String[] args) {
        Map<Integer,String>stock = new LinkedHashMap<>();
        stock.put(7664847,"Printer");
        stock.put(7879885,"TV");
        stock.put(7665789,"Go Pro");
        stock.put(7566831,"Drone");
        stock.put(7267856,"SLR Camera");
        Set<Map.Entry<Integer, String>> allInfo = stock.entrySet();
        for (Map.Entry<Integer, String>each:allInfo){
            System.out.println("Keys: "+each.getKey()+", Values: "+each.getValue());
        }

    }

}
