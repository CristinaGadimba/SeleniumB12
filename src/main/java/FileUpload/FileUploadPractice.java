package FileUpload;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FileUploadPractice {
    @Test

public void validateFileUpload(){
        WebDriver driver=new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/upload");
        // /Users/techtorial/Desktop
        WebElement choose=driver.findElement(By.id("file-upload"));
        choose.sendKeys("/Users/ilievcristina/Desktop/usa.png");
        WebElement uploadButton=driver.findElement(By.id("file-submit"));
        uploadButton.click();

    }



}
