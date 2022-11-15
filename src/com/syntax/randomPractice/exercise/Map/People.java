package com.syntax.randomPractice.exercise.Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class People {
    public static void main(String[] args) {
        Map<String, Integer> employee = new LinkedHashMap<>();
        employee.put("Oscar", 67000);
        employee.put("Robin", 23000);
        employee.put("Sarah", 90000);
        employee.put("Harry", 100000);
        employee.put("Henry", 67000);

        int highest = 0;
        String name = "";

        Map<String,Integer>highestSalaryMap= new HashMap<>();

        Set<Map.Entry<String, Integer>> allInfo = employee.entrySet();
        var iterator = allInfo.iterator();
        while (iterator.hasNext()) {
            var next = iterator.next();
            if (next.getValue() >= highest) {
                highest = next.getValue();

            }

        }
        for(Map.Entry<String,Integer> originalMap:employee.entrySet()){
            if(originalMap.getValue()==highest){
                highestSalaryMap.put(originalMap.getKey(), originalMap.getValue());
            }
        }
        for(Map.Entry<String, Integer>var: highestSalaryMap.entrySet()){
            System.out.println(var.getKey()+" $"+var.getValue());
        //System.out.println(name+" "+highest);
    }

}
    }






