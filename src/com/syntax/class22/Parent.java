package com.syntax.class22;

public class Parent {
    static void print(){
        System.out.println("Hello World");
    }
}
class Child extends Parent{
    static void print(){//static method cannot be overriding but re-declaring it.
        System.out.println("Hello There");
    }
}
class Test{
    public static void main(String[] args) {
        Child child=new Child();
        child.print();
    }
}
