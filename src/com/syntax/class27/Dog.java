package com.syntax.class27;

import java.util.ArrayList;

public class Dog {
    private String name;
    private String color;
    private String breed;

    public Dog(String name, String color, String breed) {
          setName(name);
          setColor(color);
          setBreed(breed);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public String getBreed() {
        return breed;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", breed='" + breed + '\'' +
                '}';
    }
}
class DogTester{
    public static void main(String[] args) {
        ArrayList<Dog>dogs = new ArrayList<>();
        dogs.add(new Dog("Tommy","Black","German Shepherd"));
        dogs.add(new Dog("Tina","White","Husky"));
        dogs.add(new Dog("Stella","Brown","BullDog"));
        System.out.println(dogs);
        for(Dog dog:dogs){
            System.out.println("Name: "+dog.getName());
            System.out.println("Color: "+dog.getColor());
            System.out.println("Breed: "+dog.getBreed());
            System.out.println();
        }
    }
}