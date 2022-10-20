package com.syntax.replit;

public class Repls166 {
    /*
    Create a class Animal in which define instance variable type,
    constructor that will initialize instance variables and 2 methods eat and sleep.
    Create a subclass Cat in which override method sleep
    Create 3 Kitten subclasses of a Cat class and override method eat
    for 1 kitten - eats milk
    for 2 kitten - eats snack
    for 3 kitten - eats everything
    In main method create object of Cat class and all 3 kittens classes and
    store into an array of Animals. Call available methods:
     */
    public static void main(String[] args) {
        Animal[] animal = {new Cat("milk"), new Kitten1("milk"), new Kitten2("snacks"), new Kitten3("everything")};
        for (Animal pet : animal) {
            pet.eat();
            pet.sleep();
        }
    }
}
    class Animal {
        String food;
        Animal(String food) {
            this.food = food;
        }
        void eat() {
            System.out.println("Animal eats");
        }
        void sleep() {
            System.out.println("Animal sleeps");
        }
    }
    class Cat extends Animal {
        Cat(String food) {
            super(food);
        }
        void eat() {
            System.out.println("Cat eats");
        }
        void sleep() {
            System.out.println("Cat sleeps a lot");
        }
    }
    class Kitten1 extends Cat {
        Kitten1(String food) {
            super(food);
        }
        void eat() {
            System.out.println("kitten1 eats " + food);
        }
        void sleep() {
            System.out.println("kitten1 sleeps a lot");
        }
    }
    class Kitten2 extends Cat {
        Kitten2(String food) {
            super(food);
        }
        void eat() {
            System.out.println("kitten2 eats " + food);
        }
        void sleep() {
            System.out.println("kitten2 sleeps a lot");
        }
    }
    class Kitten3 extends Cat {
        Kitten3(String food) {
            super(food);
        }
        void eat() {
            System.out.println("kitten3 eats " + food);
        }
        void sleep() {
            System.out.println("kitten3 sleeps a lot");
        }
    }
