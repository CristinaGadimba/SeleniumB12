package Alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SweetAlertPractice {
    @Test
    public void sweetAlert(){
        WebDriver driver=new ChromeDriver();
        driver.get("https://sweetalert.js.org/");
        WebElement NormalPreviewButton=driver.findElement(By.xpath("//button[contains@onclick,'alert')]"));
        NormalPreviewButton.click();
        Alert alert=driver.switchTo().alert();
        String actualText= alert.getText();
        String expectedText="Oops,something went wrong!";
        Assert.assertEquals(actualText,expectedText);
        alert.accept();
        WebElement sweetPreviewButton=driver.findElement(By.xpath("//button[contains@onclick,'swal')]"));
        sweetPreviewButton.click();
       // Alert alert1=driver.switchTo().alert();//i cannot handle HTML pop-ups with Alert interface
      //  alert1.accept();
        WebElement clickOk= driver.findElement(By.xpath("//button[@class= 'swal-button swal-button--confirm']"));
        clickOk.click();
    }
}
