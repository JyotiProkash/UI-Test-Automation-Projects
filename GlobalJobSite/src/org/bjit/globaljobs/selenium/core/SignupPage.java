package org.bjit.globaljobs.selenium.core;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignupPage {
	
 private WebDriver driver=null;
    
	public SignupPage(WebDriver driver){
		this.driver=driver;
	}
	@FindBy(xpath =".//*[@id='signup-modal']/div[2]/div/div[1]/button" )//Find out Signup page cross button
	public WebElement signupPageDismissButton;
	
	public void dismissSignupPopup() { // This method dismiss the Signup page
		// TODO Auto-generated method stub
		//Browser.setDefaultTimeout();
		browserWaitingTime();
		signupPageDismissButton.click();
		
		
	}
	
	private void browserWaitingTime(){ //time for loading page in  browser 
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}

}
