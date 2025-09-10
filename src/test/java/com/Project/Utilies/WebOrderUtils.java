package com.Project.Utilies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class WebOrderUtils {
    public static String returnDate(WebDriver driver, String custumerName) {
        String locator = "//td[.='" + custumerName + "']/following-sibling::td[3]";
        WebElement custumerDateCell = driver.findElement(By.xpath(locator));

        return custumerDateCell.getText();

    }

    public static void orderVerify(WebDriver driver, String custumerName,String expectedOrderDate) {
        String locator = "//td[.='" + custumerName + "']/following-sibling::td[3]";
        WebElement custumerDateCell = driver.findElement(By.xpath(locator));

        String actualTitle = custumerDateCell.getText();
        Assert.assertEquals(actualTitle,expectedOrderDate);

    }
}
