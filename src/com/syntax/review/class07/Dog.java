package com.syntax.review.class07;

public class Dog {
    String name;//instance variable
    int weight;//instance variable
    static String breed ="Huskey";

    void play(){
        System.out.println("Dog is playing with kids");

    }
    void bark(){
        System.out.println(name+" is barking");

    }
    void printInfo(){
        System.out.println("Dog name : "+name);
        System.out.println("Dog weight : "+weight);
        System.out.println(Dog.breed);
    }

}
