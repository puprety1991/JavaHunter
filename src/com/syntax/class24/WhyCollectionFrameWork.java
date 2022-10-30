package com.syntax.class24;

import java.util.ArrayList;

public class WhyCollectionFrameWork {
    public static void main(String[] args) {
        /*
        If we have to store a single value we should use variables
        */
        String name="Prakriti";
        String name1 ="Puskar";
        /*
        If we have to store more than 2 values of same kind then
        we should go with arrays
         */
        System.out.println(name1);
         String[] names={"Omar","Robin","Prashuv"};
         /*
         fixed in size
          */
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Green");
        colors.add("Red");
        colors.add("Yellow");
        System.out.println(colors.contains("Green"));
        System.out.println(colors);

    }
}
