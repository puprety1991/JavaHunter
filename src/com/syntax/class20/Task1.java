package com.syntax.class20;

public class Task1 {
    /*
    Create 1 class in which create a methods that will calculate the area (volume in case of box) of
    Rectangle
    Square
    Box
     */
    static void calArea(double length,double width){
        System.out.println("Area of Rectangle: "+(length*width));
    }

    static void calArea(int side){
        System.out.println("Area of Square: "+(side*side));
    }

    static void calArea(double length,double width,double height){
        System.out.println("Surface Area of Box: "+(2*((length*width)+(length*height)+(width*height))));
    }

    public static void main(String[] args) {
        calArea(5.5,6.6);
        calArea(5);
        calArea(5.5,6.3,6.7);
    }
}

