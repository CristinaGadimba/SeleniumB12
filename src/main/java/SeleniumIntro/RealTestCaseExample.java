package SeleniumIntro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


//  Test Case - Open Godaddy.com and validate it's Page title and the url.
////    Steps to Automate:
////            1. Launch browser of your choice say., Firefox, chrome etc.
////            2. Open this URL - https://www.godaddy.com/
////            3. Maximize or set size of browser window.
////4. Get Title of page and validate it.(if conditions)
////4. Get URL of current page and validate it.
////            5. Close browser.

public class RealTestCaseExample {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","chromedriver");
        WebDriver driver=new ChromeDriver();//we use polymorphism framework
        driver.manage().window().maximize();
        driver.get("https://www.godaddy.com/");

        String actualTitle = driver.getTitle();
        String expectedTitle = "<title>Domain Names, Websites, Hosting &amp; Online Marketing Tools - GoDaddy</title>";
        if (actualTitle.equals(expectedTitle)) {
            System.out.println("Passed");
        } else {
            System.out.println("Failed");
        }

        String actualUrl= driver.getCurrentUrl();
        String expectedUrl="https://www.godaddy.com/";
        if(actualUrl.equals(expectedUrl))  {
            System.out.println("url is passed");
        }else{
            System.out.println("url is failed");
        }
        driver.close();
    }
}