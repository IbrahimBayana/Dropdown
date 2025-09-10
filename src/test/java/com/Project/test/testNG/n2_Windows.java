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

public class n2_Windows {
    WebDriver driver;
    @BeforeMethod
    public void Alert_Practice() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        driver.get("http://practice.cydeo.com/windows");

    }
    @Test
    public void multiple_Windows() {
        String getTitle = driver.getTitle();
        System.out.println("getTitle = " + getTitle);

        WebElement click = driver.findElement(By.linkText("Click Here"));
        click.click();

        String mainHandle = driver.getWindowHandle();

        System.out.println("title2 = " + driver.getTitle());

        for (String handle : driver.getWindowHandles()) {
            driver.switchTo().window(handle);
            System.out.println("driver.getTitle() = " + driver.getTitle());

            String handle1 = driver.getWindowHandle();
            System.out.println("handle1 = " + handle1);


        }
        String expected = "New Window";
        String actual = driver.getTitle();
        Assert.assertEquals(actual, expected);

        driver.switchTo().window(mainHandle);


    }
    @AfterMethod
    public void quit() {
        driver.quit();
    }
}
