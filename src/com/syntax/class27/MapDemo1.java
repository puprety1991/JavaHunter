package com.syntax.class27;

import java.util.HashMap;

public class MapDemo1 {
    public static void main(String[] args) {
        HashMap<String,Double>fruit=new HashMap<>();
        fruit.put("Orange",1.99);
        fruit.put("Apple",2.49);
        fruit.put("Lemon",2.99);
        fruit.put("Kiwi",2.19);
        fruit.put("Mango",3.99);
        System.out.println(fruit);
        System.out.println(fruit.get("Lemon"));
        fruit.remove("Lemon");
        System.out.println(fruit);
        System.out.println(fruit.containsKey("Orange"));//tells us if a key present inside the map or not
        System.out.println(fruit.containsValue(1.99));//searches the map for this given value
        System.out.println(fruit.isEmpty());
        fruit.replace("Apple",5.99);
        System.out.println(fruit);
    }
}
