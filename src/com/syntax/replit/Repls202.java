package com.syntax.replit;

import java.util.Collection;
import java.util.Set;
import java.util.TreeMap;

public class Repls202 {
    public static void main(String[] args) {
        TreeMap<String,String> fruits=new TreeMap<>();
        fruits.put("1 item","apple");
        fruits.put("2 item","banana");
        fruits.put("3 item","pear");
        fruits.put("4 item","tomato");
        fruits.put("5 item","mango");
        fruits.put("6 item","kiwi");
        Set<String> allKeys=fruits.keySet();
        Collection<String> allValues=fruits.values();
        System.out.println(allKeys+" "+allValues);
        var iterator=allKeys.iterator();
        var it = allValues.iterator();
        while(iterator.hasNext()){
            while ((it.hasNext())){
                var key=iterator.next();
                var value=it.next();
                System.out.println("Key is "+key+" and values is "+value);
            }
        }

    }
}
