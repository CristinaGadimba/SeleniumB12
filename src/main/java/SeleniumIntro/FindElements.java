package SeleniumIntro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindElements {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("file:///Users/ilievcristina/Desktop/Techtorialhtml.html");
       List <WebElement> allCheckedBoxes=driver.findElements(By.xpath("//input[@type='checkbox']"));

       for(WebElement checkbox:allCheckedBoxes){
           System.out.println(checkbox.isSelected());
           if(checkbox.isSelected()==false){
               checkbox.click();
           }
           System.out.println(checkbox.isSelected());
       }
    }
}
