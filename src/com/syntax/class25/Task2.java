package com.syntax.class25;

import java.util.ArrayList;

public class Task2 {
    public static void main(String[] args) {
       /* Create an arrayList of drinks. If any drink has letter āaā or āeā replace it with water.*/
        ArrayList<String>drink = new ArrayList<>();
        drink.add("coke");
        drink.add("coco");
        drink.add("sprite");
        drink.add("coca");
        drink.add("lemonade");
        int counter=0;
        var iterator = drink.iterator();
        while(iterator.hasNext()) {
            String item = iterator.next();
            if(item.contains("a")||(item.contains("e"))) {
                drink.set(counter,"water");
            }
            counter++;
        }
        System.out.println(drink);
        }
    }

