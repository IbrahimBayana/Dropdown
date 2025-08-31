package com.Project.test.day_01_Intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Library_practice {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.netflix.com/de/login");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement erlauben = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button#onetrust-accept-btn-handler")));
        erlauben.click();



        WebElement Email = driver.findElement(By.id(":r0:"));
        Email.sendKeys("ibrahimbay@gmail.com");

        WebElement Password = driver.findElement(By.id(":r3:"));
        Password.sendKeys("74764j");

        WebElement log = driver.findElement(By.tagName("button"));
        log.click();
    }
}
