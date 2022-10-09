package com.syntax.class19;

public class printFClass {
    static void printF(){
        System.out.println("Syntax");
    }
}
class newClass extends printFClass{
}
class test{
    public static void main(String[] args) {
        newClass obj=new newClass();
        obj.printF();
    }
}
