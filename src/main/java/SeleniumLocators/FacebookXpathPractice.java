package SeleniumLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookXpathPractice {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        String currentUrl = driver.getCurrentUrl();
        String expectedUrl = "https://www.facebook.com/";
       // System.out.println(currentUrl.equals(expectedUrl)

        WebElement account = driver.findElement(By.xpath("//a[@id='button']"));
        account.sendKeys("crhirtuh");

        WebElement nameLink = driver.findElement(By.linkText("Cristina"));


    }
        /*Facebook Sign up:
        Scenario:
        Open a Chrome browser.
        Navigate to "http://www.fb.com"
        Verify that the page is redirected to "http://www.facebook.com", by getting the current URL.
        Verify that there is a "Create an account" section on the page.
        Make sure you use Thread.sleep after you click create account button.(since it needs little bit time to open window)
        Fill in the text boxes: First Name, Surname, Mobile Number or email address, "Re-enter mobile number", new password.
        Update the date of birth in the drop-down.
         Select gender.
          Click on "Create an account".
          Verify that the account is not created.

*/
    }
