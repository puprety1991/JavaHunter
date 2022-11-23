package com.syntax.practice;

import java.util.*;

public class Repls218 {
    public static void main(String[] args) {
        List<List<String>>masterList=new LinkedList<>();

        List<String>myList=new ArrayList<>(new ArrayList<>(Arrays.asList("switch","tv","switch","tv","switch","tv","radio","switch")));
        List<String>myList2=new ArrayList<>(new ArrayList<>(Arrays.asList("switch","tv","switch","tv")));
        List<String>myList3=new ArrayList<>(new ArrayList<>(Arrays.asList("switch","tv")));

        masterList.add(myList);
       // masterList.add(myList2);
        //masterList.add(myList3);

        for(List l:masterList){
            printer(countDeviceNames(l));
        }

    }

    public static ArrayList<String> countDeviceNames(List<String> deviceNames) {
        Map<String,Integer> myMap=new LinkedHashMap<>();

        for(String s:deviceNames){
            if(myMap.get(s)==null){
                myMap.put(s,1);
            }else{
                int count=myMap.get(s);
                String s1=s.concat(String.valueOf(count));
                if(myMap.get(s1)!=null){
                    s1=s.concat(String.valueOf(count+1));
                    myMap.put(s1,count++);
                }else{
                    myMap.put(s1,count++);
                }
            }
        }

        ArrayList<String> result=new ArrayList<>();
        result.addAll(myMap.keySet());

        return result;
    }

    public static void printer(List<String> arr){
        System.out.println(arr);
    }

}


