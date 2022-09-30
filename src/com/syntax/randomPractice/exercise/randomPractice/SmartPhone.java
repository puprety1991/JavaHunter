package com.syntax.randomPractice.exercise.randomPractice;

public class SmartPhone {
    String brand;
    String color;
    String model;


    void call(String phoneNumber) {
        System.out.println("Calling "+phoneNumber);
    }
    public void text(String text) {
        System.out.println(brand+" "+model+" send text: "+text);
    }
    void dial() {
        System.out.println(brand+" can dial");
    }

    void pics() {
        System.out.println(brand+" take a picture");
    }

}
