package com.Project.test.day_01_Intro;

import com.Project.Utilies.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class xpath_cssSelector {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://practice.cydeo.com/forgot_password");

        //WebElement home = driver.findElement(By.cssSelector("a[class='nav-link']"));

        WebElement home = driver.findElement(By.cssSelector("a.nav-link"));
        System.out.println(home.getText());

        WebElement home1 = driver.findElement(By.cssSelector("a[href='/']"));
        System.out.println("home1.getText() = " + home1.getText());
        WebElement password = driver.findElement(By.xpath("//h2[.='Forgot Password']"));
        System.out.println(password.getText());

        WebElement password1 = driver.findElement(By.cssSelector("div.example>h2"));
        System.out.println(password1.getText());
        WebElement email = driver.findElement(By.xpath("//label[@for='email']"));
        System.out.println(email.getText());
        WebElement email1 = driver.findElement(By.xpath("//label[.='E-mail']"));
        System.out.println("email1.isDisplayed() = " + email1.isDisplayed());
        WebElement inputbox = driver.findElement(By.xpath("//input[@name='email']"));
        System.out.println("inputbox.isDisplayed() = " + inputbox.isDisplayed());

    }
}
