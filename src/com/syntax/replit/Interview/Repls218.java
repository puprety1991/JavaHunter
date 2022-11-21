package com.syntax.replit.Interview;

import java.util.LinkedList;
import java.util.List;

public class Repls218 {
    /*  Count the number of repeatation of words in an ArrayList append that count and return that list.
  You need to implement a function countDeviceNames that takes an ArrayList as an input and returns an ArrayList
  input ["switch","tv","switch","tv","switch","tv"]
  output [switch, tv, switch1, tv1, switch2, tv2]
  In this example as word switch is repeated we pick the next entry
  where it is repeated and append the count i.e how many times that
  word was present previously
  More Exmaples
  input ["switch","tv","switch","tv","switch","tv","radio"]
  output [switch, tv, switch1, tv1, switch2, tv2, radio]
  input ["switch","tv","switch","tv"]
  output [switch, tv, switch1, tv1]
  if words are not repeated we get the same output
  input ["switch","tv"]
  output [switch, tv]*/
    public static void main(String[] args) {
        List<String>name=new LinkedList<>();
        name.add("switch");
        name.add("tv");
        name.add("switch");
        name.add("tv");

        List<String> listWord = countDeviceNames(name);
        System.out.println(listWord);
    }

    public static List<String> countDeviceNames(List<String> deviceNames) {
        
        String replaceWord = null;
        var iterator = deviceNames.iterator();
        var iterator1 = deviceNames.iterator();

        int count=0;
       // int counter=0;

        while(iterator.hasNext()){
            var word = iterator.next();
            while(iterator1.hasNext()){

                var word1 = iterator1.next();
                if(word.equals(word1)){
                    count++;
                    replaceWord = word1 + count;
                    
                }

            }
            deviceNames.set(count,replaceWord);

            count=0;
        }
        return deviceNames;
    }
}

