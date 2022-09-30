package com.syntax.review.class06;

public class Phone {
    String color;
    String make;
    String model;
    int storage;
    double size;

    void makeCall(String name){
        System.out.println("I am making call to "+name);
    }
    void listenMusic(String singerName){
        System.out.println("my "+make+" playing the "+singerName+" songs.");
    }
    void phoneInfo(){
        System.out.println("i have "+color+" color "+make+" - "+model+" phone which has "+storage+" storage and it's size "+size+".");
    }

    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.make = "Apple";
        phone.color = "black";
        phone.model = "Iphone 14 pro-ax";
        phone.size= 6.5;
        phone.storage = 256;

        phone.makeCall("prakriti");
        phone.listenMusic("sujan");
        phone.phoneInfo();
    }
}
