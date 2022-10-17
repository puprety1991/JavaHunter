package com.syntax.class23;

public interface Person {
    void eat();
}
interface Employee{
    void work();
}
interface SyntaxEmployee extends Employee,Person{

}
class Worker implements SyntaxEmployee{

    @Override
    public void eat() {
        System.out.println("I like to eat burger.");
    }

    @Override
    public void work() {
        System.out.println("I like to work in the morning.");
    }
}
//it is not important for Tester.