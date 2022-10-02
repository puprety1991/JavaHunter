package com.syntax.class15;

public class Dog {
    String name; //instance variable
    static int noOfLegs = 4; //static variables
    String color;//instance variable
    void bark(){
        int i = 10;// 'i' local variable
        for(int j=0;j<i;j++){ // 'j' is also local variable
            System.out.println("barking....");
        }

    }
    void printInfo(){
        System.out.println("name "+name+" color "+color);
    }
    void printName(){
        System.out.println("name "+name);
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.color = "red";
        dog.name ="Tommy";
        dog.bark();
        dog.printInfo();
        dog.printName();
    }

}
