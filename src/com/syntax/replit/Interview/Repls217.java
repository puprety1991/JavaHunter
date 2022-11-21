package com.syntax.replit.Interview;

import java.util.ArrayList;
import java.util.List;

public class Repls217 {


    public static void main(String[] args ){
        List<Integer>number=new ArrayList<>();
        number.add(5);
        number.add(5);
        number.add(3);
        number.add(2);
        number.add(5);

        System.out.println(countDuplicates(number));
    }
    public static int countDuplicates(List<Integer> numbers){
        var iterator=numbers.iterator();
        var iterator1=numbers.iterator();
        int count=0;
        while(iterator.hasNext()){
            var number= iterator.next();
            while(iterator1.hasNext()){
                var number1 = iterator1.next();
                if(number.equals(number1)){
                    count++;
            }

            }
        }
        return count;
    }
}
