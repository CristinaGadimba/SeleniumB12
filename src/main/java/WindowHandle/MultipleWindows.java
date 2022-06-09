package WindowHandle;

import Utils.BrowserUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.Set;

public class MultipleWindows {
    @Test
    public void practice(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        driver.manage().window().maximize();
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("window.open('http://www.techtorialacademy.com/')");
        js.executeScript("window.open('https://www.techtorialacademy.com/about-us')");
        js.executeScript("window.open('https://www.techtorialacademy.com/programs')");

        //how can I switch my window the one I want to go with
        //previous implementation is comparing with two windows, but now I have more than
        //2pages(tabs)
        System.out.println(driver.getTitle());
        BrowserUtils.switchByTitle(driver,"About Us");
//        Set<String> allIds=driver.getWindowHandles();//4 ids we have above
//        for(String id:allIds){
//            driver.switchTo().window(id);
//            if(driver.getTitle().contains("About Us")){
//                break;
//            }
//        }
        System.out.println(driver.getTitle());//about us-techtorial

    }
}

