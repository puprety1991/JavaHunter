package com.syntax.class19;

public class Shape {
    /*
    Write program: Shape class has a constructor that takes the radius
     and has a subclass as  circle class. In circle class create a method
     to calculate the area of circle. Test your code
     */
    double radius;
    Shape(double radius){
        this.radius=radius;
    }
}
class Circle extends Shape{
    Circle(double radius){
        super(radius);

    }
    void calculate(){
        double cal;
        double pi = 3.14;
        cal = pi*(radius*radius);
        System.out.println("Area of circle: "+cal);

    }

}
class ShapeTester{
    public static void main(String[] args) {
        Circle circle = new Circle(6.5);
        circle.calculate();

    }
}
