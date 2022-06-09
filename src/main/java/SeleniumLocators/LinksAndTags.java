package SeleniumLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Locale;

import static java.time.zone.ZoneRulesProvider.refresh;

public class LinksAndTags {
    public static void main(String[] args) throws InterruptedException {
        //LinkText()
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("file:///Users/ilievcristina/Desktop/Techtorialhtml.html");
        WebElement javaLink = driver.findElement(By.linkText("Java"));
        javaLink.click();


        WebElement headerJava = driver.findElement(By.className("rwaccent"));
        System.out.println(headerJava.getText());
        Thread.sleep(3000);
        driver.navigate().back();
        Thread.sleep(3000);
        WebElement seleniumLink = driver.findElement(By.linkText("Selenium"));
        seleniumLink.click();
        System.out.println(driver.getTitle());
        Thread.sleep(3000);
        driver.navigate().back();
        WebElement cucumberLink = driver.findElement(By.linkText("Cucumber"));
        cucumberLink.click();
        WebElement headerCucumber = driver.findElement(By.className("font-light"));
        System.out.println(headerCucumber.getText());
        Thread.sleep(3000);
        driver.navigate().back();
        Thread.sleep(3000);
        driver.navigate().refresh();
        Thread.sleep(3000);
        driver.navigate().back();
        //PARTIALLINKTEXT()-->part of the linktext.(it means you can use piece of the whole word)
        //we only Rest intead of rest-api

        WebElement restApiLink = driver.findElement(By.partialLinkText("Reset"));
        restApiLink.click();
        System.out.println(driver.getTitle());

        //LOCATOR:tag name
        WebElement version = driver.findElement(By.tagName("u"));
        System.out.println(version.getText());

      WebElement horizontalSlider=driver.findElement(By.linkText("Horizantal Slider"));
      horizontalSlider.click();
      //whenever you are working on gettext,gettitle,getcurrenturl, use trim at the end.
      WebElement headerOfSlider= driver.findElement(By.tagName("h3"));
      String actualHeader=headerOfSlider.getText().trim();
        String expectedHeader = "Horizantal Slider";
        if (actualHeader.equals(expectedHeader)) {
            System.out.println("Passed");
        } else {
            System.out.println("Failed");
        }
        WebElement paragraph=driver.findElement(By.tagName("h4"));
        System.out.println(paragraph.getText().trim());
            driver.close();

        }

    }
