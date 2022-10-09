package com.syntax.class19;

public class Furniture {
    String color = "green";
}
class Chair extends Furniture{
    String color = "Red";
    void printColor(){
        String color = "Black";
        System.out.println(color); // it will print the local variable = Black
        System.out.println(this.color); //it will print instance variable of same class. =>Red
        System.out.println(super.color);//instance variable of the parents class. =>green
    }
}
class TestChair{
    public static void main(String[] args) {
        Chair chair=new Chair();
        chair.printColor();
    }
}
