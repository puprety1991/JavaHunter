package com.syntax.randomPractice.exercise.Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapDemo2 {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();

        map.put("1","Oscar");
        map.put("2","Robin");
        map.put("3","Sarah");
        map.put("4","Omar");
        map.put("5","Sam");
        map.put("6","Sue");

        System.out.println(map);
        Map<String,String> linkedHashMap = new LinkedHashMap<>();

        linkedHashMap.put("2","Robin");
        linkedHashMap.put("3","Sarah");
        linkedHashMap.put("1","Oscar");
        linkedHashMap.put("5","Sam");
        linkedHashMap.put("6","Sue");
        linkedHashMap.put("4","Omar");
        System.out.println(linkedHashMap);
    }
}
