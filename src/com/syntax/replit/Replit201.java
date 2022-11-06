package com.syntax.replit;

import java.util.HashMap;

public class Replit201 {
    /*
    Create a java.util.Map in which you do not need to preserve the order of the entries. Add below pair to it .
    "Street" = "Patrick ST"
    "Suite" = "265"
    "City" = "Vienna"
    "Zip" = "22180"
    "Country" = "United State"
    Find how many entries are inside the map
    Remove all entires from the Map
      Find the java.util.Map size again
        **Expected Output:**
            5
            0*/
    public static void main(String[] args) {
        HashMap<String, String> addr = new HashMap<>();
        addr.put("Street", "Patrick ST");
        addr.put("Suite", "265");
        addr.put("City", "Vienna");
        addr.put("Zip", "22180");
        addr.put("Country", "United States");
        System.out.println(addr.size());
        addr.clear();
        System.out.println(addr.size());
       // Set<String> allKeys = addr.keySet();

    }
    }