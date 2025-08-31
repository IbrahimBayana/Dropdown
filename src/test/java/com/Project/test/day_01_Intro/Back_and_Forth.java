package com.Project.test.day_01_Intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Back_and_Forth {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://practice.cydeo.com");
        driver.findElement(By.linkText("A/B Testing")).click();

       String expectedTitle = "No A/B Test";
       String actualeTitle = driver.getTitle();
       if (actualeTitle.equals(expectedTitle)) {
           System.out.println(expectedTitle);
       }
       else {
           System.out.println("False");
       }
       driver.navigate().back();

       expectedTitle = "Practice";
       actualeTitle = driver.getTitle();
       if (actualeTitle.equals(expectedTitle)) {
           System.out.println(expectedTitle);
       }else {
           System.out.println("False");
       }


    }
}
