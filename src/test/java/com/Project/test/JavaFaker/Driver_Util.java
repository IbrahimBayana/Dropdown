package com.Project.test.JavaFaker;

import com.Project.Utilies.BrowserUtills;
import com.Project.Utilies.ConfigurationReader;
import com.Project.Utilies.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class Driver_Util {
//    WebDriver driver;
//    @BeforeMethod
//    public void setUp() throws Exception {
//        driver = WebDriverFactory.getDriver(ConfigurationReader.getProperty("browser"));
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
//
//    }
    @Test
    public void Bing_Search() {
        Driver.getDriver().get(ConfigurationReader.getProperty("googleUrl"));

        WebElement search =  Driver.getDriver().findElement(By.xpath("//textarea[@class='sb_form_q']"));
        search.click();

        search.sendKeys(ConfigurationReader.getProperty("searchValue") + Keys.ENTER);

        String expectedTitle = ConfigurationReader.getProperty("searchValue")+ " - Suchen";
        BrowserUtills.sleep(2);
        String actualTitle =  Driver.getDriver().getTitle();
        Assert.assertTrue(actualTitle.equals(expectedTitle));
    }

    public void Bing_Search2() {
        Driver.getDriver().get(ConfigurationReader.getProperty("googleUrl"));

        WebElement search =  Driver.getDriver().findElement(By.xpath("//textarea[@class='sb_form_q']"));
        search.click();

        search.sendKeys(ConfigurationReader.getProperty("searchValue") + Keys.ENTER);

        String expectedTitle = ConfigurationReader.getProperty("searchValue")+ " - Suchen";
        BrowserUtills.sleep(2);
        String actualTitle =  Driver.getDriver().getTitle();
        Assert.assertTrue(actualTitle.equals(expectedTitle));
    }


    @AfterMethod
    public void tearDown() {
        Driver.closeDriver();
    }
}
