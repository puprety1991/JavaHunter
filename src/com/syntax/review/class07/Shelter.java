package com.syntax.review.class07;

public class Shelter {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        //how to access instance variables?
        dog1.name = "Scratchy";
        dog1.weight = 45;
        //dog1.play();
        //dog1.bark();
        //dog1.printInfo();

        Dog dog2 = new Dog();
        dog2.name = "Bobby";
        dog2.weight = 35;
        //dog2.play();
        //dog2.bark();
       // dog2.printInfo();
        System.out.println("Dog breed: "+Dog.breed);

        System.out.println("MAKING CHANGES");

        dog1.name="Bobik";
        dog1.breed="german";

        dog1.printInfo();  // Dog features:Bobik, 5, german
        dog2.printInfo();  // Dog features:Tommy, 10, german
        System.out.println(dog1.bark());
        System.out.println(dog2.bark());
    }
}
