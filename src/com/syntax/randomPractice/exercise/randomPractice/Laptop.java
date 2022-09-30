package com.syntax.randomPractice.exercise.randomPractice;

public class Laptop {
    String make;
    String model;
    String hardDriverCapacity;
    int RAMCapacity;
    String color;
    String processor;
    String GPU;

    void playMovies(){
        System.out.println("Watching Movies");
    }
    void playGame(){
        if(RAMCapacity>=8){
            System.out.println("You can play games in your laptop.");
        }else{
            System.out.println("Please upgrade your Ram!");
        }


    }
    void browseInternet(){
        System.out.println("I am doing shopping");
    }
    void makeVideoCall(String contact){
        System.out.println("Video calling to "+contact);
    }
    public String getModel(){
        return model;
    }
}
