package SelectClass;

import Utils.BrowserUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class SelectPractice {
    @Test
    public void validationOfTripButton() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/test/newtours/reservation.php");
        WebElement oneway = driver.findElement(By.xpath("//input[@value='oneway']"));
        oneway.click();
        Assert.assertTrue(oneway.isDisplayed());//returns boolean condition
        //It is coming from system which means your actual
        //AssertTrue-->is your expectation from condition
        // Assert.assertEquals(oneway.isDisplayed(),true);
        Assert.assertTrue(oneway.isSelected());
    }

    @Test
    public void validationPassengerAndMessage() {
        /*
   1-Navigate to the website
   2-Validate the round trip is selected
   3-Choose 3 passenger from the options
   4-validate departing from is "Acapulco"
   5-Choose the departure as "Paris"
   6-Choose the date August 13
   7-Choose Arriving in New York
   8-Choose returning September 28
   9-Choose First Class from option
   10-Get all the options and validate these options as expected.(You can use asList Method)
   11-Click Continue
   12-Validate the no seats available.(this one should fail). Take a screen shot and send
   it to the developer (Ahmet).
 */
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/test/newtours/reservation.php");
        WebElement roundTrip = driver.findElement(By.xpath("//input[@ value='roundtrip']"));
        roundTrip.click();
        WebElement passanger = driver.findElement(By.name("passCount"));
        Select passangerBox = new Select(passanger);
        passangerBox.selectByVisibleText("3");
        WebElement departFrom = driver.findElement(By.name("fromPort"));
        Select departFromBox = new Select(departFrom);
        String actualResult = departFromBox.getFirstSelectedOption().getText().trim();
        String expectedResult = "Acapulco";
        Assert.assertEquals(actualResult, expectedResult);
        departFromBox.selectByValue("Paris");
        WebElement fromOn = driver.findElement(By.name("fromMonth"));
        Select fromOnBox = new Select(fromOn);
        fromOnBox.selectByVisibleText("August");
        WebElement fromDate = driver.findElement(By.name("fromDay"));
        Select fromDateBox = new Select(fromDate);
        fromDateBox.selectByIndex(12);
        WebElement toPort = driver.findElement(By.name("toPort"));
        Select toPortBox = new Select(toPort);
        toPortBox.selectByValue("New York");
        WebElement toPortDate = driver.findElement(By.name("toMonth"));
        Select toPortDateBox = new Select(toPortDate);
        toPortDateBox.selectByValue("9");
        WebElement toPortDay = driver.findElement(By.name("toDay"));
        Select toPortDayBox = new Select(toPortDay);
        toPortDayBox.selectByVisibleText("28");
        WebElement classForTrip = driver.findElement(By.xpath("//input[@value='First']"));
        classForTrip.click();
        WebElement option = driver.findElement(By.xpath("//select[@name='airline']"));
        Select airlineBox = new Select(option);
        List<WebElement> allOption = airlineBox.getOptions();//i have all options
        List<String> actualOptions = new ArrayList<>();
        List<String> expectedOption = Arrays.asList("No Preference", "Blue Skies Airlines", "Unified Airlines", "Pangea Airlines");
        //this is coming rom acceptance criteria
        for (WebElement options : allOption) {//this is coming from system
            actualOptions.add(options.getText().trim());
        }
        Assert.assertEquals(actualOptions, expectedOption);
        WebElement continueButton = driver.findElement(By.name("findFlights"));
        continueButton.click();
        WebElement message = driver.findElement(By.xpath(("//font[@face='Arial, Helvetica, sans-serif']//font[@size='4']")));
        System.out.println(message.getText().trim());
        String actualMessage = message.getText().trim();
        String expectedMessage = ("After flight finder - No Seats Available  ");
        Assert.assertEquals(actualMessage, expectedMessage);

    }
        @Test
                public void validationPassengerSecondWay(){
            WebDriver driver = new ChromeDriver();
            driver.get("https://demo.guru99.com/test/newtours/reservation.php");
            WebElement roundTrip = driver.findElement(By.xpath("//input[@ value='roundtrip']"));
            roundTrip.click();
            WebElement passanger = driver.findElement(By.name("passCount"));
            //Select passangerBox = new Select(passanger);
           // passangerBox.selectByVisibleText("3");
            BrowserUtils.selectBy(passanger,"3","text");
            WebElement departFrom = driver.findElement(By.name("fromPort"));
            Select departFromBox = new Select(departFrom);
            String actualResult = departFromBox.getFirstSelectedOption().getText().trim();
            String expectedResult = "Acapulco";
            Assert.assertEquals(actualResult, expectedResult);
            departFromBox.selectByValue("Paris");
            WebElement fromOn = driver.findElement(By.name("fromMonth"));
           // Select fromOnBox = new Select(fromOn);
           //fromOnBox.selectByVisibleText("August");
            BrowserUtils.selectBy(fromOn,"August","text");
            WebElement fromDate = driver.findElement(By.name("fromDay"));
           // Select fromDateBox = new Select(fromDate);
          //  fromDateBox.selectByIndex(12);
            BrowserUtils.selectBy(fromDate,"12","index");
            WebElement toPort = driver.findElement(By.name("toPort"));
           // Select toPortBox = new Select(toPort);
           // toPortBox.selectByValue("New York");
            BrowserUtils.selectBy(toPort,"New York","value");
            WebElement toPortDate = driver.findElement(By.name("toMonth"));
          //  Select toPortDateBox = new Select(toPortDate);
           // toPortDateBox.selectByValue("9");
            BrowserUtils.selectBy(toPortDate,"9","value");
            WebElement toPortDay = driver.findElement(By.name("toDay"));
           // Select toPortDayBox = new Select(toPortDay);
            //   toPortDayBox.selectByVisibleText("28");
            BrowserUtils.selectBy(toPortDay,"28","text");
            WebElement classForTrip = driver.findElement(By.xpath("//input[@value='First']"));
            classForTrip.click();
            WebElement option = driver.findElement(By.xpath("//select[@name='airline']"));
            Select airlineBox = new Select(option);
            List<WebElement> allOption = airlineBox.getOptions();//i have all options
            List<String> actualOptions = new ArrayList<>();
            List<String> expectedOption = Arrays.asList("No Preference", "Blue Skies Airlines", "Unified Airlines", "Pangea Airlines");
            //this is coming rom acceptance criteria
            for (WebElement options : allOption) {//this is coming from system
                actualOptions.add(options.getText().trim());
            }
            Assert.assertEquals(actualOptions, expectedOption);
            WebElement continueButton = driver.findElement(By.name("findFlights"));
            continueButton.click();
            WebElement message = driver.findElement(By.xpath(("//font[@face='Arial, Helvetica, sans-serif']//font[@size='4']")));
            System.out.println(message.getText().trim());
            String actualMessage = message.getText().trim();
            String expectedMessage = ("After flight finder - No Seats Availalble");
            Assert.assertEquals(actualMessage, expectedMessage);


        }









}

