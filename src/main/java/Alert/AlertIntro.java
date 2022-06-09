package Alert;

import Utils.BrowserUtils;
import org.checkerframework.checker.units.qual.A;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AlertIntro {
    @Test
    public void alertPractice(){
        WebDriver driver=new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
            WebElement jsAlert=driver.findElement(By.xpath("//button[contains(@onclick,'jsAlert()')]"));
            jsAlert.click();
            Alert alert=driver.switchTo().alert();
            String actualMessage=alert.getText();
            String expectedMessage="I am a JS Alert";
            Assert.assertEquals(actualMessage,expectedMessage);
            alert.accept();
            WebElement result=driver.findElement(By.id("result"));
            Assert.assertTrue(BrowserUtils.getText(result).equals("You successfully clicked an alert"));
        }
    @Test
    public void alertDismiss(){

        WebDriver driver=new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        WebElement jsConfirm=driver.findElement(By.xpath("//button[contains(@onclick,'jsAlert()')]"));
        jsConfirm.click();
        Alert alert=driver.switchTo().alert();
        alert.dismiss();
        WebElement result= driver.findElement(By.id("result"));
        Assert.assertTrue(BrowserUtils.getText(result).equals("You clicked: Cancel"));

    }
    @Test
    public void alertSendKeys(){
        WebDriver driver=new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        WebElement jsConfirm=driver.findElement(By.xpath("//button[contains(@onclick,'jsP')]"));
        jsConfirm.click();
        Alert alert =driver.switchTo().alert();
        alert.sendKeys("Techtorial");
        alert.accept();
        WebElement result= driver.findElement(By.id("result"));
        Assert.assertTrue(BrowserUtils.getText(result).equals("You entered: Techtorial"));
    }

    }

