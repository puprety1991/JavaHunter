package com.syntax.practice;

public class GrandFather {
    int money;
    void money(){
        System.out.println("Got money from grandfather " +money);
    }

}
class Father extends GrandFather{

}
class Son extends Father{

}
class Tester{
    public static void main(String[] args) {
        Son obj=new Son();
        obj.money=5000;
        obj.money();
    }
}

