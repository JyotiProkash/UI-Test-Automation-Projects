package org.bjit.globaljobs.selenium.core;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage{

	private WebDriver driver=null;
    
	public LoginPage(WebDriver driver){
		this.driver=driver;
	}
	
	@FindBy(id ="login_username" )//Find out User Name field
	public WebElement userNameField;

	@FindBy(id ="login_password" )//Find out Password field
	public WebElement userPasswordField;
	
	@FindBy(xpath =".//*[@id='loginFormSub']/button" )//Find out Login button
	public WebElement loginButton;
	
	@FindBy(xpath =".//*[@id='login-modal']/div[2]/div/div[2]" )//Invalid login text message verification
	public WebElement invalidLoginTextMessageVerification;
	
	@FindBy(xpath ="/html/body/div[1]/section/div[1]/div/div/div/a[2]" )//Find out Logout button from Home page
	public WebElement logoutButton;
	
	@FindBy(xpath =".//*[@id='login-modal']/div[2]/div/div[1]/button" )//Find out cross button from Login popup
	public WebElement loginPopupCrossButton;

	
	private void logIn(WebElement loginElement, String text){
		loginElement.sendKeys(text);
	}
	
	public void setUserName(String strUserName) {
		// TODO Auto-generated method stub
		logIn(userNameField, strUserName);
		
	}

	public void setUserPassword(String strUserPassword) {
		// TODO Auto-generated method stub
		logIn(userPasswordField, strUserPassword);
		
	}

	public void clickSignin() {
		// TODO Auto-generated method stub
		loginButton.click();
		//browserWaitingTime();
		Browser.setDefaultTimeout();
	}
	
	public WebElement invalidLoginPage(){// Get text/message for invalid login page verification
		Browser.setDefaultTimeout();
		return invalidLoginTextMessageVerification;
		
	}
	
	/*public WebElement validLoginPage(){// Get text/message for valid login page verification
		Browser.setDefaultTimeout();
		return logoutButton;
		
	}*/

	public void dismissPopup() {
		// TODO Auto-generated method stub
		browserWaitingTime();
		loginPopupCrossButton.click();
		
	}
	
	private void browserWaitingTime(){ //time for loading page in  browser 
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}

	public void clickLogout() {
		// TODO Auto-generated method stub
		logoutButton.click();
		browserWaitingTime();
		
	}

}
