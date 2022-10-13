package com.syntax.class21;

public class Animal {
    String name;
    String color;
    String breed;
    void sleep(){
        System.out.println("Animals usually sleep for 6 hours");
    }
    void eat(){
        System.out.println("Grass and Meat");
    }
}
class Cat extends Animal{
    void sleep(){
        System.out.println("Cat likes to sleep for 12 hours");
    }
    void eat(){
        System.out.println("Cat likes to eat milk and rice mixed");
    }
}
class Dog extends Animal{
    void sleep(){
        System.out.println("Dog likes to sleep for 7 hours");
    }
    void eat(){
        System.out.println("Dog like to eat any kinds of Meat");
    }
}
class AnimalTester{
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.sleep();

        Cat cat =new Cat();
        cat.eat();
        cat.sleep();
    }
}