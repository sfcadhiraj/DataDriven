package com.MT.base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

/**
 * WebDriver
 * Properties
 * Logs
 * Extent Reports
 * DB
 * Excel
 * Mail
 */
public class TestBase {

    public static WebDriver driver;

    @BeforeSuite
    public void setUp(){

    }


    @AfterSuite
    public void tearDown(){

    }
}
