package SeleniumIntro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumMethods {
    public static void main(String[] args) throws InterruptedException {
        WebDriver  driver=new ChromeDriver();
        driver.manage().window().maximize();
       // navigate.to()-->it naavigates to the web site but doesn't wait all the element to be loaded
        driver.navigate().to("https://www.google.com/");
        System.out.println(driver.getTitle());
        driver.navigate().to("https://www.youtube.com/");
        System.out.println(driver.getTitle());
        Thread.sleep(3000);
        driver.navigate().back();//it will go to the previous website
        Thread.sleep(3000);
        driver.navigate().forward();//it will go to the next website
        Thread.sleep(3000);
        driver.navigate().refresh();//it will refresh the website
        System.out.println(driver.getPageSource());
    }
}
