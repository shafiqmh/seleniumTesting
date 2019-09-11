package com.qa;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertTrue;

public class GoogleSeleniumTest {

    private ChromeDriver driver;

    @Before
    public void setUp(){
        System.setProperty(
                "webdriver.chrome.driver",
                "C:\\Users\\Admin\\IdeaProjects\\seleniumTesting\\src\\test\\java\\resources\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @After
    public void tearDown(){

        driver.close();
    }

    @Test
    public void searchTest() throws InterruptedException {
        driver.get("http://google.com");
        Thread.sleep(2000);
        WebElement searchField = driver.findElement(By.name("q"));
        assertTrue(searchField.isDisplayed());
        searchField.sendKeys("funny cat pictures");
        Thread.sleep(4000);

    }

}
