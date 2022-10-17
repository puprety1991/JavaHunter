package com.syntax.class23;

public class Task2 {
    /*
    Create a WebDriver Interface that will have the following unimplemented behaviour:
     openBrowser(), closeBrowser(), maximizeWindow(), findElement(). Create 2 classes
     that implements WebDriver interface: ChromeDriver and FirefoxDriver.
     */
    public static void main(String[] args) {
        WebDriver[] driver={new ChromeDriver(),new FireFoxDriver()};
           for(WebDriver browser:driver){
               browser.openBrowser();
               browser.closeBrowser();;
               browser.maximizeWindow();
               browser.findElement();
           }
    }
}
interface WebDriver{
    void openBrowser();
    void closeBrowser();
    void maximizeWindow();
    void findElement();
}
class ChromeDriver implements WebDriver{

    @Override
    public void openBrowser() {
        System.out.println("Opening the Chrome Browser.");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Closing the Chrome Browser.");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("Maximizing the Chrome Browser.");
    }

    @Override
    public void findElement() {
        System.out.println("Finding element in the Chrome Browser.");
    }
}
class FireFoxDriver implements WebDriver{

    @Override
    public void openBrowser() {
        System.out.println("Opening the FireFox Browser.");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Closing the FireFox Browser.");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("Maximizing the FireFox Browser.");
    }

    @Override
    public void findElement() {
        System.out.println("Finding element in the FireFox Browser.");
    }
}

