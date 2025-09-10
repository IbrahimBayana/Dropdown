package com.Project.test.webTables_utilities;

import com.Project.Utilies.ConfigurationReader;
import com.Project.Utilies.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class Bing_Search {
    WebDriver driver;
    @BeforeMethod
    public void setUp() throws Exception {
        driver = WebDriverFactory.getDriver(ConfigurationReader.getProperty("browser"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        driver.get(ConfigurationReader.getProperty("googleUrl"));
    }
    @Test
    public void Bing_Search() {

        WebElement search = driver.findElement(By.xpath("//textarea[@class='sb_form_q']"));
        search.click();

        search.sendKeys(ConfigurationReader.getProperty("searchValue") + Keys.ENTER);

        String expectedTitle = ConfigurationReader.getProperty("searchValue")+ " - Suchen";
        String actualTitle = driver.getTitle();
        Assert.assertTrue(actualTitle.equals(expectedTitle));
    }
}
