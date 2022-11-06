package com.syntax.randomPractice.exercise.Map;

import java.util.*;

public class MapDemo5 {
    public static void main(String[] args) {
        HashMap<String,Double> fruit=new HashMap<>();
        fruit.put("Orange",1.99);
        fruit.put("Apple",1.49);
        fruit.put("Lemon",2.99);
        fruit.put("Kiwi",2.19);
        fruit.put("Mango",3.99);
        Set<Map.Entry<String, Double>> entrySet = fruit.entrySet();
        var iterator=entrySet.iterator();


    }
}
