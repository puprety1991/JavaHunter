package com.syntax.class24;

public class Cat {
    String name;
     String breed;
     int age;
     double weight;

    public Cat(String name, String breed, int age, double weight) {
        setAge(age);
        setName(name);
        setBreed(breed);
        setWeight(weight);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setAge(int age) {
        if(age<0){
            System.out.println("Age cannot be negative.");
        }else if(age>10){
            System.out.println("Please enter less age.");
        }else{
            this.age = age;
        }

    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    String getName(){
        return name;
    }
    void printInfo(){
        System.out.println("Name "+name+" Breed "+breed+" Age "+age+" Weight "+weight);
    }
}
class catTester{
    public static void main(String[] args) {
        Cat cat = new Cat("stella","updated",11,20);
        cat.printInfo();
    }
}
