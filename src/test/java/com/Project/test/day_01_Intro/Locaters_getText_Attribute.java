package com.Project.test.day_01_Intro;

import com.Project.Utilies.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Locaters_getText_Attribute {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://login1.nextbasecrm.com/");

        String expectedText = "Remember me on this computer";
        String actualText = driver.findElement(By.className("login-item-checkbox-label")).getText();
        if (actualText.equals(expectedText)) {
            System.out.println("true "+actualText);
        }
        else {
            System.out.println("false " +expectedText);
        }

        String forgotExpectedText = "Forgot your password?";

        WebElement forgotPasword = driver.findElement(By.className("login-link-forgot-pass"));
        String forgotPaswordText = forgotPasword.getText();

        if (forgotPaswordText.equals(forgotExpectedText)) {
            System.out.println("true "+ forgotPasword);
        }
        else {
            System.out.println("false " +forgotExpectedText);
        }

        String expectedHrefValue = "forgot";
        String actualHrefValue = forgotPasword.getAttribute("href");

        if (actualHrefValue.contains(expectedHrefValue)) {
            System.out.println("true "+ actualHrefValue);
        }
        else {
            System.out.println("false " +expectedHrefValue);
        }
        WebElement login1 = driver.findElement(By.cssSelector("input[value='Log In']"));
        String login1Text = login1.getText();
        System.out.println(login1Text);
    }
}
