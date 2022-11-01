package com.syntax.class25;

import java.util.ArrayList;
import java.util.Iterator;


public class IteratorNextIssue {
    public static void main(String[] args) {
        ArrayList<String> beautyProducts = new ArrayList<>();
        beautyProducts.add("Blush");
        beautyProducts.add("Base");
        beautyProducts.add("Conceal");
        beautyProducts.add("Mascara");
        beautyProducts.add("eyeLinear");
        beautyProducts.add("Lipstick");
        beautyProducts.add("Dove Soap");
        beautyProducts.add("Conditioner");
        beautyProducts.add("Shampoo");
        beautyProducts.add("Lotion");
        System.out.println("Conditioner");

        Iterator<String> iterator = beautyProducts.iterator();
        System.out.println(beautyProducts.size());
        while (iterator.hasNext()){
            System.out.println(iterator.next());
            System.out.println(iterator.next());
            }

        System.out.println(beautyProducts);

        // if we have odd number of element, did the twice next it will show error.
        //if it is an even number of elements, did the twice next it won't show any errors
        }

    }

