package com.Project.test.testNG;

import com.Project.Utilies.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class n1_dropDowns_task1 {
    WebDriver driver;
    @BeforeMethod
            public void setUp() throws Exception {
        driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cydeo.com/dropdown");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
    }

    @Test
    public void dropDowns_task1() throws InterruptedException {

        Select year = new Select(driver.findElement(By.xpath("//select[@id='year']")));
        Thread.sleep(2000);
        year.selectByVisibleText("1933");
        Select month = new Select(driver.findElement(By.xpath("//select[@id='month']")));
        month.selectByValue("11");
        Select day = new Select(driver.findElement(By.xpath("//select[@id='day']")));
        day.selectByIndex(0);

        String expectedYear = "1933";
        String expectedMonth = "December";
        String expectedDay = "1";

        String actualYear = year.getFirstSelectedOption().getText();
        String actualMonth = month.getFirstSelectedOption().getText();
        String actualDay = day.getFirstSelectedOption().getText();

        Assert.assertEquals(actualYear, expectedYear);
        Assert.assertEquals(actualMonth, expectedMonth);
        Assert.assertEquals(actualDay, expectedDay);
    }
    @Test
    public void dropDowns_task2() {
        Select illionios = new Select(driver.findElement(By.xpath("//select[@id='state']")));
        illionios.selectByValue("IL");
        illionios.selectByValue("VA");
        illionios.selectByIndex(5);

        String expectedOptionText = "California";
        String actualOptionText = illionios.getFirstSelectedOption().getText();

        Assert.assertEquals(actualOptionText, expectedOptionText);



    }
    @Test
    public void dropDowns_task3() throws InterruptedException {

        WebElement clickted = driver.findElement(By.xpath("//a[@class='btn btn-secondary dropdown-toggle']"));
        clickted.click();
        Thread.sleep(2000);

        WebElement clickFacebook = driver.findElement(By.linkText("Facebook"));
        clickFacebook.click();
        Thread.sleep(2000);
WebElement cookiesAkzept = driver.findElement(By.xpath("(//div[@class='x9f619 x1n2onr6 x1ja2u2z x78zum5 xdt5ytf x193iq5w xeuugli x1iyjqo2 xs83m0k x11lfxj5 x135b78x xjkvuk6 x1iorvi4 xdl72j9'])[2]"));
Thread.sleep(2000);
        cookiesAkzept.click();

        String expectedTitle = "Facebook – Anmelden oder Registrieren";
        String actualTitle = driver.getTitle();

Assert.assertEquals(actualTitle, expectedTitle,"it is not found!!!");


    }







    @AfterMethod
    public void tearDown() throws Exception {
        //driver.close();
    }
}
