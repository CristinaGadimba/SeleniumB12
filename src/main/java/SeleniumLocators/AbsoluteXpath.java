package SeleniumLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbsoluteXpath {
    public static void main(String[] args) {
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com");

        WebElement clickAB=driver.findElement(By.linkText("A/B Testing"));
        clickAB.click();
        WebElement text = driver.findElement(By.xpath("/html/body/div[2]/div/div/p"));
        System.out.println(text.getText());
    }
}
