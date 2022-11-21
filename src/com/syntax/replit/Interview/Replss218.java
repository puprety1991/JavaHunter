package com.syntax.replit.Interview;

import java.util.LinkedList;
import java.util.List;

public class Replss218 {
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
        List<String> name=new LinkedList<>();
        name.add("switch");
        name.add("tv");
        name.add("switch");
        name.add("switch");
        name.add("tv");

        List<String> listWord = countDeviceNames(name);
        System.out.println(listWord);
    }

    public static List<String> countDeviceNames(List<String> deviceNames) {
        String previousWord = "";

        for(int i=0;i<deviceNames.size();i+=2){
            for(int j=i+1;j<deviceNames.size();j++){
                if(deviceNames.get(i).equals(deviceNames.get(j))){
                    if(!previousWord.contains(deviceNames.get(i))){
                        String set = deviceNames.set(j, deviceNames.get(j)+j);
                        previousWord+=deviceNames.get(i);
                        System.out.println(j);

                }else {
                        deviceNames.add(deviceNames.get(i));

                    }}
            }
        }
        return deviceNames;
    }
}
