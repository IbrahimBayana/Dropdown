package com.Project.test.JavaFaker;

import com.Project.Utilies.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class JSExecuter_Scroll {
    @Test
    public void JSExe_Scroll_using() {
        Driver.getDriver().get("https://practice.cydeo.com/large");
//for (int i = 0; i < 7; i++) {
//    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
//    js.executeScript("window.scrollBy(0,750)");
  //  }

        WebElement link = Driver.getDriver().findElement(By.linkText("CYDEO"));
        WebElement HomeLink = Driver.getDriver().findElement(By.linkText("Home"));

        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[1].scrollIntoView(true);", link, HomeLink);

//        Actions action = new Actions(Driver.getDriver());
//        action.moveToElement(link).perform();

    }
}
