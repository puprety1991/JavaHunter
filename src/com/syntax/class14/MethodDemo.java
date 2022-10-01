package com.syntax.class14;

public class MethodDemo {
    // A method that does not take any parameter and prints same line on the console
    void printHello(){
        System.out.println("Hello World");
        System.out.println("Java Rocks!!");

    }
    //A method that takes a single parameter of type String and print it.
    void printWord(String word){
        System.out.println(word);
    }

    public static void main(String[] args) {
        MethodDemo displayMsg = new MethodDemo();
        displayMsg.printHello();
        displayMsg.printWord("Hello dear");
    }
}
