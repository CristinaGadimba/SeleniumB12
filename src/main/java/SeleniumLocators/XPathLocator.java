package SeleniumLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathLocator {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("file:///Users/ilievcristina/Desktop/Techtorialhtml.html");
        WebElement phone = driver.findElement(By.xpath("//input[@name='phone']"));
        phone.sendKeys("234578865");

        WebElement address = driver.findElement(By.xpath("//input[@name='address']"));
        address.sendKeys("ngjfg");

        WebElement homeLink = driver.findElement(By.xpath("//a[@href='https://www.techtorialacademy.com/']"));
        homeLink.click();
        Thread.sleep(3000);
    }
}