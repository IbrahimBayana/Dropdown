package com.Project.test.day_01_Intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.google.com");
       WebElement clock = driver.findElement(By.id("L2AGLb"));
       clock.click();

       WebElement search = driver.findElement(By.name("q"));
       search.sendKeys("apple" + Keys.ENTER);


       String expectedInBeginningOfTitle = "apple";
       String actualInBeginningOfTitle = driver.getTitle();

       if(actualInBeginningOfTitle.startsWith(expectedInBeginningOfTitle)){
           System.out.println(expectedInBeginningOfTitle);
       }
       else {
           System.out.println(actualInBeginningOfTitle);
       }


    }
}
