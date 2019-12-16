package org.automation.pages;

import org.automation.core.PageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Jyoti on 15/03/17.
 */
public class TermsAndCondition extends PageBase {
    public TermsAndCondition(WebDriver aDriver) {
        super(aDriver);
    }

    //todo all locators
    @FindBy(xpath = ".//*[@id='content']/p")
    public WebElement description;
    @FindBy(xpath = ".//*[@id='content']/h1")
    public WebElement title;
}
