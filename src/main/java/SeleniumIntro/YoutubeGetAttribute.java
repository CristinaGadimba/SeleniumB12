package SeleniumIntro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class YoutubeGetAttribute {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.youtube.com/");

        /*(GET ATTRIBUTE)
       1-Navigate to the youtube
       2-Search your favorite singer
       3-Store all the song names
       4-click the one that you want "Justin Bieber - Love Yourself (Official Music Video)
        5-Make sure the music is playing and sout(url)   */



        WebElement search = driver.findElement(By.xpath("//input[@id='search']"));
        search.sendKeys("Justin Bieber");

        Thread.sleep(3000);

        WebElement clickbutton = driver.findElement(By.xpath("//button[@id='search-icon-legacy']"));
        clickbutton.click();


        List<WebElement> allsing =  driver.findElements(By.xpath("//a[@id='video-title']"));//23 songs

        for (WebElement sing : allsing){
            // System.out.println(sing.getText().trim()); // there is no text because of you can not se any text

            Thread.sleep(5000);
            System.out.println(sing.getAttribute("title").trim());


            if(sing.getAttribute("area-checked").trim().toUpperCase().contains("Justin Bieber - Love Yourself (Official Music Video")){
                sing.click();
            }
        }


    }
}


