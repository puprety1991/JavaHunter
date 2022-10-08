package com.syntax.class18;

public class Dogs {
    String name;
    String breed;
    int age;
    double weight;
    String color;
    double height;

    public Dogs(String name, String breed, int age, double weight, String color, double height) {
        this(name, breed, age, weight, color);
        this.height = height;
    }

    public Dogs(String name, String breed, int age, double weight, String color) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.weight = weight;
        this.color = color;
    }
}
