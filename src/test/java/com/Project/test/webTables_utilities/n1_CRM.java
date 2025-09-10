package com.Project.test.webTables_utilities;

import com.Project.Utilies.BrowserUtills;
import com.Project.Utilies.CRM_Utilities;
import com.Project.Utilies.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class n1_CRM {
    WebDriver driver;

    @BeforeMethod
    public void SetUp() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        driver.get("https://login1.nextbasecrm.com");

    }

    @Test
    public void n1_CRM() {
        CRM_Utilities.login_crm(driver,"helpdesk1@cydeo.com","UserUser","//input[@class='login-inp']","(//input[@class='login-inp'])[2]");

        BrowserUtills.verifyTitle(driver, "Portal");


    }
}
