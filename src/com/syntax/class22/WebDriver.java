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
class WebDriverTester{
    public static void main(String[] args) {
        //WebDriver driver = new Safari();
        //Creating objects of all Child classes and storing in an array of type WebDriver we can do this because
        //it allows us to do this.
        WebDriver[] driver1 ={new Chrome(),new FireFox(),new Safari()};
        for(WebDriver browser:driver1){
            browser.startBrowser();
            browser.test();
            browser.closeBrowser();
        }
                //OR
        for(int i=0;i<driver1.length;i++){
            driver1[i].startBrowser();
            driver1[i].test();
            driver1[i].closeBrowser();
        }
    }
}
