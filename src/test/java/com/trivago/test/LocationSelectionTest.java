package com.trivago.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class LocationSelectionTest
{
    WebDriver driver =null;

    @BeforeClass
    public void initiation()
    {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/src/main/resources/driver/chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("http://room5.trivago.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @Test
    public void verifyLocationSelection()
    {
        /*Select Dropdown*/
        WebElement findDropdown=driver.findElement(By.xpath("//select[@class='locales-dropdown']"));
        Select selectDropdown=new Select(findDropdown);
        selectDropdown.selectByIndex(5);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        /*Page verification*/
        String actualPageUrl="http://magazine.trivago.ca/";
        Assert.assertEquals(driver.getCurrentUrl().toString(),actualPageUrl);
    }

    @AfterClass
    public void endTest()
    {
        driver.quit();
    }
}
