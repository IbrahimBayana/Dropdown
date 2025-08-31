package com.Project.test.day_01_Intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigation {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.google.com");
        String currentTitle = driver.getTitle();
        System.out.println("currentTitle = " + currentTitle);

        Thread.sleep(3000);
        driver.navigate().back();
        Thread.sleep(3000);

        driver.navigate().forward();
        Thread.sleep(3000);
        driver.navigate().refresh();
        driver.navigate().to("https://www.cydeo.com");
        //System.out.println("driver.getTitle() = " + driver.getTitle());
        currentTitle = driver.getTitle();
        System.out.println("currentTitle = " + currentTitle);
        String currentUrl = driver.getCurrentUrl();
        System.out.println("currentUrl = " + currentUrl);

        driver.close();
        driver.quit();


    }
}
