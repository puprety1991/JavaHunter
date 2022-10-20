package com.syntax.replit;

public class Repls177  implements Fuctions{
    public void display(String result){
        System.out.print(result);
    }
    public double adding(double num1,double num2){
        return num1+num2;
    }
    public double subtracting(double num1,double num2){
        return num1-num2;
    }
    public double multiply(double num1,double num2){
        return num1*num2;
    }
    public double dividing(double num1,double num2){
        return num1/num2;
    }
    public static void main(String[] args){
        Fuctions math = new Repls177();
        math.display("Result is ::: ");
        System.out.println(math.adding(60,60));
        math.display("Result is ::: ");
        System.out.println(math.subtracting(100,20));
        math.display("Result is ::: ");
        System.out.println(math.multiply(200,10));
        math.display("Result is ::: ");
        System.out.println(math.dividing(100,20));

    }

}
    interface Outputs{
        void display(String result);
    }
    interface Fuctions extends Outputs{
        double adding(double num1,double num2);
        double subtracting(double num1,double num2);
        double multiply(double num1,double num2);
        double dividing(double num1,double num2);
}
