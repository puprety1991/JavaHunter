package com.syntax.class11;

public class Phone {
    String make;
    String model;
    String color;
    int storage;
    double size;
    boolean cheap;

    void makeCall(String name){
        System.out.println("Making call to "+name);
    }
    void takePicture(){
        System.out.println("Taking Picture");
    }
    void playGame(){
        if(storage>128){
            System.out.println("You can play the games");
        }else{
            System.out.println("You Do Not Enough Storage!!");
        }
    }

    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.make = "Apple";
        phone.model = "Iphone 14";
        phone.color = "Silver";
        phone.storage = 64;

        System.out.println("Make "+phone.make+", Model "+phone.model);
        phone.takePicture();
        phone.makeCall("Adam");
        phone.playGame();

        System.out.println("------------------");
        Phone samsungPhone = new Phone();
        samsungPhone.make = "Samsung";
        samsungPhone.make = "s22 Ultra";
        samsungPhone.color = "Silver";
        samsungPhone.storage = 256;
        samsungPhone.size = 6.7;
        samsungPhone.cheap = false;

        System.out.println(phone.make);
        System.out.println(samsungPhone.make);

    }
}
