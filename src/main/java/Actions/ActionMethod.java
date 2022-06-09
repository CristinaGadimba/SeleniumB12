package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;

public class ActionMethod {
    @Test
    public void ContextClick() {

        //contextClick-->Right click
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        WebElement contextLink = driver.findElement(By.partialLinkText("Context"));
        contextLink.click();
        WebElement box = driver.findElement(By.id("hot-spot"));
        Actions actions = new Actions(driver);
        actions.contextClick().perform();

    }

    @Test
    public void ContextClickPractice2() {

        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/test/simple_context_menu.html");
        WebElement button = driver.findElement(By.xpath("//span[contains(text(),'right click me')]"));
        Actions actions = new Actions(driver);
        actions.contextClick(button).perform();
    }

    @Test
    public void DoubleClick() {

        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/test/simple_context_menu.html");
        WebElement button = driver.findElement(By.xpath("//button[contains(text(),'Double-click')]"));
        Actions actions = new Actions(driver);
        actions.doubleClick(button).perform();
    }
    @Test
    public void DoubleClickPractice(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://selenium08.blogspot.com/2019/11/double-click.html");
        WebElement button = driver.findElement(By.xpath("//button[.'Double-Click me to see Alert message']"));
        Actions actions=new Actions(driver);
        actions.doubleClick(button).perform();
    }
}