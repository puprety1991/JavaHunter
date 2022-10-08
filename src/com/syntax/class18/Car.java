package com.syntax.class18;

public class Car{
    // common class have many name like parent class, super class, or base class.
    String model;
    String make;
    int year;
    String color;
    int topSpeed;
    double price;
    // if a field or method has private access modifiers in parent class then child classes cant use it.
    private String engineType;
    void carInfo(){
        System.out.println("Make: "+make+", Model: "+model+", Color: "+color);
    }

}

class BMW extends Car {
    //Child class also called subclass or derived class.
    double engineHP;
    }


class Tesla extends Car{

}
class Toyota extends Car{
    double engineHP;

}
class CarTester{
    public static void main(String[] args) {
        BMW bmw = new BMW();
        bmw.model="x5M";
        bmw.engineHP = 210;
        bmw.make = "BMW";
        bmw.price = 50000;
        bmw.color = "White";
        bmw.carInfo();
    }
}
