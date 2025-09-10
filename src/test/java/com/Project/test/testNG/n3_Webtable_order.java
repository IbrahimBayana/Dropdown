package com.Project.test.testNG;

import com.Project.Utilies.WebDriverFactory;
import com.Project.Utilies.WebOrderUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class n3_Webtable_order {
    WebDriver driver;

    @BeforeMethod
    public void setUp() throws Exception {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        driver.get("https://practice.cydeo.com/web-tables");
    }

    @Test
    public void Webtable_order() {
        WebElement cell = driver.findElement(By.xpath("//table[@class='SampleTable']//td[.='Bob Martin']"));
        cell.getText();

        String expectedText = "Bob Martin";
        String actualText = cell.getText();
        Assert.assertEquals(actualText, expectedText, "names do not match!");


        //WebElement orderDate = driver.findElement(By.xpath("//table[@class='SampleTable']//td[.='Bob Martin']/../td[5]"));
        WebElement orderDate = driver.findElement(By.xpath("//table[@class='SampleTable']//td[.='Bob Martin']/following-sibling::td[3]"));

        System.out.println("orderDate.getText() = " + orderDate.getText());

        String expectedOrderDate = "12/31/2021";
        String actualOrderDate = orderDate.getText();
        Assert.assertEquals(actualOrderDate, expectedOrderDate, "names do not match!");

    }

    public void use_Order_Method() {
        System.out.println(WebOrderUtils.returnDate(driver, "Alexandra Gray"));

    }
    public void orderDate(){
        WebOrderUtils.returnDate(driver, "Alexandra Gray");
    }
    public void Verify (){
        WebOrderUtils.orderVerify(driver,"Bob Martin","12/31/2021");
    }
}