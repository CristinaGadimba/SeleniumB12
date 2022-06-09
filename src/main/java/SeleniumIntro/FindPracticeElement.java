package SeleniumIntro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindPracticeElement {
    public static void main(String[] args) {
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com");

        List<WebElement> allLinks=driver.findElements(By.tagName("li"));

        for(WebElement link:allLinks){
            System.out.println(link.getText().trim());
            }



    }
}
