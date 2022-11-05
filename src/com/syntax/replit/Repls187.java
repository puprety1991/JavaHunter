package com.syntax.replit;

import java.util.ArrayList;

public class Repls187 {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("hi");
        words.add("yo");
        words.add("sup");
        words.add("yolo");
        words.add("boop");

        var iterator = words.iterator();
        while(iterator.hasNext()){
            String word = iterator.next();
            if(word.equals("hi")||word.equals("sup")||word.equals("boop")){
                iterator.remove();
            }
        }

        System.out.println(words.get(0)+" "+words.get(1));
    }
}
