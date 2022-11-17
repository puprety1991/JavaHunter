package com.syntax.replit;

import java.util.HashMap;

public class Repls208WithMethod {
    public static void main(String[] args){
        HashMap<String, Integer> map=new HashMap<>();
        map.put("mango", 10);
        map.put("apple", 30);
        map.put("orange", 20);
        Display(map);
        map.clear();
        Display(map);
    }

    public static void Display(HashMap<String, Integer> map){

        if (map.isEmpty()){
            System.out.println("map is empty");
        } else{
            var entrySet=map.entrySet();
            for (var entry:entrySet){
                var value=entry.getValue();
                var key=entry.getKey();
                System.out.println(key+":"+value);
            }
        }}

}

