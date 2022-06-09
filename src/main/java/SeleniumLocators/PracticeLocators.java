package SeleniumLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

////THESE PARTS SHOULD BE DONE BY XPATH:
//1-Navigate to the https://katalon-demo-cura.herokuapp.com/
//2-Click Make an Appointment
//3-Login the username and password provided and Login successfully
//4-Choose the facility either HongKong or Seoul
//5-Click apply for hospital admission box
//6-Healhcare program 'Medicaid'
//7-Visit date should be provided
//8-Put your commend for this box
//9-Book your appointment
//THESE PARTS SHOULD BE DONE BY CONTAINS or . XPATH METHOD
//10-Print out the headers and values(only values) on your console.

public class PracticeLocators {
    public static void main(String[] args) {
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://katalon-demo-cura.herokuapp.com/");
        WebElement appoitment= driver.findElement(By.xpath("//a[@id='btn-make-appointment'])"));
        appoitment.click();

    }
}
