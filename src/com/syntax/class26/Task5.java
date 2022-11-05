package com.syntax.class26;

import java.util.LinkedHashSet;

public class Task5 {
    /*Create a Set of cities in which you want to make sure that
    insertion order is maintained. Then remove any city that starts with “A”;*/
    public static void main(String[] args) {
        LinkedHashSet<String> cities=new LinkedHashSet<>();
        cities.add("Gainesville");
        cities.add("Ashburn");
        cities.add("Adele");
        cities.add("Manassas");
        cities.add("Fairfax");
        cities.add("Vienna");
        System.out.println(cities);
        //remove the city starts with 'A'
        var iterator = cities.iterator();
        while(iterator.hasNext()){
            var city=iterator.next();
            if(city.startsWith("A")){
                iterator.remove();
            }
        }
        System.out.println("---> After remove <---");
        System.out.println(cities);
    }
}
