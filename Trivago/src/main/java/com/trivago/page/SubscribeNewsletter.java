package com.trivago.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Jyoti
 * Created date 26/08/2018
 * To Do refactor with test class
 */

public class SubscribeNewsletter
{
    WebDriver driver=null;
    public SubscribeNewsletter(WebDriver driver)
    {
        this.driver=driver;
    }

    /*Email field*/
    @FindBy(xpath="//input[@type='text' and @name='email']")
    public WebElement emailField;

    /*Findout Checkbox*/
    @FindBy(xpath="//input[@type='checkbox' and @id='confirm' and @class='newletter-opt-in-checkbox et-confirm']")
    public WebElement findSubscribeCheckbox;

    /*Findout inspireme button*/
    @FindBy(xpath="//button[@type='submit' and @class='submit']")
    public WebElement inspireMeButton;

    /*Verification Confirmation message*/
    @FindBy(xpath="//p[contains(text(),'You are now checked-in!')]")
    public WebElement confirmMessage;


}
