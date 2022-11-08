package com.syntax.Lambda;

public class RunnableExample {
    public static void main(String[] args) {
        Thread myTread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Printed inside Runnable");
            }
        });
        myTread.run();
        Thread myLambdaThread = new Thread(() -> System.out.println("Printed inside Lambda Runnable."));
        myLambdaThread.run();

    }
}
/*Note: Remember, this worked because Runnable has a single method. if it had more than one method
 , you could not have written a lambda function of that type*/
