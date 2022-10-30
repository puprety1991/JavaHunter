package com.syntax.class25;

import java.util.ArrayList;

public class WhyWeNeedIterator {
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
        for(int i=0;i<beautyProducts.size();i++){
            if(beautyProducts.get(i).endsWith("r")){
                beautyProducts.remove(i);
            }
        }
        System.out.println(beautyProducts);

    }
}
