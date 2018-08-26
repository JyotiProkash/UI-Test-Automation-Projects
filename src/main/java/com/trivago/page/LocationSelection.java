package com.trivago.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Jyoti
 * Created date 26/08/2018
 * To Do refactor with test class
 */


public class LocationSelection
{
    WebDriver driver=null;
    public LocationSelection(WebDriver driver)
    {
        this.driver=driver;
    }

    /*Select Dropdown*/
    @FindBy(xpath="//select[@class='locales-dropdown']")
    public WebElement findDropdown;


}
