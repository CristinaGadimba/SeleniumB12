package SeleniumIntro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumBasics {
    public static void main(String[] args) {
        //step 1:we need to define the chrome driver into the project propery.

        System.setProperty("webdriver.chrome.driver","chromedriver");

        //step2:we need to instantiate(declare) our Chrome driver.
        WebDriver driver=new ChromeDriver();//we use polymorphism framework
        driver.manage().window().maximize();

        //getCurrentUrl()-->it gets the url of the website
        System.out.println(driver.getCurrentUrl()+"before anything");//empty
        //get()-->it will navigate to the website
        driver.get("https://www.techtorialacademy.com/");
        System.out.println(driver.getCurrentUrl()+"after navigation");//techtorial academy

       String actualTitle= driver.getTitle();
       String expectedTitle="Home Pag - Techtorial";
       if(actualTitle.equals(expectedTitle)) {
           System.out.println("Passed");
       }else{
           System.out.println("Failed");
       }
      driver.close();
    }
}
