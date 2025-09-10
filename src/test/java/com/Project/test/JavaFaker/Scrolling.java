package com.Project.test.JavaFaker;

import com.Project.Utilies.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Scrolling {
    @Test
    public void Scrolling_practice() {
        Driver.getDriver().get("https://practice.cydeo.com/");

        WebElement link = Driver.getDriver().findElement(By.linkText("CYDEO"));

        Actions actions = new Actions(Driver.getDriver());
//        actions.moveToElement(link).perform();
        actions.sendKeys(Keys.PAGE_DOWN,Keys.PAGE_DOWN,Keys.PAGE_DOWN,Keys.PAGE_DOWN,Keys.PAGE_DOWN).perform();


    }
}
