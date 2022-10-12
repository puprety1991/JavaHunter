package com.syntax.class20;

public class MethodOverLoading {
    int num;
    double dNumber;
    MethodOverLoading(){

    }
    MethodOverLoading(double dNumber){
        this.dNumber=dNumber;
    }
    MethodOverLoading(int num){
        this.num=num;
    }
    static void add(int num, int num1){
        System.out.println(num+num1);
    }
    static void add(double num,double num1){
        System.out.println(num+num1);
    }
    static void add(double num,double num1,double num2) {
        System.out.println(num + num1+num2);
    }
    public static void main(String[] args) {
        add(3,3);
        add(5.5,5.6);
        add(6.6,7.7,5.5);
        MethodOverLoading obj=new MethodOverLoading();
        MethodOverLoading obj1=new MethodOverLoading(3.3);
        MethodOverLoading obj2=new MethodOverLoading(3);


    }
}
