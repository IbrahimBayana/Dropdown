package com.Project.test.JavaFaker;

import com.Project.Utilies.Driver;
import com.Project.pages.LibraryLoginPage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class required_error_message {

    LibraryLoginPage loginPage;
    @BeforeMethod
    public void beforeMethod() {
        Driver.getDriver().get("https://library1.cydeo.com");
        loginPage = new LibraryLoginPage();

    }

    @Test
    public void test() {


        loginPage.signInButton.click();

        Assert.assertTrue(loginPage.requiredField.isDisplayed());


    }
    @Test
    public void test2() {


        loginPage.emailField.sendKeys("ibrahimbayana");
        loginPage.signInButton.click();

        Assert.assertTrue(loginPage.reguiredEmailField.isDisplayed());
    }

    @Test
    public void test3() {
        loginPage.emailField.sendKeys("ibrahimbayana");
        loginPage.passwordField.sendKeys("123456");
        loginPage.signInButton.click();
        Assert.assertTrue(loginPage.wrongEmailOrPassword.isDisplayed());
    }
}
