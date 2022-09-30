package com.syntax.randomPractice.exercise.randomPractice;

public class ObjectOfLaptop {
    public static void main(String[] args) {
        Laptop dell = new Laptop();
        dell.color = "black";
        dell.make = "Dell";
        dell.model = "inspiron";
        dell.hardDriverCapacity = "1 TB";
        dell.RAMCapacity = 8;

        dell.browseInternet();
        dell.playGame();
        dell.playMovies();
        String modelInfo = dell.getModel();
        System.out.println("Model: "+modelInfo);
        dell.makeVideoCall("708 420 7476");



    }
}
