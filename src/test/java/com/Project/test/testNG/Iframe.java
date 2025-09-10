package com.Project.test.testNG;

import com.Project.Utilies.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class Iframe {
    WebDriver driver;
    @BeforeMethod
    public void Alert_Practice() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        driver.get("http://practice.cydeo.com/iframe");

    }
    @Test
    public void Iframe() {
        driver.switchTo().frame("mce_0_ifr");
        WebElement paragraphText = driver.findElement(By.xpath("//p[.='Your content goes here.']"));
        Assert.assertTrue(paragraphText.isDisplayed(),"not found!");
        driver.switchTo().parentFrame();
        WebElement tagNameh3 = driver.findElement(By.tagName("h3"));
        Assert.assertTrue(tagNameh3.isDisplayed(),"not found!");

    }
}
