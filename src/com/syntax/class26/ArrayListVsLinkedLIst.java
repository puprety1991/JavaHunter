package com.syntax.class26;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListVsLinkedLIst {
    public static void main(String[] args) {
        LinkedList<String>linkedList=new LinkedList<>();
        long startTime=System.currentTimeMillis();
        for(int i=0; i<1000000;i++){
            linkedList.add(0,"Test");
        }
        long endTime=System.currentTimeMillis();
        System.out.println("LinkedList: "+(endTime-startTime));

        ArrayList<String> ArrayList=new ArrayList<>();
        long startTime1=System.currentTimeMillis();
        for(int i=0; i<1000000;i++){
            ArrayList.add(0,"Test");
        }
        long endTime1=System.currentTimeMillis();
        System.out.println("ArrayList: "+(endTime1-startTime1));

    }
}
