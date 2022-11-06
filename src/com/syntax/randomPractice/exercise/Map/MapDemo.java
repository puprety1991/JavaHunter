package com.syntax.randomPractice.exercise.Map;

import java.util.LinkedHashMap;

public class MapDemo {
    public static void main(String[] args) {
        LinkedHashMap<Integer,String> emp=new LinkedHashMap<>();
        emp.put(111,"Oscar");
        emp.put(121,"Sarah");
        emp.put(131,"Paul");
        emp.put(141,"Anna");
        emp.put(151,"Sam");
        System.out.println(emp);
        emp.replace(111,"Sameer");
        System.out.println(emp);
    }
}
