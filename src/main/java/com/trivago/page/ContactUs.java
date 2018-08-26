package com.trivago.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Jyoti
 * Created date 26/08/2018
 * To Do refactor with test class
 */

public class ContactUs
{
    WebDriver driver=null;
    public ContactUs(WebDriver driver)
    {
        this.driver=driver;
    }

    /*Findout ContactUs link*/
    @FindBy(xpath="//a[@href='/contact/']")
    public WebElement findContactUsLink;

    /*Findout message textarea*/
    @FindBy(xpath="//textarea[@class='contact-msg']")
    public  WebElement messageTextArea;

    /*Findout fullname textfield*/
    @FindBy(xpath="//input[@class='contact-input']")
    public WebElement fullNameTextField;

    /*Findout email textfield*/
    @FindBy(id="contact-email")
    public WebElement emailTextField;

    /*Findout Checkbox*/
    @FindBy(xpath="//input[@type='checkbox' and @id='confirm']")
    public  WebElement checkBox;

    /*Findout submit button*/
    @FindBy(xpath="//span[contains(text(),'Submit')]")
    public WebElement submit_Button;

    /*Success message*/
    @FindBy(xpath="//p[@class='feedback' and text()='Message Sent Successfully! ']")
    public WebElement successMsg;

    /*Toast message*/
    @FindBy(id="//div[contains(@id,'-')]")
    public WebElement toastMsg;

}
