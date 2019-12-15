package org.automation.eshopper.pages;

import java.util.concurrent.TimeUnit;

import org.automation.eshopper.EShopperPageBase;
import org.automation.selenium.page.PageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Login extends EShopperPageBase {
	public Login(WebDriver aDriver) {
		super(aDriver);
		// TODO Auto-generated constructor stub
	}
    
	/*//Find out login link
	@FindBy(how=How.LINK_TEXT, linkText="Log in")
    public WebElement login_link;*/
	
	//Find out email field
	@FindBy(how=How.ID, id="Email")
    public WebElement email_field;
	
	//Find out password field
	@FindBy(how=How.ID, id="Password")
    public WebElement password_field;
	
	//Find out login button
	@FindBy(how=How.XPATH, xpath=".//div//input[@value='Log in']")
    public WebElement login_button;
	
	//Verify invalid login message 1
	@FindBy(how=How.XPATH, xpath=".//div//span[text()='Login was unsuccessful. Please correct the errors and try again.']")
	public WebElement first_message_display;
	
	//Verify invalid login message 2
	@FindBy(xpath=".//form//div[1]//div//ul/li")
	public WebElement second_message_display;
	
	private void typeIntoTextBox(WebElement element ,String text){
		element.sendKeys(text);
	}
	
	public void typeEmail(String name){
		//name_of_contactus.sendKeys(name);
		typeIntoTextBox(email_field,name );
	}
	
	public void typePassword(String name){
		//name_of_contactus.sendKeys(name);
		typeIntoTextBox(password_field,name );
	}
	
	public void clickLoginButton() {
		// TODO Auto-generated method stub
		login_button.click();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);	
	}
	
	public String displayFirstMessage(){
		//System.out.print(first_message_display.getText().toString());
		return first_message_display.getText().toString();
	}
	
	public String displaySecondMessage(){
		return second_message_display.getText().toString();
	}
	
    
	public PageBase load() {
		// TODO Auto-generated method stub
		driver.get(getUrl());
        return this;
	}
	
}
