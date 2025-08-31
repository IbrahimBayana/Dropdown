package com.Project.test.day_01_Intro;

import com.Project.Utilies.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Locators_getText {
    public static void main(String[] args) {

       // WebDriverManager.chromedriver().setup();
        //WebDriver driver = new ChromeDriver();
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://login1.nextbasecrm.com/");

        WebElement inputUserName = driver.findElement(By.className("login-inp"));
        inputUserName.sendKeys("ibrahim");

        WebElement inputPassword = driver.findElement(By.className("login-inp"));
        inputPassword.sendKeys("ibrahim");

        WebElement inputLogin = driver.findElement(By.className("login-btn"));
        inputLogin.click();

        String errorText = "errortext";
        String actualText = driver.findElement(By.className("errortext")).getText();

        if(actualText.equals(errorText)){
            System.out.println("Success");
        }
        else{
            System.out.println("Failure");
        }
    }
}
