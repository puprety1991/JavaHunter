package com.syntax.randomPractice.exercise.Collection;

import java.util.LinkedList;

public class LinkedLIstDemo {
    public static void main(String[] args) {
        LinkedList<String>cities=new LinkedList<>();
        cities.add(("Tampa"));
        cities.add(("Gainesville"));
        cities.add(("Manassas"));
        cities.add(("Fairfax"));
        cities.add(("Vienna"));

        cities.addFirst("Tyson Corner");//linked list extra method
        cities.addLast("Bristow");
        cities.add(3,"New Orleans");
        System.out.println(cities);

    }
}
