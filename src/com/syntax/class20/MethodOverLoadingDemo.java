package com.syntax.class20;

public class MethodOverLoadingDemo {
    static void method(String name,int number){
        System.out.println(name+" "+number);

    }
    static void method(String day,boolean isRaining){
        System.out.println(day+" "+isRaining);
    }
    static void method(double height,int age){
        System.out.println(height+" "+age);
    }
    static void method(int num,int num1){
        System.out.println(num+" "+num1);
    }
    static void method(double height,double weight){
        System.out.println(height+" "+weight);
    }
    static void method(String day,String quotes){
        System.out.println(day+" "+quotes);
    }
}
