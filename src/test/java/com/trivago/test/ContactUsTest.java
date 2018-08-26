package com.trivago.test;

import com.trivago.core.WindowHandler;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ContactUsTest
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
    public void verifyContactUs()
    {
        /*Findout ContactUs link*/
        WebElement findContactUsLink=driver.findElement(By.xpath("//a[@href='/contact/']"));
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();", findContactUsLink);
        WindowHandler handle=new WindowHandler(driver);
        handle.switchPopupWindow();

        /*Findout message textarea*/
        WebElement messageTextArea=driver.findElement(By.xpath("//textarea[@class='contact-msg']"));
        messageTextArea.clear();
        messageTextArea.sendKeys("This is message content");

        /*Findout fullname textfield*/
        WebElement fullNameTextField=driver.findElement(By.xpath("//input[@class='contact-input']"));
        fullNameTextField.clear();
        fullNameTextField.sendKeys("Mr. Ar Rahman");

        /*Findout email textfield*/
        WebElement emailTextField=driver.findElement(By.id("contact-email"));
        emailTextField.clear();
        emailTextField.sendKeys("abcd@yahoo.com");

        /*Findout Checkbox*/
        WebElement checkBox=driver.findElement(By.xpath("//input[@type='checkbox' and @id='confirm']"));
        checkBox.click();

        /*Findout submit button*/
        WebElement submit_Button=driver.findElement(By.xpath("//span[contains(text(),'Submit')]"));
        JavascriptExecutor jss = (JavascriptExecutor)driver;
        jss.executeScript("arguments[0].click();", submit_Button);

        /*Success message*/
        /*driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        WebElement successMsg=driver.findElement(By.xpath("//p[@class='feedback' and text()='Message Sent Successfully! ']"));
        String successMessage="Message Sent Successfully!";
        Assert.assertEquals(successMessage,successMsg.getText());*/

        /*Toast message*/
        /*WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("//div[contains(@id,'-')]")));*/
    }

    @AfterClass
    public void endTest()
    {
        driver.quit();
    }
}
