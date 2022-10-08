package com.syntax.class18;

public class Dog {
    private String name;
    private String breed;
    private int age;
    private double weight;

    Dog(String dogName, String dogBreed, int dogAge, double dogWeight ) {
        name = dogName;
        breed = dogBreed;
        age = dogAge;
        weight = dogWeight;
        System.out.println("I love my Dog");
    }
    public void dogInfo(){
            System.out.println("Name: "+name+", Breed: "+breed+", Age: "+age+", Weight: "+weight);
        }
    }

