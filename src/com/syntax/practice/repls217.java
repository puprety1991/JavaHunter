package com.syntax.practice;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class repls217 {
    public static void main(String[] args) {
        List<Integer>numbers=new LinkedList<>();
        numbers.add(12);
        numbers.add(12);
        numbers.add(3);
        numbers.add(12);
        numbers.add(12);
        numbers.add(12);
        numbers.add(12);
        numbers.add(12);
        System.out.println(countDuplicates(numbers));

    }
    static int countDuplicates(List<Integer>numbers){
        HashSet<Integer>num = new HashSet<>();
        int count =0;
        for(int i=1;i<numbers.size();i++){
            for(int j=0;j<i;j++){
                if(numbers.get(i).equals(numbers.get(j))){
                    count++;
                    break;
                }
            }
        }
        return count;
    }
}
