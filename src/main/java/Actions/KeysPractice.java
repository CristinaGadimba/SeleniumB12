package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class KeysPractice {
    @Test
    public void keysPractice(){
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com/");
        WebElement searchField= driver.findElement(By.xpath("//input[@name='q']"));
        //searchField.sendKeys("SeleniumSelenium", Keys.ENTER);
        Actions actions=new Actions(driver);
        actions.moveToElement(searchField)
                .click()
                .keyDown(Keys.SHIFT)
                .sendKeys("s")//S
                .keyUp(Keys.SHIFT)
                .sendKeys("elenium")
                .doubleClick()
                .keyDown(Keys.COMMAND)
                .sendKeys("c")
                .keyUp(Keys.COMMAND)
                .sendKeys(Keys.ARROW_RIGHT)
                .keyDown(Keys.COMMAND)
                .sendKeys("v")
                .keyUp(Keys.COMMAND)
                .sendKeys(Keys.RETURN).perform();


    }
}
