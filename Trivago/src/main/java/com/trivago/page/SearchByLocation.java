package com.trivago.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Jyoti
 * Created date 26/08/2018
 * To Do refactor with test class
 */


public class SearchByLocation
{
    WebDriver driver=null;
    public SearchByLocation(WebDriver driver)
    {
        this.driver=driver;
    }

    /*Findout search bar*/
    @FindBy(xpath="//div[@class='search-icon']")
    public WebElement findSearchIcon;

    /*Findout search field*/
    @FindBy(xpath="//input[@placeholder='Search']")
    public WebElement findSearchField;

    /*Verify search result text*/
    @FindBy(xpath="//h3[@class='section-title']")
    public WebElement searchResultText;

}
