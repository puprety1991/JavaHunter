package com.syntax.class18;

public class Horse {
   private String name;
   private int age;
    private double weight;
    private String breed;

    public Horse(String name, String breed, int age, double weight){
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.weight = weight;
    }
    void printInfo(){
        System.out.println("HorseName: "+name+", Breed: "+breed+", Age: "+age+", Weight: "+weight);
    }

    public static void main(String[] args) {
        Horse horse = new Horse("Tommy","Stallion",20,400);
        horse.printInfo();
    }





}
