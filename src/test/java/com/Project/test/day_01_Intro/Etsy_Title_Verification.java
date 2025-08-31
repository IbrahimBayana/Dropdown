package com.Project.test.day_01_Intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Etsy_Title_Verification {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.etsy.com");

       WebElement a =driver.findElement(By.xpath("//button[@class='wt-btn wt-btn--filled wt-mb-xs-0']"));
       a.click();

       String expectedTitle = "Etsy Deutschland – Kaufe Handgefertigtes, Vintage-Sachen, Spezialanfertigungen und einzigartige Geschenke für alle ein.";

       WebElement t_short = driver.findElement(By.xpath("//input[@id='global-enhancements-search-query']"));
       t_short.sendKeys("t-short" + Keys.ENTER);

       String actualTitle = driver.getTitle();

        System.out.println(actualTitle);

       if(actualTitle.equals(expectedTitle)){
           System.out.println("Title verification passed");
       }
       else{
           System.out.println("Title verification failed");
       }
    }
}
