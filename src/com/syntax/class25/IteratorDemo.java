package com.syntax.class25;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {
    public static void main(String[] args) {
        ArrayList<String> beautyProducts = new ArrayList<>();
        beautyProducts.add("Blush");
        beautyProducts.add("Base");
        beautyProducts.add("Conceal");
        beautyProducts.add("Mascara");
        beautyProducts.add("eyeLinear");
        System.out.println("Conditioner");
        beautyProducts.add("Lipstick");
        beautyProducts.add("Dove Soap");
        beautyProducts.add("Conditioner");
        beautyProducts.add("Shampoo");
        beautyProducts.add("Lotion");
        System.out.println("Conditioner");

        // get the iterator from the list
        Iterator<String> iterator = beautyProducts.iterator();
        /*iterator.hasNext();
        iterator.next();
        iterator.hasNext();
*/
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
