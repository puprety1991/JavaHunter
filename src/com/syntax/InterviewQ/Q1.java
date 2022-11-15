package com.syntax.InterviewQ;

import java.util.LinkedHashMap;
import java.util.Map;

public class Q1 {
    //Create a method that returns a map of characters and their count in a String
    public static void main(String[] args) {
        String str = "welcometosyntaxtechnologies";
        System.out.println(getCount(str));

    }
    public static Map<Character,Integer> getCount(String str){
        char[] charArr = str.toCharArray();
        Map<Character,Integer>map=new LinkedHashMap<>();
        for(char c:charArr){
            if(map.get(c)==null){
                map.put(c,1);
            }else{
                int count = map.get(c);
                count++;
                map.put(c,count);
            }
        }
        return map;
    }
}
