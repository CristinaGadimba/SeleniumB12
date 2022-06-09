package SeleniumIntro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindElementPractice2 {
    public static void main(String[] args) {
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com");
        /*
        1-navigate to the website
        2-find all the webelemenet
        3-print out the only link that length is less than 12
        4-count

         */

        List<WebElement>alllinks=driver.findElements(By.xpath("//li"));
        int counter=0;
        for(WebElement link:alllinks){
            if(link.getText().trim().length()<12){
                System.out.println(link.getText().trim());
                counter++;
            }
        }
        System.out.println(counter);
    }
}
