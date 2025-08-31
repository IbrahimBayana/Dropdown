package com.Project.test.day_01_Intro;

import com.Project.Utilies.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;
import java.util.List;

public class T12_radio_button {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.amazon.de/Ferrero-Nutella-Brotaufstrich-Schokolade-1000g/dp/B01NCB49Z8?source=ps-sl-shoppingads-lpcontext&ref_=fplfs&psc=1&smid=A3OGQ2F1H58O4");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        List<WebElement> radioButton = driver.findElements(By.xpath("//input[@role='radio']"));
        for (WebElement radioButtonElement : radioButton) {
String actualId = driver.findElements(By.xpath("//input[@class='a-button-input']")).get(0).getAttribute("value");
            System.out.println(actualId + "......actualId ");
            
        }
    }

    private static void clickAndVerifyRadioButton(WebDriver driver,String nameAttribute, String expectedValue) {
        List<WebElement> radioButton = driver.findElements(By.name(nameAttribute));
        for (WebElement each : radioButton) {
            String actualId = each.getAttribute("id");
            System.out.println("...actualId " + actualId);
            if (actualId.equals(expectedValue)) {
                each.click();
                System.out.println(actualId + " is Selected " + each.isSelected());
                break;
            }

        }

    }
}
