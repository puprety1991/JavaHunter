package com.syntax.review.class07;

public class Dog {
    String name;//instance variable
    int weight;//instance variable
    static String breed ="Huskey";

    void play(){
        System.out.println("Dog is playing with kids");

    }
    String bark(){
        // create a method that will return bark type

        // if weight is more less than 5 --> loud
        // if weight less 20 -> noise is wooh
        // if weight is less 500 > noise Gav gav

            String noise;

            if (weight<5) {
                noise="loud";
            } else if(weight<10) {
                noise="woof woof";
            }else {
                noise="GAV GAV";
            }
            return noise;
        }


    void printInfo(){
        System.out.println("Dog name : "+name);
        System.out.println("Dog weight : "+weight);
        System.out.println(Dog.breed);
    }

}
