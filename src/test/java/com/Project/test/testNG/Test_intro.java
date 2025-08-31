package com.Project.test.testNG;

import org.testng.Assert;
import org.testng.annotations.*;

public class Test_intro {
    @BeforeClass
    public void beforeClass(){
        System.out.println("Before Class in running...");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("After Class in running...");
    }

    @BeforeMethod
    public void setUp() {
        System.out.println("Before Method is running");
    }
    @AfterMethod
    public void tearDown() {
        System.out.println("After Method is running");
    }
    @Test (priority = 2)
    public void test_intro1() {
        System.out.println("Test intro");
        Assert.assertEquals("Apple", "Apple");
    }
    @Test  (priority = 1)
    public void test_intro2() {
        System.out.println("Test intro2");
        String expected = "Apple";
        String actual = "Apple";
        Assert.assertTrue(actual.equals(expected));
    }
}
