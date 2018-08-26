package com.trivago.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class NavigateToDestinationTest
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
    public void VerifyNavigateDestination()
    {
        /*Home Menu*/
        WebElement menuIcon=driver.findElement(By.xpath("//div[@class='nav-icon']"));
        menuIcon.click();

        /*Find West destination item*/
        WebElement destinationItem=driver.findElement(By.xpath("//div[@class='destination-menu' and text()='West']"));
        destinationItem.click();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

        /*Verification Destination page*/
        String actualPageUrl="http://magazine.trivago.com/destination/usa/west/";
        Assert.assertEquals(driver.getCurrentUrl()+"destination/usa/west/",actualPageUrl);
    }

    @AfterClass
    public void endTest()
    {
        driver.quit();
    }
}
