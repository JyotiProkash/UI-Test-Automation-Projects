package org.automation.utils;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Jyoti on 30/03/17.
 */
public class WebElementUtil {
    public static String getValue(WebElement element, String attribute){
        return element.getAttribute(attribute);
    }
    @FindBy(css = "a.btn.btn-primary")
    @CacheLookup
    private WebElement continue_btn;

    @FindBy(id = "input-email")
    @CacheLookup
    private WebElement emailAddress;

    @FindBy(id = "input-password")
    @CacheLookup
    private WebElement password;

    @FindBy(css = "#content div.row div:nth-of-type(2) div.well form div:nth-of-type(2) a")
    @CacheLookup
    private WebElement forgottenPassword1;
}
