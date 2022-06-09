package TestNG;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGPractice {
    @Test(invocationCount = 3)
    public void UrlValidation() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.opencart.com/admin/");
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = ("https://demo.opencart.com/admin/");
        Assert.assertEquals(actualUrl, expectedUrl);
        //asa tester always do a negativ test scenario

      /*

     1-Navigate to the website
     2-Login to the website
     3-click catalog
     4-Validate(Assert) the "Products" is displayed.
      */

    }

    @Test

    public void website() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.opencart.com/admin/");
        WebElement button = driver.findElement(By.tagName("button"));
        button.click();
        WebElement CatalogButton = driver.findElement(By.xpath("//a[.=' Catalog']"));
        CatalogButton.click();
        WebElement product = driver.findElement(By.xpath("//a[contains(text),'Products')]"));
        boolean actualResult = product.isDisplayed();
        boolean expectedResult = true;
        Assert.assertEquals(actualResult, expectedResult);
    }


    }
