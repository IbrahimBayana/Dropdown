package com.Project.test.JavaFaker;

import com.Project.Utilies.BrowserUtills;
import com.Project.Utilies.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Actions_Practices {
    @BeforeMethod
    public void setUp() {
        Driver.getDriver().get("https://practice.cydeo.com/drag_and_drop_circles");

    }
    @AfterMethod
    public void tearDown() {
        BrowserUtills.sleep(3);
       // Driver.closeDriver();
    }
    @Test
    public void Actions_Practices1_value_verification() {

        WebElement bigCircle = Driver.getDriver().findElement(By.id("droptarget"));

        String expectedText = "Drag the small circle here.";
        String actualText = bigCircle.getText();
        assertTrue(actualText.equals(expectedText));
    }
    @Test
    public void Actions_Practices2_value_verification() {
        WebElement bigCircle = Driver.getDriver().findElement(By.id("droptarget"));
        WebElement smallCircle = Driver.getDriver().findElement(By.id("draggable"));

        Actions actions = new Actions(Driver.getDriver());
        //actions.dragAndDrop(smallCircle, bigCircle).perform();
        WebElement link = Driver.getDriver().findElement(By.linkText("CYDEO"));


        actions.clickAndHold(smallCircle).pause(1000).moveToElement(link).pause(1000).perform();


        String expectedText = "Drop here.";
        String actualText = bigCircle.getText();
        assertTrue(actualText.equals(expectedText));



    }

    @Test
    public void Actions_Practices3_value_verification() {
        WebElement bigCircle = Driver.getDriver().findElement(By.id("droptarget"));
        WebElement smallCircle = Driver.getDriver().findElement(By.id("draggable"));

        Actions actions = new Actions(Driver.getDriver());

        //actions.dragAndDrop(smallCircle, bigCircle).perform();
WebElement link = Driver.getDriver().findElement(By.linkText("CYDEO"));
        actions.clickAndHold(smallCircle).pause(1000).moveToElement(link).pause(1000).release().perform();



        String expectedText = "Try again!";
        String actualText = bigCircle.getText();
        assertTrue(actualText.equals(expectedText));



    }

    @Test
    public void Actions_Practices4_value_verification() {
        WebElement bigCircle = Driver.getDriver().findElement(By.id("droptarget"));
        WebElement smallCircle = Driver.getDriver().findElement(By.id("draggable"));

        Actions actions = new Actions(Driver.getDriver());

        //actions.dragAndDrop(smallCircle, bigCircle).perform();
        WebElement link = Driver.getDriver().findElement(By.linkText("CYDEO"));
        actions.clickAndHold(smallCircle).pause(1000).moveToElement(link).pause(1000).release().perform();



        String expectedText = "Try again!";
        String actualText = bigCircle.getText();
        assertTrue(actualText.equals(expectedText));



    }

    @Test
    public void Actions_Practices5_value_verification() {
        WebElement bigCircle = Driver.getDriver().findElement(By.id("droptarget"));
        WebElement smallCircle = Driver.getDriver().findElement(By.id("draggable"));

        Actions actions = new Actions(Driver.getDriver());

        //actions.dragAndDrop(smallCircle, bigCircle).perform();
        actions.clickAndHold(smallCircle).pause(1000).moveToElement(bigCircle).pause(1000).perform();



        String expectedText = "Now drop...";
        String actualText = bigCircle.getText();
        assertTrue(actualText.equals(expectedText));



    }
}
