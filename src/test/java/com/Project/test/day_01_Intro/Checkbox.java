package com.Project.test.day_01_Intro;

import com.Project.Utilies.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class Checkbox {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://practice.cydeo.com/checkboxes");

        WebElement checkbox= driver.findElement(By.xpath("//input[@name='checkbox1']"));
        WebElement checkbox2= driver.findElement(By.xpath("//input[@name='checkbox2']"));

        System.out.println(checkbox.isSelected());
        System.out.println(checkbox2.isSelected());

        checkbox.click();
        checkbox2.click();

        System.out.println(checkbox.isSelected());
        System.out.println(checkbox2.isSelected());

        driver.navigate().refresh();

        System.out.println("checkbox2.isDisplayed() = " + checkbox2.isDisplayed());
        System.out.println("checkbox.isDisplayed() = " + checkbox.isDisplayed());
    }
}
