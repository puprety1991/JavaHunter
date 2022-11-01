package com.syntax.Projects.project02;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class practice {
    public static void main(String[] args) {
        LinkedList<Integer> num = new LinkedList<>();
        num.add(111);
        num.add(222);
        num.add(333);
        num.add(444);
        num.add(555);
        num.add(666);
        int sum=0;
        Iterator<Integer> it = num.iterator();
        while(it.hasNext()){
            int number = it.next();
            sum+=number;
        }
        System.out.println("Result of sum is "+sum);
        List<String> countries = new LinkedList<>();
    }
}
