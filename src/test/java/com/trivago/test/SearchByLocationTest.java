package com.trivago.test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class SearchByLocationTest
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
    public void searchLocation()
    {
       /*Findout search bar*/
        WebElement findSearchIcon=driver.findElement(By.xpath("//div[@class='search-icon']"));
       findSearchIcon.click();
       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

       /*Findout search field*/
        WebElement findSearchField=driver.findElement(By.xpath("//input[@placeholder='Search']"));
        findSearchField.clear();

        /*Enter search key*/
        findSearchField.sendKeys("USA");
        findSearchField.sendKeys(Keys.ENTER);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        /*Verify search result text*/
        WebElement searchResultText=driver.findElement(By.xpath("//h3[@class='section-title']"));
        searchResultText.isEnabled();
    }

    @AfterClass
    public void endTest()
    {
        driver.quit();
    }
}
