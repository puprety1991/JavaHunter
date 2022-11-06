package com.syntax.replit;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Repls205 {
    public static void main(String[] args){
        HashMap<String,String> addr=new HashMap<>();
        addr.put("Street","Patrick ST");
        addr.put("Suite","265");
        addr.put("City","Vienna");
        addr.put("Zip","22180");
        addr.put("Country","United States");
        Set<Map.Entry<String, String>> info = addr.entrySet();
        for(Map.Entry<String,String>data:info){
            System.out.println(data.getValue().toUpperCase());
        }


    }
}
