package org.automation.eshopper.test;

import java.io.IOException;

import org.automation.eshopper.pages.HomePage;
import org.automation.eshopper.pages.Login;
import org.automation.selenium.browser.Browser;
import org.automation.utils.common.PropertyUtil;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestLogin {
	public WebDriver driver=null;
	public HomePage home=null;
	public Login login=null;
	
	@BeforeTest
	public void initiation() throws IOException{
		driver=Browser.getInstance();
		String page_url=PropertyUtil.getProperty("browser.properties", "URL");
		driver.get(page_url);
	}
	
	@Test(description="TEST CASE: 01 Invalid login",priority=0)
	public void verifyInvalidLogin(){
		home=PageFactory.initElements(driver, HomePage.class);
		home.clickLoginLink();
		login=PageFactory.initElements(driver, Login.class);
		login.typeEmail("agg@gmail.com");
		login.typePassword("a123456789");
		login.clickLoginButton();
		Assert.assertEquals(login.displayFirstMessage(),"Login was unsuccessful. Please correct the errors and try again.");
		Assert.assertEquals(login.displaySecondMessage(),"The characters didn't match the picture. Please try again.");
}
		
@AfterTest
public void endAllTest(){
	Browser.close();
}
	

}
