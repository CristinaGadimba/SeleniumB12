package SeleniumIntro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class YahooInterviewQuestion {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.yahoo.com/");

        WebElement news = driver.findElement(By.id("root2"));
        news.click();
        List<WebElement> headers = driver.findElements(By.tagName("h3"));
        for (WebElement header : headers) {
            if (header.getText().contains("US")) {
                System.out.println(header.getText().trim());
            }
        }
    }
}