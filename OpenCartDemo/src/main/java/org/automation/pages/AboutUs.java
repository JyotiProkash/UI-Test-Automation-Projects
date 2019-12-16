package org.automation.pages;

import org.automation.core.PageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Jyoti on 28/02/17.
 * //todo element finders
 * https://demo.opencart.com/index.php?route=information/information&information_id=4
 */
public class AboutUs extends PageBase {
    public AboutUs(WebDriver aDriver) {
        super(aDriver);
    }
//this represent About us page

    @FindBy(css ="#content > p" )
    public WebElement description;

    @FindBy(css ="h1" )
    public WebElement title;
}
