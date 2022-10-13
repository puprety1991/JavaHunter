package com.syntax.class21;

public class Browser {
    void openBrowser(){
        System.out.println("Opening a Browser");
    }
    void navigate(){
        System.out.println("Navigate to the URL");
    }
    void test(){
        System.out.println("Testing the webPage");
    }
    void closeBrowser(){
        System.out.println("Closing the Browser");
    }
}
class GoogleChrome extends Browser{
    void openBrowser(){
        System.out.println("Opening a Browser in less the one Sec.");
    }
}
class FireFox extends Browser{
    void openBrowser(){
        System.out.println("Opening a Browser in less the Two Sec.");
    }
}
class BrowserTester{
    public static void main(String[] args) {
        GoogleChrome chrome = new GoogleChrome();
        chrome.openBrowser();
        chrome.closeBrowser();

        /*
        Browser[] browsers=new Browser[2];
        browsers[0]= new GoogleChrome();
        browsers[1]= new FireFox();
        for(Browser array:browsers){
            array.openBrowser();
            array.closeBrowser();
            array.navigate();
            array.test();

         */
        }
    }
}