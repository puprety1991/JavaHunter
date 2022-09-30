package com.syntax.class11;

public class Dog {

    //state or attributes/properties/fields are same
    String name;
    String color;
    String breed;
    int weight;
    int age;

    // these are the behaviour of a dog.
    void bark(){
        System.out.println("Dog is barking!!");
    }
    void play(){
        System.out.println("Dog is playing");
    }
    void info(){
        System.out.println("My dog breed is '"+breed+"', color is "+color+" and it becomes "+age+" years old. His name is "
                +name+".");
    }
    void sleep(){
        System.out.println("Dog is sleeping");
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.age =2;
        dog.breed = "German Shepherd";
        dog.color = "white";
        dog.name = "Tommy";
        dog.weight = 50;

        //calling a behaviour on an object
        dog.bark();
        dog.info();
        dog.play();
        dog.sleep();

    }
}
