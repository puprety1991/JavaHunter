package com.syntax.Projects.project02;

/*  Provide Implementation for the diagram below.
    Then create a test class in which you
    need to create Objects of ChromeDriver,
    FirefoxDrive and SafariDriver classes and see which methods available to them.*/
public interface WebDriver {
    void open();
    void close();
    String getTitle();

    boolean navigate();
}
interface RemoteWebDriver extends WebDriver{
    boolean navigate();
}
interface TakesScreenShot extends RemoteWebDriver{
    void getScreenshot();
}
class ChromeDriver implements RemoteWebDriver{
    @Override
    public void open() {
        System.out.println("Opening Chrome browser.");
    }
    @Override
    public void close() {
        System.out.println("Closing the Chrome browser.");
    }
    @Override
    public String getTitle() {
        return "Title of the page from Chrome browser.";
    }
    @Override
    public boolean navigate() {
        System.out.println("Navigate to URL in Chrome browser.");
        return false;
    }
}
class FirefoxDriver implements RemoteWebDriver{
    @Override
    public void open() {
        System.out.println("Opening Firefox browser.");
    }

    @Override
    public void close() {
        System.out.println("Closing the Firefox browser.");
    }

    @Override
    public String getTitle() {
        return "Title of the page from Firefox browser.";
    }

    @Override
    public boolean navigate() {
        System.out.println("Navigate to URL in Firefox browser.");
        return false;
    }

}
class SafariDriver implements RemoteWebDriver {
    @Override
    public void open() {
        System.out.println("Opening Safari browser.");
    }
    @Override
    public void close() {
        System.out.println("Closing the Safari browser.");
    }
    @Override
    public String getTitle() {
        return "Title of the page from Safari browser.";
    }
    @Override
    public boolean navigate() {
        System.out.println("Navigate to URL in Safari browser.");
        return false;
    }
}
class DriverTester{
    public static void main(String[] args) {
      RemoteWebDriver[] driver = {new ChromeDriver(), new FirefoxDriver(),new SafariDriver()};
      for(RemoteWebDriver browser:driver){
          System.out.println();
          browser.open();
          browser.close();
          System.out.println(browser.getTitle());
          browser.navigate();

      }
    }
}
