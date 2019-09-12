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
    public void setUp() {
        System.setProperty(
                "webdriver.chrome.driver",
                "C:\\Users\\Admin\\IdeaProjects\\seleniumTesting\\src\\test\\java\\resources\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        // initialize ExtentReports with a file path
        ExtentReports extent = new ExtentReports(filePath, replaceExisting);
        ExtentTest test;
    }

    @After
    public void tearDown(){

        driver.close();
    }

    @Test
    public void searchTest() throws InterruptedException {
        driver.get("https://www.seleniumeasy.com/test/basic-first-form-demo.html");
        Thread.sleep(1000);

        WebElement pageDown = driver.findElementByTagName("body");
        WebElement pageUp = driver.findElementByTagName("body");



        WebElement searchField = driver.findElementById("user-message");
        assertTrue(searchField.isDisplayed());
        searchField.sendKeys("KEYBOARD");
        Thread.sleep(250);
        WebElement showMessage = driver.findElementByXPath("//*[@id=\"get-input\"]/button");
        showMessage.click();
        Thread.sleep(250);

        pageDown.sendKeys(Keys.PAGE_DOWN);
        Thread.sleep(250);

        WebElement enterA = driver.findElementById("sum1");
        assertTrue(enterA.isDisplayed());
        enterA.sendKeys("5");
        Thread.sleep(250);
        WebElement enterB = driver.findElementById("sum2");
        assertTrue(enterB.isDisplayed());
        enterB.sendKeys("12");
        Thread.sleep(250);
        WebElement getTotal = driver.findElementByXPath("//*[@id=\"gettotal\"]/button");
        getTotal.click();
        Thread.sleep(250);

        pageUp.sendKeys(Keys.PAGE_UP);
        Thread.sleep(250);

        WebElement menuInputForms = driver.findElementByXPath("//*[@id=\"treemenu\"]/li/ul/li[1]/a");
        menuInputForms.click();
        Thread.sleep(250);
        WebElement menuRadioButts = driver.findElementByXPath("//*[@id=\"treemenu\"]/li/ul/li[1]/ul/li[3]/a");
        menuRadioButts.click();
        Thread.sleep(250);

        WebElement selectM = driver.findElementByName("optradio");
        selectM.click();
        Thread.sleep(250);
        WebElement submitM = driver.findElementByXPath("//*[@id=\"buttoncheck\"]");
        submitM.click();
        Thread.sleep(250);

        WebElement selectF = driver.findElementByXPath("//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/div[1]/label[2]/input");
        selectF.click();
        Thread.sleep(250);
        WebElement selectAge = driver.findElementByXPath("//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/div[2]/label[2]/input");
        selectAge.click();
        Thread.sleep(250);
        WebElement submitVals = driver.findElementByXPath("//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/button");
        submitVals.click();
        Thread.sleep(2000);





//        pageDown.sendKeys(Keys.PAGE_DOWN);
//        Thread.sleep(1000);



    }

}





