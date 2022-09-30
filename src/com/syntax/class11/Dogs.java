package com.syntax.class11;

public class Dogs {
    //Create a Dog Class and create 3 different objects of it:
    // Husky, Bulldog, Labrador  with specific  attributes and behaviors.
    String breed;
    String name;
    int age;
    boolean isFriendly;
    int weight;
    String color;
    boolean isMusic;

    void play(){
        if(isFriendly){
            System.out.println("Dog is playing with Henry's friend.");
        }else{
            System.out.println("Henry's friend scared to play with dog.");
        }
    }
    void bark(String name){
        System.out.println("Dog barked when he met with "+name);
    }
    void sleep(){
        if(!isMusic){
            System.out.println("Dog is try sleep.");
        }else{
            System.out.println("Dog is sleeping.");
        }
    }
    void info(String name, String name1, String name2){
        if(breed.equalsIgnoreCase("Huskey")){
            System.out.println("Dog owner is "+name);
        }else if(breed.equalsIgnoreCase("Bulldog")){
            System.out.println("Dog owner is "+name1);
        }else if(breed.equalsIgnoreCase("Labrador")){
            System.out.println("Dog owner is "+name2);
        }else{
            System.out.println("Dog Owner is Unknown");
        }
    }

    public static void main(String[] args) {
        Dogs dog = new Dogs();
        dog.breed = "husky";
        dog.name ="Tommy";
        dog.isFriendly = true;
        dog.isMusic = true;
        dog.age = 5;
        dog.weight = 30;

        System.out.println("Dog weight is "+dog.weight);
        dog.bark("Jordan");
        dog.info("Sam","Dan","George");
        dog.sleep();
        dog.play();
        System.out.println("------------------");

        Dogs dog1 = new Dogs();
        dog1.breed = "bulldog";
        dog1.name ="Stella";
        dog1.isFriendly = false;
        dog1.isMusic = false;
        dog1.age = 4;
        dog1.weight = 20;

        System.out.println("Dog weight is "+dog1.weight);
        dog1.bark("Joe");
        dog1.info("Sam","Dan","Henry");
        dog1.sleep();
        dog1.play();
        System.out.println("------------------");

        Dogs dog2 = new Dogs();
        dog2.breed = "Labrador";
        dog2.name ="Scratchy";
        dog2.isFriendly = true;
        dog2.isMusic = true;
        dog2.age = 2;
        dog2.weight = 15;

        System.out.println("Dog weight is "+dog2.weight);
        dog2.bark("Henry");
        dog2.info("Sam","Dan","Henry");
        dog2.sleep();
        dog2.play();

    }


}
