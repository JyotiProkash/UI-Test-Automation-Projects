package org.automation.eshopper.test;

import java.io.IOException;

import org.automation.eshopper.pages.ElectronicsCategory;
import org.automation.eshopper.pages.HomePage;
import org.automation.selenium.browser.Browser;
import org.automation.utils.common.PropertyUtil;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

//@Title("Test Electronics Categories")
public class TestElectronicsCategory {
	public WebDriver driver=null;
	public HomePage home=null;
	public ElectronicsCategory electronics=null;
	
	@BeforeTest
	public void initiation() throws IOException{
		driver=Browser.getInstance();
		String page_url=PropertyUtil.getProperty("browser.properties", "URL");
		driver.get(page_url);
	}
	/*@Title("Test breadcrum: Home>Electronics Electronics list")
	@Step("Find out Electronis list")
	@Severity(SeverityLevel.CRITICAL)
	@Features("Electronics list page")
	@Description("Electronics Related products.")
	@Stories("User can see Electronics list page.")*/
	@Test(description="TEST CASE: 022 Electronics list page contains: Breadcrum:Home>Electronics",priority=0)
	public void verifyElectronicsCategoryNavigatesElectronicsListPage(){
		electronics=PageFactory.initElements(driver, ElectronicsCategory.class);
			//System.out.println("Output"+home.getMenSubcategory().get(i).getText().toString());
		Assert.assertTrue(electronics.displayElectronicsListPage().isDisplayed());
}
	
	@Test(description="TESE CASE: 025 Accessories list page contains: Breadcrum:Home > Electronics > Accessories",priority=1)
	/*@Title("Test breadcrum: Home>Electronics Electronics list")
	@Step("Find out Electronis list")
	@Severity(SeverityLevel.CRITICAL)
	@Features("Electronics list page")
	@Description("Electronics Related products.")
	@Stories("User can see Electronics list page.")*/
	public void verifyAccessoriesCategoryNavigatesAccessoriesListPage(){
		driver.navigate().back();
		home=PageFactory.initElements(driver, HomePage.class);
		home.displayElectronicsSubcategory();
		electronics=PageFactory.initElements(driver, ElectronicsCategory.class);
			//System.out.println("Output"+home.getMenSubcategory().get(i).getText().toString());
		Assert.assertTrue(electronics.displayAccessoriesListPage().isDisplayed());
}
	@Test(description="TEST CASE: 026 calculators list page contains: Breadcrum:Home > Electronics > Accessories > calculators",priority=2)
	/*@Title("Test breadcrum: Home>Electronics Electronics list")
	@Step("Find out Electronis list")
	@Severity(SeverityLevel.CRITICAL)
	@Features("Electronics list page")
	@Description("Electronics Related products.")
	@Stories("User can see Electronics list page.")
	@Issue("101")*/
	public void verifyCalculatorsCategoryNavigateCalculatorsListPage(){
		driver.navigate().back();
		home=PageFactory.initElements(driver, HomePage.class);
		home.displayElectronicsSubcategory();
		electronics=PageFactory.initElements(driver, ElectronicsCategory.class);
			//System.out.println("Output"+home.getMenSubcategory().get(i).getText().toString());
		Assert.assertFalse(electronics.displayCalculatorsListPage().isDisplayed());
}
		
@AfterTest
public void endAllTest(){
	Browser.close();
}


}
