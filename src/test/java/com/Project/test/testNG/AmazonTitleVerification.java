package com.Project.test.testNG;

import com.Project.Utilies.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class AmazonTitleVerification {
    WebDriver driver;
    @BeforeMethod
    public void setUp() throws Exception {
        driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.amazon.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
    }


    @Test
    public void AmazonTitleVerification() {

        WebElement title = driver.findElement(By.tagName("title"));
        String expected = "Amazon.com. Spend less. Smile more.";
        String actual = driver.getTitle();
        System.out.println(actual);
        Assert.assertEquals(actual, expected);

    }
    @AfterMethod
    public void tearDown() throws Exception {
        driver.quit();
    }
}
