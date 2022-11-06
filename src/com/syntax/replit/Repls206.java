package com.syntax.replit;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Repls206 {
    public static void main(String[] args){
        HashMap<String,String> map=new HashMap<>();
        map.put("ONE","AAA");
        map.put("TWO","BBB");
        map.put("THREE","CCC");
        map.put("FOUR","DDD");
        map.put("FIVE","EEE");
        Set<Map.Entry<String, String>> info = map.entrySet();
        System.out.println("HashMap Before Remove :");
        for(Map.Entry<String,String>data:info){
            System.out.println(data.getKey()+" : "+data.getValue());
        }
        map.remove("ONE");
        map.remove("FOUR");
        Set<Map.Entry<String, String>> infos = map.entrySet();
        System.out.println("------------------");
        System.out.println("HashMap After Remove :");
        for(Map.Entry<String,String>data:infos){
            System.out.println(data.getKey()+" : "+data.getValue());
        }

    }
}
