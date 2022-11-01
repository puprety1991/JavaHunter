package com.syntax.randomPractice.exercise.Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Dmo1Iterator {
    public static void main(String[] args) {
        ArrayList<Double> doubleArrayList=new ArrayList<>();
        doubleArrayList.add(18.92);
        doubleArrayList.add(23.49);
        doubleArrayList.add(32.63);
        doubleArrayList.add(3.49);
        doubleArrayList.add(8.63);

        Iterator<Double> iterator = doubleArrayList.iterator();
        while (iterator.hasNext()){
            double num = iterator.next();
            if(num<20){
                iterator.remove();
            }
        }
    }
}
