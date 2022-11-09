package com.syntax.Lambda.practice;

interface PrintTable{
    void print();
}
interface ReturnType{
    String print(String suffix);
}
interface ReturnLength{
    int printLength(String word);
}
public class Lambdas {
    public static void main(String[] args) {
        PrintTable lambdaPrintable = (()-> System.out.println("Meow"));
        printThing(lambdaPrintable);

        ReturnType lambdaReturn= s -> s;
        System.out.println(returnThing(lambdaReturn));

        ReturnLength lambdaLength = l -> l.length();
        System.out.println(getLength(lambdaLength));
    }
    static void printThing(PrintTable thing){
        thing.print();
    }
    static String returnThing(ReturnType variable){
        return variable.print("Hello World");
    }
    static int getLength(ReturnLength string){
        return string.printLength("hello");
    }
}
