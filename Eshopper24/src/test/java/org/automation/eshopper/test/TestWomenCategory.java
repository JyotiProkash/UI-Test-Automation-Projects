package org.automation.eshopper.test;

import java.io.IOException;

import org.automation.eshopper.pages.HomePage;
import org.automation.eshopper.pages.WomenCategory;
import org.automation.selenium.browser.Browser;
import org.automation.utils.common.PropertyUtil;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestWomenCategory {
	/*public WebDriver driver=null;
	public HomePage home=null;
	public WomenCategory women=null;
	
	@BeforeTest
	public void initiation() throws IOException{
		driver=Browser.getInstance();
		String page_url=PropertyUtil.getProperty("browser.properties", "URL");
		driver.get(page_url);
	}
	
	@Test(description="TEST CASE: 019 Women list page contains: Breadcrum:Home>Women",priority=0)
	public void verifyWomenCategoryNavigatesWomenListPage(){
		women=PageFactory.initElements(driver, WomenCategory.class);
			//System.out.println("Output"+home.getMenSubcategory().get(i).getText().toString());
		Assert.assertTrue(women.displayWomenListPage().isDisplayed());
}
	
	@Test(description="TESE CASE: 023 Clothing list page contains: Breadcrum:Home > WOMEN > Clothing",priority=1)
	public void verifyClothingCategoryNavigatesClothingListPage(){
		driver.navigate().back();
		home=PageFactory.initElements(driver, HomePage.class);
		home.displayWomenSubcategory();
		women=PageFactory.initElements(driver, WomenCategory.class);
			//System.out.println("Output"+home.getMenSubcategory().get(i).getText().toString());
		Assert.assertTrue(women.displayClothingListPage().isDisplayed());
}
	@Test(description="TEST CASE: 024 Sarees list page contains: Breadcrum:Home > WOMEN > Sarees",priority=2)
	public void verifySareesCategoryNavigateSareesListPage(){
		driver.navigate().back();
		home=PageFactory.initElements(driver, HomePage.class);
		home.displayWomenSubcategory();
		women=PageFactory.initElements(driver, WomenCategory.class);
			//System.out.println("Output"+home.getMenSubcategory().get(i).getText().toString());
		Assert.assertTrue(women.displaySareesListPage().isDisplayed());
}
	@Test(description="TEST CASE: 025 Salwar Kameez list page contains: Breadcrum:Home > WOMEN > Salwar Kameez",priority=3)
	public void verifySalwarKameezCategoryNavigatesSalwarKameezListPage(){
		driver.navigate().back();
		home=PageFactory.initElements(driver, HomePage.class);
		home.displayWomenSubcategory();
		women=PageFactory.initElements(driver, WomenCategory.class);
			//System.out.println("Output"+home.getMenSubcategory().get(i).getText().toString());
		Assert.assertTrue(women.displaySalwarKameezListPage().isDisplayed());
}
	@Test(description="TEST CASE: 026 Watches list page contains: Breadcrum:Home > WOMEN > Watches",priority=5)
	public void verifyWatchesCategoryNavigatesWatchesListPage(){
		driver.navigate().back();
		home=PageFactory.initElements(driver, HomePage.class);
		home.displayWomenSubcategory();
		women=PageFactory.initElements(driver, WomenCategory.class);
			//System.out.println("Output"+home.getMenSubcategory().get(i).getText().toString());
		Assert.assertTrue(women.displayWatchesListPage().isDisplayed());
}
	@Test(description="TEST CASE: 027 Analog Watches list page contains: Breadcrum:Home > WOMEN > Watches > Analog Watches",priority=6)
	public void verifyAnalogWatchesCategoryNavigatesAnalogWatchesListPage(){
		driver.navigate().back();
		home=PageFactory.initElements(driver, HomePage.class);
		home.displayWomenSubcategory();
		women=PageFactory.initElements(driver, WomenCategory.class);
			//System.out.println("Output"+home.getMenSubcategory().get(i).getText().toString());
		Assert.assertTrue(women.displayAnalogWatchesListPage().isDisplayed());
}
		
@AfterTest
public void endAllTest(){
	Browser.close();
}*/

}
