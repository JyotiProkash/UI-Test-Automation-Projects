package com.trivago.test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SubscribeNewsletterTest
{
    WebDriver driver =null;

    @BeforeClass
    public void initiation()
    {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/src/main/resources/driver/chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("http://room5.trivago.com/");
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @Test
    public void verifySubscribeNewsletter()
    {
        /*Email field*/
        WebElement emailField=driver.findElement(By.xpath("//input[@type='text' and @name='email']"));
        emailField.clear();
        emailField.sendKeys("asd@gmail.com");

        /*Findout Checkbox*/
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement findSubscribeCheckbox=driver.findElement(By.xpath("//input[@type='checkbox' and @id='confirm' and @class='newletter-opt-in-checkbox et-confirm']"));
        if(!findSubscribeCheckbox.isSelected())
        findSubscribeCheckbox.click();

        /*Findout inspireme button*/
        WebElement inspireMeButton=driver.findElement(By.xpath("//button[@type='submit' and @class='submit']"));
        inspireMeButton.click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        /*Verification Confirmation message*/
        /*WebElement confirmMessage=driver.findElement(By.xpath("//p[contains(text(),'You are now checked-in!')]"));
        driver.findElement(By.xpath("//p[contains(text(),'You are now checked-in!')]"));
        String expectedMessage="You are now checked-in!";
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("document.getElementsByName('You are now checked-in!')[0].style.display='block'");
        Assert.assertEquals(sText,expectedMessage);*/
    }

    @AfterClass
    public void endTest()
    {
        driver.quit();
    }
}
