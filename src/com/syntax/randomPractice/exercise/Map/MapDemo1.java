package com.syntax.randomPractice.exercise.Map;

import java.util.HashMap;
import java.util.Map;

public class MapDemo1 {
    public static void main(String[] args) {
        Map<String,String>map=new HashMap<>();
        map.put("1","Oscar");
        map.put("2","Robin");
        map.put("3","Sarah");
        map.put("4","Omar");
        map.put("5","Sam");
        map.put("6","Sue");

        System.out.println(map.get("5"));
    }
}
