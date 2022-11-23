package com.syntax.replit.Interview;

import java.util.*;

public class Repls218s {
    public static void main(String[] args) {
        List<List<String>>masterList=new LinkedList<>();

        List<String>myList=new ArrayList<>(new ArrayList<>(Arrays.asList("switch","tv","switch","tv","switch","tv","radio")));
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
        int count;
        String s1="";
        String str="";
        for(String s:deviceNames){
            if(myMap.get(s)==null){
                myMap.put(s,1);
            }else{
                int i=1;
                s1=s+i;
                if(str.contains(s1)){
                    Integer counter = myMap.get(s);
                    System.out.println(counter);
                    i++;
                    s1=s+i;
                    myMap.put(s1,i);
                }else{
                    s1=s+i;
                    myMap.put(s1,i );
                    str+=s1;

                }
            }
        }

        ArrayList<String>result=new ArrayList<>();
        result.addAll(myMap.keySet());

        return result;
    }

    public static void printer(List<String>arr){
        //System.out.println(arr);
    }
}
