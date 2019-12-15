package org.automation.eshopper.test;

import java.io.IOException;

import org.automation.eshopper.pages.HomePage;
import org.automation.eshopper.pages.Register;
import org.automation.selenium.browser.Browser;
import org.automation.utils.common.PropertyUtil;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestRegister {
	public WebDriver driver=null;
	public HomePage home=null;
	public Register register =null;
	
	@BeforeTest
	public void initiation() throws IOException{
		driver=Browser.getInstance();
		String page_url=PropertyUtil.getProperty("browser.properties", "URL");
		driver.get(page_url);
	}
	
	@Test(description="TEST CASE: 01 Blank registration",priority=0)
	public void verifyBlankRegistration(){
		home=PageFactory.initElements(driver, HomePage.class);
		Assert.assertEquals(home.clickRegisterLink().toUpperCase(), "REGISTER");
		register=PageFactory.initElements(driver, Register.class);
		register.register_button.click();
		Assert.assertEquals(register.displayFirstNameRequiredMessage(),"First name is required.");
		Assert.assertEquals(register.displayLastNameRequiredMessage(),"Last name is required.");
		Assert.assertEquals(register.displayEmailAddressRequiredMessage(),"Email is required.");
		Assert.assertEquals(register.displayPhoneNumberRequiredMessage(),"Phone is required");
		Assert.assertEquals(register.displayPasswordRequiredMessage(),"Password is required.");
		Assert.assertEquals(register.displayConfirmPasswordRequiredMessage(),"Password is required.");
    }
		
   @AfterTest
   public void endAllTest(){
	Browser.close();
   }

}
