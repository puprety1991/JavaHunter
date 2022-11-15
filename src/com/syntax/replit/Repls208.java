package com.syntax.replit;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Repls208 {
    static void  display(Map<String,Integer> shop) {
        Set<Map.Entry<String, Integer>> shopping = shop.entrySet();
        if (!shopping.isEmpty()) {
            var iterator = shopping.iterator();
            while (iterator.hasNext()) {
                var eachShop = iterator.next();
                System.out.println(eachShop.getKey() + " : " + eachShop.getValue());

            }
        } else {
            System.out.println("map is empty");
        }
    }
    public static void main(String[] args) {
        Map<String, Integer>map=new HashMap<>();
        map.put("mango", 10);
        map.put("apple", 30);
        map.put("orange", 20);

        display(map);
        map.clear();
        display(map);
}
}
