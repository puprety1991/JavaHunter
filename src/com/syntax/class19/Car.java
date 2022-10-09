package com.syntax.class19;
class Vehicle{
    int noOfWheel;
    int topSpeed;
    public void printTopSpeed(){
        System.out.println(topSpeed);
    }
}
public class Car extends Vehicle {
    String model;
    String make;
    int year;
}
class Tesla extends Car{
    void info(){
        System.out.println("I am a electrical Car");
    }

}
class Toyota extends Car{

}
//class CustomCar extends Toyota,Tesla{; :-This is not allowed because of diamond problem.

//}
class Tester{
    public static void main(String[] args) {
        Toyota toyota = new Toyota();
        toyota.printTopSpeed();
    }
}
