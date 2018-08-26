package com.trivago.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Jyoti
 * Created date 26/08/2018
 * To Do refactor with test class
 */


public class MostSearchedTag
{
    WebDriver driver=null;
    public MostSearchedTag(WebDriver driver)
    {
        this.driver=driver;
    }

    /*Search by searched tag*/
    @FindBy(xpath="//a[contains(@href, 'theme/couples')]")
    public WebElement findSearchedTag;

}
