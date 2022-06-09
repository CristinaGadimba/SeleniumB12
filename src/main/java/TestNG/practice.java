package TestNG;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static java.lang.Thread.sleep;

public class practice {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.opencart.com/admin/");
        WebElement button = driver.findElement(By.tagName("button"));
        button.click();
        WebElement CatalogButton = driver.findElement(By.xpath("//a[.=' Catalog']"));
        CatalogButton.click();
        WebElement productButton= driver.findElement(By.xpath("//a[contains(text(),'Products')]"));
        sleep(3000);
        productButton.click();
        List<WebElement>allCheckBoxes=driver.findElements(By.xpath("//input[@type='checkbox']"));

        for(int i=1;i<allCheckBoxes.size();i++){
            Assert.assertEquals(allCheckBoxes.get(i).isDisplayed(),true);
            allCheckBoxes.get(i).click();
            sleep(500);//this for me to see one by one it is clicking optional
            Assert.assertEquals(allCheckBoxes.get(i).isSelected(),true);
        }
    }

    @Test
    public void validationAscendingOrder(){



        /*
        1-navigate to website
        2-click catalog
        3-click product
        4-find all the names and store them(list<WebElement>

         */
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.opencart.com/admin/");
        WebElement button = driver.findElement(By.tagName("button"));
        button.click();
        WebElement CatalogButton = driver.findElement(By.xpath("//a[.=' Catalog']"));
        CatalogButton.click();
        WebElement productButton= driver.findElement(By.xpath("//a[contains(text(),'Products')]"));
        productButton.click();

        List<WebElement>allBrands=driver.findElements(By.xpath("//tr/td[3]"));

        List<String>actualBrands=new ArrayList<>();
        List<String>expectedBrands=new ArrayList<>();
        for(int i =1;i<allBrands.size();i++){
            actualBrands.add(allBrands.get(i).getText().toLowerCase());
            expectedBrands.add((allBrands.get(i).getText().toLowerCase()));
            Collections.sort(expectedBrands);
            Assert.assertEquals(actualBrands,expectedBrands);
        }
        System.out.println(actualBrands);
        System.out.println(expectedBrands);


    }
}

