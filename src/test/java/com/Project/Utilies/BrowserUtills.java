package com.Project.Utilies;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.util.Set;

public class BrowserUtills {
    public static void sleep(int second){
        second *= 1000;
        try {
            Thread.sleep(second);
        }
        catch (InterruptedException e){

        }
    }
    public static void switchWindowAndVerify(WebDriver driver, String expectedInUrl, String expectedTitle) {

        Set<String> windowHandles = driver.getWindowHandles();
        for (String windowHandle : windowHandles) {
            driver.switchTo().window(windowHandle);
            System.out.println(driver.getCurrentUrl() + "  Current Url");
            if(driver.getCurrentUrl().contains(expectedInUrl)){
                break;
            }
        }
        String actualWindowHandle = driver.getTitle();

        Assert.assertTrue(actualWindowHandle.contains(expectedTitle));

    }
    public static void verifyTitleContains(WebDriver driver, String expectedTitle) {
    String actualTitle = driver.getTitle();
    Assert.assertTrue(actualTitle.contains(expectedTitle));
    }
    public static void verifyTitle(WebDriver driver, String expectedTitle) {
    String actualTitle = driver.getTitle();
    Assert.assertTrue(actualTitle.equals(expectedTitle));
    }
    }

