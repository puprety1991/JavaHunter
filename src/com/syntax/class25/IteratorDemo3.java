package com.syntax.class25;

import java.util.ArrayList;

public class IteratorDemo3 {
    public static void main(String[] args) {
        //delete all the products which starts with letter B or end with letter a
        ArrayList<String> cosmetics = new ArrayList<>();
        cosmetics.add("Dove Soap");
        cosmetics.add("Conditioner");
        cosmetics.add("Shampoo");
        cosmetics.add("Lotion");
        cosmetics.add("Mascara");
       // Iterator<String> iterator = cosmetics.iterator();
        cosmetics.removeIf(letter -> letter.startsWith("B") || letter.startsWith("a"));
        System.out.println(cosmetics);

                    //OR
       /* while(iterator.hasNext()){
            String  letter= iterator.next();
            if(letter.startsWith("B")|| letter.startsWith("a")){
                iterator.remove();
            }*/

    }
}
