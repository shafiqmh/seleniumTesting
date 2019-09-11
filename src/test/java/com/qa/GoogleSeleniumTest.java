package com.qa;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
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
        driver.get("https://www.seleniumeasy.com/test/basic-first-form-demo.html");
        Thread.sleep(1000);
        WebElement searchField = driver.findElement(By.name("q"));
        assertTrue(searchField.isDisplayed());
        searchField.sendKeys("funny cat pictures");
        Thread.sleep(3000);
        WebElement submitButton = driver.findElement(By.name("btnK"));
        submitButton.click();
        Thread.sleep(3000);
        WebElement linkToBiggerPicture = driver.findElementByLinkText("Images for funny cat");
        linkToBiggerPicture.click();
        Thread.sleep(3000);
        WebElement clickAPicture = driver.findElementById("D-PLcqeLGxB5CM:");
        clickAPicture.click();
        Thread.sleep(3000);
//        WebElement scroll = driver.findElementByName("gsr");
//        scroll.sendKeys(Keys.chord(Keys.PAGE_DOWN));
//        Thread.sleep(6000);                 (this doesnt quite work)

    }

}
