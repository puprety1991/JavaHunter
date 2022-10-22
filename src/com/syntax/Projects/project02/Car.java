package com.syntax.Projects.project02;
/*  Create a Class Car that would have the following fields: carPrice and color
    and method calculateSalePrice() which should be returning a price of the car.
    Create 2 subclasses: Sedan and Truck. The Truck class has a field as weight
    and has its own implementation of calculateSalePrice() method in which
    returned price is calculated as following: if weight>2000 then returned
    price car should include 10% discount, otherwise 20% discount.
    The Sedan class has field as length and also does its own implementation of
    calculateSalePrice(): if length of sedan is >20 feet then returned car
    price should include 5% discount, otherwise 10% discount*/
public class Car {
    double carPrice;
    String color;
    Car(double carPrice){
        this.carPrice=carPrice;
    }
    double calculateSalePrice(){
        return 0;
    }
}
class Sedan extends Car{
    int length;
    Sedan(double carPrice,int length){
        super(carPrice);
        this.length=length;
    }
    @Override
    double calculateSalePrice() {
        if(length>20){
            return (carPrice-(carPrice*5/100));
        }else{
            return (carPrice-(carPrice*10/100));
        }
    }
}
class Truck extends Car{
    int weight;
    Truck(double carPrice, int weight){
        super(carPrice);
        this.weight=weight;
    }
    @Override
    double calculateSalePrice() {
        if(weight>2000){
            return (carPrice-(carPrice*10/100));
        }else{
            return (carPrice-(carPrice*20/100));
        }
    }
}
class carTester{
    public static void main(String[] args) {
        Car[] car={new Sedan(31000,20),new Truck(50000,25000)};
        System.out.println();
        for(Car vehicle:car){
            System.out.println("Actual Price Of Vehicle Is $"+ vehicle.carPrice+
                    ". Discounted Price Is $"+vehicle.calculateSalePrice());
        }
    }
}
