package com.Project.test.webTables_utilities;

import com.Project.Utilies.BrowserUtills;
import com.Project.Utilies.WebDriverFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class n1_WindowsHandlling {
    WebDriver driver;
    @BeforeMethod
    public void SetUp() {
        driver = WebDriverFactory.getDriver("chrome");
       // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        driver.get("https://www.amazon.com");

    }
    @Test
    public void n1_WindowsHandlling() {
        ((JavascriptExecutor) driver).executeScript("window.open('https://google.com', '_blank');");
        ((JavascriptExecutor) driver).executeScript("window.open('https://etsy.com', '_blank');");
        ((JavascriptExecutor) driver).executeScript("window.open('https://facebook.com', '_blank');");

        BrowserUtills.switchWindowAndVerify(driver,"etsy","Etsy");
    }

}
