package com.Project.test.day_01_Intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class URL_Practice_Tool {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://practice.cydeo.com");

String expected = "cydeo";
        String Url = driver.getCurrentUrl();

        if(Url.contains(expected)){
            System.out.println("Passed");
                    }
        else {
            System.out.println("invalid");
        }

        String title = driver.getTitle();
        System.out.println("title = " + title);
        driver.quit();

    }
}
