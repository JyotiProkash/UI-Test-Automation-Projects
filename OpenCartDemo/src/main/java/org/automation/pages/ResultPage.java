package org.automation.pages;

import org.automation.core.CompletePage;
import org.automation.core.PageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class ResultPage extends PageBase implements CompletePage {
    public ResultPage(WebDriver aDriver) {
        super(aDriver);
    }
    @FindBy(xpath = ".//*[@id='content']/p[2]")
    public WebElement invalid_search_result_message;

    public PageBase load() {
        driver.get(getUrl());
        return this;
    }
}
