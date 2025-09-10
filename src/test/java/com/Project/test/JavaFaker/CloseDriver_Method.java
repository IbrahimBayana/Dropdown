package com.Project.test.JavaFaker;

import com.Project.Utilies.Driver;
import org.testng.annotations.Test;

public class CloseDriver_Method {
    @Test
    public void testMethod1() {
        Driver.getDriver().get("https://www.google.com");
        Driver.closeDriver();
    }

    @Test
    public void testMethod2() {
        Driver.getDriver().get("https://www.google.com");
        Driver.closeDriver();
    }

    @Test
    public void testMethod3() {
        Driver.getDriver().get("https://www.google.com");
        Driver.getDriver().quit();
    }
}
