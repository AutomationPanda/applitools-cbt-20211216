package com.applitools;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TraditionalTest
{
    private final String DEMO_SITE_URL = "https://demo.applitools.com";
    private final String DEMO_SITE_CHANGED_URL = "https://demo.applitools.com/index_v2.html";

    private WebDriver driver;

    @BeforeEach
    public void startWebDriver()
    {
        driver = new ChromeDriver();
    }

    @AfterEach
    public void quitWebDriver()
    {
        driver.quit();
    }

    @Test
    public void login()
    {
        // Change the `loadLoginPage` argument between true and false to change page visuals

        loadLoginPage(true);
        verifyLoginPage();
        performLogin();
        verifyMainPage();
    }

    private void loadLoginPage(boolean original)
    {
        driver.get(original ? DEMO_SITE_URL : DEMO_SITE_CHANGED_URL);
    }

    private void verifyLoginPage()
    {

    }

    private void performLogin()
    {
        driver.findElement(By.id("username")).sendKeys("andy");
        driver.findElement(By.id("password")).sendKeys("i<3pandas");
        driver.findElement(By.id("log-in")).click();
    }

    private void verifyMainPage()
    {

    }
}
