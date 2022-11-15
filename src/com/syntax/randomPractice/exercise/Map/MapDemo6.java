package com.syntax.randomPractice.exercise.Map;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapDemo6 {
    public static void main(String[] args) {
        Map<String,Double>shopping = new LinkedHashMap<>();
        shopping.put("Monitor",99.99);
        shopping.put("Mouse",19.99);
        shopping.put("Keyboard",39.99);
        shopping.put("Printer",120.99);
        shopping.put("WebCam",59.99);

        double sum = 0;
        Collection<Double> price = shopping.values();
        for(Double priceList:price){
            sum+=priceList;
        }
        System.out.println("Total Purchase: "+sum);
    }
}
