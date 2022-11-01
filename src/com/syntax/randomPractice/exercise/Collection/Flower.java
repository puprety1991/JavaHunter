package com.syntax.randomPractice.exercise.Collection;

import java.util.ArrayList;

class FlowerTester{
    public static void main(String[] args) {
        ArrayList<Flower>flowers = new ArrayList<>();
        flowers.add(new SunFlower("Sunflower","Yellow"));
        flowers.add(new Tulip("Tulip","Red"));
        flowers.add(new Rose("Rose","Pink"));
        for(Flower flower:flowers){
            System.out.println("Name: "+flower.name+" Color: "+flower.color);
            flower.bloom();
            System.out.println();
        }
    }
}
public abstract class Flower {
   String name;
     String color;
    Flower(String name, String color){
        this.name = name;
        this.color=color;
    }
    public abstract void bloom();
}
class Rose extends Flower{

    Rose(String type, String color) {
        super(type, color);
    }

    @Override
    public void bloom() {
        System.out.println(name +" Blooms in the March.");
    }
}
class Tulip extends Flower{

    Tulip(String type, String color) {
        super(type, color);
    }

    @Override
    public void bloom() {
        System.out.println(name +" Blooms in the April");
    }
}
class SunFlower extends Flower{

    SunFlower(String type, String color) {
        super(type, color);
    }

    @Override
    public void bloom() {
        System.out.println(name +" Blooms in the August");
    }
}
