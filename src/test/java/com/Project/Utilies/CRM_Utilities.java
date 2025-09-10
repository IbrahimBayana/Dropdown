package com.Project.Utilies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CRM_Utilities {
    public static void login_crm(WebDriver driver, String username, String password, String xpath,String xpaht2) {
        WebElement inputUserName = driver.findElement(By.xpath(xpath));
        inputUserName.sendKeys(username);

        WebElement inputUserSurname = driver.findElement(By.xpath(xpaht2));
        inputUserSurname.sendKeys(password);

        WebElement loginBtn = driver.findElement(By.xpath("//input[@value='Log In']"));
        loginBtn.click();

    }
}
