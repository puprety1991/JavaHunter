package com.syntax.class28;

import java.util.HashMap;
import java.util.Map;

public class Task1 {
   /*
    Create a map of a building. Store floor number and it is associated company name.
    (Example: 1= Google, 2=Syntax etc..). Insert 7 entries with duplicate keys and values.
    Check how many entries you have?
    Update company on a 4th floor
    Remove company on the 7th floor
    Print your map
    */
   public static void main(String[] args) {
       Map<Integer, String>building=new HashMap<>();
       building.put(1,"Google");
       building.put(2,"Syntax");
       building.put(3,"Microsoft");
       building.put(4,"Apple");
       building.put(5,"Amazon");
       building.put(6,"Walmart");
       building.put(7,"NuCamp");
       building.put(7,"NuCamp");
       building.replace(4,"Kohl's");
       building.remove(7);
       System.out.println(building);



   }
}
