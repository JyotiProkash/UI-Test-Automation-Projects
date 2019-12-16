package testscripts;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import helper.BrowserFactory;
import loginlogout.LoginPage;

/**
 * created by Jyoti 16/09/2019
 */

public class TestBase 
  {
	WebDriver driver;
	
	@BeforeClass
	public void initiation() throws InterruptedException 
	  {

		driver=BrowserFactory.startBrowser("Chrome", "put_site-url_here");
		//driver=BrowserFactory.startBrowser("Chrome", "https://shopping.yahoo.co.jp/products/3e6b581570");
		waitForPageLoading(60);
		//Thread.sleep(6000);
	  }
	
	
	@AfterClass
	public void tearDown() throws InterruptedException 
	  {
		Thread.sleep(5000);
		BrowserFactory.closeBrowser(driver);
	  }
	
	
	//Login for app
	public WebDriver LoginToApplication(String user, String pass) throws InterruptedException 
	  {
		//Created Page Object for Login page using Page Factory
		LoginPage login_page=PageFactory.initElements(driver, LoginPage.class);
		login_page.LoginToApplication(user, pass);
		return driver;
		
	  }
	
	public WebDriver waitForPageLoading(int time) 
	  {
		driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
		return driver;
		
	  }
	
  }
