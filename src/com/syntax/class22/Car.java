package com.syntax.class22;

public class Car {
    void start(){
        System.out.println("Use the key to start me");
    }
    void stop(){
        System.out.println("Use breaks to stop me");
    }
    void park(){
        System.out.println("Park me manually");
    }
}
class BMW extends Car{
    void start(){
        System.out.println("Press the Push bottom to start me");
    }

    void stop(){
    super.stop();
        System.out.println("You can also use auto-breaking to stop me");
    }
}
class Toyota extends Car{
    void start(){
        System.out.println("Push me to start");
    }
}
class Tesla extends Car{
    void start(){
        System.out.println("Use the App to start me");
    }
    void stop(){
        System.out.println("Use AI and AutoBreaking to stop me");
    }
    void park(){
        System.out.println("I can auto park myself");
    }
}
class CarTester{
    public static void main(String[] args) {
        BMW bmw = new BMW();
        bmw.start();
        Tesla tesla = new Tesla();
        tesla.park();
    }


}