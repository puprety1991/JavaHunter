package com.syntax.Projects.project02;
      /*  Create an Interface 'Shape' with undefined methods as calculateArea
        and calculatePerimeter. Create 2 classes Circle & Square that
        implements functionality defined in the Shape Interface. Test your code.
*/
public interface Shape {
    void calculateArea();
    void calculatePerimeter();
}
class Circle implements Shape{
    double length;
    double width;
    double radius;
   Circle(double length,double width,double radius){
       this.length=length;
       this.width=width;
       this.radius=radius;
   }
    @Override
    public void calculateArea() {
        double area = length*width;
        System.out.println("The Area of Circle: "+area);
    }

    @Override
    public void calculatePerimeter() {
        double peri = 2*Math.PI*radius;
        System.out.println("The Perimeter of Circle: "+peri);
    }
}
class Square implements Shape{
    double length;
    Square(double length){
        this.length=length;
    }
    @Override
    public void calculateArea(){
        System.out.println("The Area of Square: "+(length*2));
    }

    @Override
    public void calculatePerimeter() {
        System.out.println("The Perimeter of Square: "+(4*length));
    }
}
class ShapeTester{
    public static void main(String[] args) {
        Shape[] obj = {new Circle(13.3, 10.44, 5.7), new Square(6)};
        for(Shape shape:obj){
            System.out.println();

            shape.calculateArea();
            shape.calculatePerimeter();
        }
    }
}

