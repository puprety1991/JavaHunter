package com.syntax.review.class10;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {
    public static void main(String[] args) {
        Map<String,Double>vegList=new LinkedHashMap<>();
        vegList.put("Tomato",3.99);
        vegList.put("Broccoli",5.99);
        vegList.put("Potato",4.99);
        vegList.put("Radish",2.99);
        vegList.put(null,null);
        System.out.println(vegList);

        Set<Map.Entry<String, Double>> collection = vegList.entrySet();
        for(Map.Entry<String,Double>everyVeg:collection){
            System.out.println("Veg: "+everyVeg.getKey()+" and Price: $"+everyVeg.getValue());
        }

    }
}
