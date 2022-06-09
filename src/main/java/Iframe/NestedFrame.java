package Iframe;

import Utils.BrowserUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NestedFrame {
    @Test
    public void nestedFrameValidation(){
        WebDriver driver=new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/nested_frames");
      //  driver.switchTo().frame("frame-top");//name or id****
      //  driver.switchTo().frame(0);//top
        WebElement frame=driver.findElement(By.name("frame-top"));
        driver.switchTo().frame(frame);
        driver.switchTo().frame("frame-left");
        WebElement message=driver.findElement(By.xpath("//body[contains(text(),'LEFT')]"));
        System.out.println(BrowserUtils.getText(message));
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frame-middle");
        WebElement middle= driver.findElement(By.xpath("//div[@id='content']"));
        System.out.println(BrowserUtils.getText(middle));
        driver.switchTo().parentFrame();//top
        driver.switchTo().frame("frame-right");
        WebElement right=driver.findElement(By.xpath("//body[contains(text(),'RIGHT')]"));
        System.out.println(BrowserUtils.getText(right));
        driver.switchTo().parentFrame();//top
        driver.switchTo().parentFrame();//html
        driver.switchTo().frame("frame-bottom");

    }
}
