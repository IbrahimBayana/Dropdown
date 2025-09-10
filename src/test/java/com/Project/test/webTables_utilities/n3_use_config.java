package com.Project.test.webTables_utilities;

import com.Project.Utilies.ConfigurationReader;
import com.Project.Utilies.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class n3_use_config {
    WebDriver driver;

    @BeforeMethod
    public void setUp() throws Exception {
        driver = WebDriverFactory.getDriver(ConfigurationReader.getProperty("browser"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get(ConfigurationReader.getProperty("googleUrl"));
    }

    @Test
    public void use_config() {
        WebElement cookies = driver.findElement(By.xpath("//div[.='Alle akzeptieren']"));
        cookies.click();

        WebElement input = driver.findElement(By.xpath("//textarea[@class='gLFyf']"));
        input.sendKeys(ConfigurationReader.getProperty("searchValue") + Keys.ENTER);

        String expected = ConfigurationReader.getProperty("searchValue") +" - Google Suche";
//        BrowserUtills.sleep(20);
//        String actual = driver.getTitle();
//        Assert.assertTrue(actual.contains(expected));

    }
}
