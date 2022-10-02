package com.syntax.class14;

public class HelloTask {
    /*
    Create a method that will say Hello in different language based on the country that
    will be passed when method is executed
     */
    String hello(String country){
        String greeting;
        if(country.equalsIgnoreCase("india")){
            greeting="नमस्ते";
        }else if(country.equalsIgnoreCase("japan")){
            greeting="こんにちは";
        }else if(country.equalsIgnoreCase("Mexico")){
            greeting= "Hola";
        }else if(country.equalsIgnoreCase("Russia")){
            greeting = "привет";
        }else{
            greeting="Not Found!!";
        }
        return greeting;
    }
    void sayHello(String country){
        switch (country) {
            case "USA":
                System.out.println("Hello");
                break;
            case "India":
                System.out.println("Namaste");
                break;
            case "Turkiye":
                System.out.println("Merhaba");
                break;
            case "Pakistan":
                System.out.println("AOA");
                break;
            case "Japan":
                System.out.println("Nihau");
                break;
            default:
                System.out.println("Not Found");
        }

    }

    public static void main(String[] args) {
        HelloTask country = new HelloTask();
        System.out.println("hello --> "+country.hello("mexico"));

        country.sayHello("India");

    }
}
