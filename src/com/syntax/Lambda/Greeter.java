package com.syntax.Lambda;

public class Greeter {
    public void greet(Greeting greeting){
        greeting.perform();
    }
    public static void main(String[] args) {
        Greeter greeter = new Greeter();
        HelloWorldGreeting helloGreeting = new HelloWorldGreeting();
        greeter.greet(helloGreeting);

         Greeting myLambdaFunction = () -> System.out.println("Hello World!");
         MyAdd addFunction = (int a, int b) -> a + b;
        System.out.println(addFunction.sum(2,5));
        myLambdaFunction.perform();

        Greeting innerClassGreeting = new Greeting() {
            @Override
            public void perform() {
                System.out.println("Hello World!");
            }
        };
        innerClassGreeting.perform();

    }
}

interface  MyAdd{
    int sum(int i,int j);
}
