package com.syntax.class24;

import java.util.ArrayList;

public class ArrayListDemo4 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Aditi");
        names.add("Prakriti");
        names.add("Robin");
        names.add("Aditya");
        System.out.println(names);
        names.add(0,"Deepa");//we can specify the index and store the elements
        System.out.println(names);
        names.set(0,"Nirmal");//we can replace the element
        System.out.println(names);
        names.toArray();
  //      names.clear();//deletes all the elements from the list

    }
}
