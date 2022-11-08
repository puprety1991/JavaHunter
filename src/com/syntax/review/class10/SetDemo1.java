package com.syntax.review.class10;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo1 {
    public static void main(String[] args) {
        //we want to sort and remove duplicates from an ArrayList
        ArrayList<Integer>number=new ArrayList<>();
        number.add(10000);
        number.add(19000);
        number.add(10000);
        number.add(10400);
        number.add(14000);
        number.add(10300);
        number.add(16000);
        //converts the Arraylist to TreeSet
        Set<Integer>num= new TreeSet<>(number);
        number.clear();
        number.addAll(num);
        System.out.println(number);
        ArrayList<Integer>numb=new ArrayList<>(num);
        System.out.println(numb);

    }
}
