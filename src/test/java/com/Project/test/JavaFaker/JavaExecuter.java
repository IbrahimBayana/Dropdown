package com.Project.test.JavaFaker;

import com.Project.Utilies.BrowserUtills;
import com.Project.Utilies.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class JavaExecuter {
    @Test
    public void JSExecutor() {
        Driver.getDriver().get("https://practice.cydeo.com/infinite_scroll");

        //((JavascriptExecutor) Driver.getDriver()).executeScript("window.scrollBy(0,750)");

        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        BrowserUtills.sleep(2);
        for (int i =0;i<10;i++){
            BrowserUtills.sleep(2);
            js.executeScript("window.scrollBy(0, 750)");

        }
        for (int i =0;i<10;i++){
            BrowserUtills.sleep(2);
            js.executeScript("window.scrollBy(0,-750)");

        }


    }
}
