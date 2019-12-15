package org.automation.selenium.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PageBase {
    
	private String name;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    private  String url;
    protected WebDriver driver;

    private PageBase(){

    }
    public PageBase(WebDriver aDriver){
        this.driver =aDriver;
        initElement(this);
    }
    public <T extends PageBase> void initElement(T t){
        PageFactory.initElements(driver,t);
    }


    public String getTitle() {
        return driver.getTitle();
    }

}
