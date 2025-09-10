package com.Project.test.JavaFaker;

import com.Project.Utilies.BrowserUtills;
import com.Project.Utilies.Driver;
import com.Project.pages.DynamicLoadPage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class ExplicitWait {

    @Test
    public void testExplicitWait_Changes() throws InterruptedException {
        Driver.getDriver().get("https://practice.cydeo.com/dynamic_loading/7");
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.titleIs(Driver.getDriver().getTitle()));
        DynamicLoadPage dynamicLoadPage = new DynamicLoadPage();
        Assert.assertTrue(dynamicLoadPage.doneButton.isDisplayed());
        BrowserUtills.sleep(2);
        Assert.assertTrue(dynamicLoadPage.spongeBobImage.isDisplayed());


    }
}
