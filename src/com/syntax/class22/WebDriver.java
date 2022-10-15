package com.syntax.class22;

public class WebDriver {
    public  void startBrowser(){
        System.out.println("Starting the Browser");
    }
    public void test(){
        System.out.println("Perform the testing");
    }
    public void closeBrowser(){
        System.out.println("Closing the browser");
    }
}
class Chrome extends WebDriver{
    public  void startBrowser(){
        System.out.println("Starting the Google Chrome Browser");
    }
    public void test(){
        System.out.println("Perform the testing on Google Chrome");
    }
    public void closeBrowser(){
        System.out.println("Closing the Google Chrome browser");
    }
}
class FireFox extends WebDriver{
    public  void startBrowser(){
        System.out.println("Starting the FireFox Browser");
    }
    public void test(){
        System.out.println("Perform the testing on FireFox");
    }
    public void closeBrowser(){
        System.out.println("Closing the FireFox browser");
    }
}
class Safari extends WebDriver{
    public  void startBrowser(){
        System.out.println("Starting the Safari Browser");
    }
    public void test(){
        System.out.println("Perform the testing on Safari");
    }
    public void closeBrowser(){
        System.out.println("Closing the Safari browser");
    }
}
