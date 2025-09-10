package com.Project.pages;

import com.Project.Utilies.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DynamicLoadPage {

    public DynamicLoadPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "//strong[.='Done!']")
    public WebElement doneButton;

    @FindBy(xpath = "//img[@alt='square pants']")
    public WebElement spongeBobImage;

}
