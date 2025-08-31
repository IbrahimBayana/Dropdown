package com.Project.test.day_01_Intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class gmail {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");

        WebElement gmailClick = driver.findElement(By.xpath("//button[@id='L2AGLb']"));
        gmailClick.click();
        WebElement email = driver.findElement(By.xpath("//a[@class='gb_X']"));
        email.click();

        String expectedTitle = "Gmail";
        String actualTitle = driver.getTitle();
        if(actualTitle.contains(expectedTitle)){
            System.out.println("Title Match");
        }
        else{
            System.out.println("Title Not Match");
        }

    }
}
