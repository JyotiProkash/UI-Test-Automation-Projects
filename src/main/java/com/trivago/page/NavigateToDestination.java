package com.trivago.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Jyoti
 * Created date 26/08/2018
 * To Do refactor with test class
 */


public class NavigateToDestination
{
    WebDriver driver=null;
    public NavigateToDestination(WebDriver driver)
    {
        this.driver=driver;
    }

    /*Home Menu*/
    @FindBy(xpath="//div[@class='nav-icon']")
    public WebElement menuIcon;

    /*Find West destination item*/
    @FindBy(xpath="//div[@class='destination-menu' and text()='West']")
    public  WebElement destinationItem;

}
