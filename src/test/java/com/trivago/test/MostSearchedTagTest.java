package com.trivago.test;

import com.trivago.core.WindowHandler;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class MostSearchedTagTest
{
    WebDriver driver =null;

    @BeforeClass
    public void initiation()
    {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/src/main/resources/driver/chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("http://room5.trivago.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }

    @Test
    public void verifySearchByMostSearchedTag()
    {
        /*Search by searched tag*/
        WebElement findSearchedTag=driver.findElement(By.xpath("//a[contains(@href, 'theme/couples')]"));
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();", findSearchedTag);

        /*verification searched page*/
        String actualSearchedPage="http://magazine.trivago.com/theme/couples";
        Assert.assertEquals(driver.getCurrentUrl()+"theme/couples",actualSearchedPage);
    }

    @AfterClass
    public void endTest()
    {
        driver.quit();
    }
}
