package com.Project.test.day_01_Intro;

import com.Project.Utilies.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class tagName {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://www.amazon.de/");

        List<WebElement> listOfElement = driver.findElements(By.tagName("a"));
        System.out.println("sizeOfElement.size() = " + listOfElement.size());
        
        for(WebElement element : listOfElement){
            System.out.println("element = " + element);
            System.out.println("element.getAttribute(\"href\") = " + element.getAttribute("href"));
        }
    }
}
