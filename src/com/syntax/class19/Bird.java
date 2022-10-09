package com.syntax.class19;

public class Bird {
    String name;
    String color;
    int age;
    double weight;
    Bird(String name, String color, int age, double weight){
        this.name=name;
        this.color=color;
        this.age=age;
        this.weight=weight;
    }
    void printInfo(){
        System.out.println("Name "+name +" Color "+color+" Age "+age+" Weight "+weight);
    }
}
class Parrot extends Bird{
    Parrot(String name, String color, int age, double weight){
        super(name,color,age,weight);

    }

}
class Crow extends Bird {
    boolean isClever;
    Crow(String name, String color, int age, double weight,boolean isClever) {
        // this.name=name;
        //this.color=color;
        //this.age=age;
        //this.weight=weight;
        super(name, color, age, weight);
        this.isClever=isClever; //if we have extra variable in the child constructor parameter than parents constructor.
    }
}
class Test {
    public static void main(String[] args) {
        Parrot parrot = new Parrot("Zeki", "Green", 2, 1);
        parrot.printInfo();

        Crow crow = new Crow("crow", "black", 1, 1.2,true);
        crow.printInfo();


    }

}
