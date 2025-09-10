package com.Project.pages;

import com.Project.Utilies.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LibraryLoginPage {
    public LibraryLoginPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//button[.='Sign in']")
    public WebElement signInButton;

    @FindBy(xpath = "//div[.='This field is required.']")
    public WebElement requiredField;

    @FindBy(xpath = "//input[@id='inputEmail']")
            public WebElement emailField;
    @FindBy(xpath = "(//div[.='Please enter a valid email address.'])[1]")
    public WebElement reguiredEmailField;

    @FindBy(id="inputPassword")
    public WebElement passwordField;

    @FindBy(id="inputEmail-error")
    public WebElement wrongEmailOrPassword;
}
