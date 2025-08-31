package com.Project.test.testNG;

import com.Project.Utilies.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class SimpleDropDown {
    WebDriver driver;
    @BeforeMethod
    public void setUp() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.amazon.de/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
    }
    @Test
    public void simpleDropDown_test() {
        WebElement simpleDropDown = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
        Select select = new Select(simpleDropDown);

        String expectedText = "Alle Kategorien";
        String actualText = select.getFirstSelectedOption().getText();

        Assert.assertTrue(actualText.equals(expectedText));


    }
}
