package SelectClass;

import Utils.BrowserUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class MultiSelect {
    @Test
    public void practiceMultiSelect(){
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("file:///Users/ilievcristina/Desktop/Techtorialhtml.html");
       WebElement countryList= driver.findElement(By.xpath("//select[@class='select']"));
        BrowserUtils.selectBy(countryList,"1","value");
        BrowserUtils.selectBy(countryList,"Two","text");
        BrowserUtils.selectBy(countryList,"4","index");

        Select select =new Select(countryList);
        select.deselectByVisibleText("One");
        select.deselectAll();
    }
}
