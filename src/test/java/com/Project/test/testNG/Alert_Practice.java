package com.Project.test.testNG;

import com.Project.Utilies.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Alert_Practice {

    WebDriver driver;
    @BeforeMethod
    public void Alert_Practice() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cydeo.com/javascript_alerts");

    }
    @Test
    public void Alert_Practice1() {
        WebElement jsAlert = driver.findElement(By.xpath("//button[.='Click for JS Alert']"));
        jsAlert.click();

        Alert alert = driver.switchTo().alert();
        alert.accept();

        WebElement SuccessfullyClicked = driver.findElement(By.xpath("//button[.='Click for JS Alert']"));
        Assert.assertTrue(SuccessfullyClicked.isDisplayed(),"not Displayed");

        String expectedText = "Click for JS Alert";
        String actualText = SuccessfullyClicked.getText();
        Assert.assertEquals(actualText,expectedText,"Text not equal");
    }
}
