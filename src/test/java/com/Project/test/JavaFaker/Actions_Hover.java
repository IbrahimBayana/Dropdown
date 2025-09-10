package com.Project.test.JavaFaker;

import com.Project.Utilies.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Actions_Hover {
    @Test
    public void hovering_test(){
        Driver.getDriver().get("https://practice.cydeo.com/hovers");

        WebElement image1= Driver.getDriver().findElement(By.xpath("(//img)[1]"));
        WebElement image2= Driver.getDriver().findElement(By.xpath("(//img)[2]"));
        WebElement image3= Driver.getDriver().findElement(By.xpath("(//img)[3]"));

        WebElement user1= Driver.getDriver().findElement(By.xpath("(//h5)[1]"));
        WebElement user2= Driver.getDriver().findElement(By.xpath("(//h5)[2]"));
        WebElement user3= Driver.getDriver().findElement(By.xpath("(//h5)[3]"));

        Actions actions = new Actions(Driver.getDriver());

        actions.moveToElement(image1).perform();
        Assert.assertTrue(image1.isDisplayed());

        actions.moveToElement(image2).perform();
        Assert.assertTrue(image2.isDisplayed());

        actions.moveToElement(image3).perform();
        Assert.assertTrue(image3.isDisplayed());



        Driver.closeDriver();



    }

}
