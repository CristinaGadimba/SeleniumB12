package SeleniumLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsIntro {
    public static void main(String[] args) {
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        //locator ID
        driver.get("file:///Users/ilievcristina/Desktop/Techtorialhtml.html");
        WebElement header= driver.findElement(By.id("techtorial1"));
        header.getText();
        String actualHeader=header.getText();
        String expectedHeader="Techtorial Academy";
        if(actualHeader.equals(expectedHeader)){
            System.out.println("passed");

        }else{
            System.out.println("failed");
        }
        WebElement header1= driver.findElement(By.id("details2"));
        System.out.println(header1.getText());

     //LOCATOR:CLASS
       WebElement allTools=driver.findElement(By.className("group_checkbox"));
        System.out.println(allTools.getText());

       // LOCATOR:NAME
        WebElement nameBox=driver.findElement(By.name("firstName"));
        nameBox.sendKeys("Cristina");
        WebElement lastNameBox=driver.findElement(By.name("lastName"));
        lastNameBox.sendKeys("Gadimba");

        WebElement phoneBox=driver.findElement(By.name("phone"));
        phoneBox.sendKeys("6146329311");
        WebElement emailBox=driver.findElement(By.name("userName"));
        emailBox.sendKeys("cristinagadimba@gmail.com");

        //click(),isSelected(),isDisplayed()

        WebElement javaBox=driver.findElement(By.id("cond1"));
        System.out.println(javaBox.isDisplayed());//boolean(true)
        System.out.println(javaBox.isSelected());//boolean(false)
        javaBox.click();//it clicks the box,button..(element)
        //System.out.println(javaBox.isSelected());//boolean(true)

        WebElement SeleniumBox=driver.findElement(By.id("cond2"));
        System.out.println(SeleniumBox.isDisplayed());//boolean(true)
        SeleniumBox.click();//it clicks the box,button..(element)
        System.out.println(SeleniumBox.isSelected());//boolean

        WebElement TestNGBox=driver.findElement(By.id("cond3"));
        System.out.println(TestNGBox.isDisplayed());//boolean(true)
        TestNGBox.click();//it clicks the box,button..(element)
        System.out.println(TestNGBox.isSelected());//boolean


        WebElement CucumberBox=driver.findElement(By.id("cond4"));
        System.out.println(CucumberBox.isDisplayed());//boolean(true)
        CucumberBox.click();//it clicks the box,button..(element)
        System.out.println(CucumberBox.isSelected());//boolean



    }
}
