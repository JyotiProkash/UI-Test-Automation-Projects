package org.automation.eshopper.test;

import java.io.IOException;

import org.automation.eshopper.pages.HomePage;
import org.automation.eshopper.pages.MenCategory;
import org.automation.selenium.browser.Browser;
import org.automation.utils.common.PropertyUtil;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestMenCategory  {
	/*public WebDriver driver=null;
	public HomePage home=null;
	public MenCategory men=null;
	
	@BeforeTest
	public void initiation() throws IOException{
		driver=Browser.getInstance();
		String page_url=PropertyUtil.getProperty("browser.properties", "URL");
		driver.get(page_url);
	}
	
	@Test(description="Men list page contains: Breadcrum:Home>Men, Watches, Shoes, Electronics, Boishakhi collection, Eid collection, Casio, woodland, Q&Q, Jinaam, Fastrack.",priority=0)
	public void verifyMenCategoryNavigatesMenListPage(){
		men=PageFactory.initElements(driver, MenCategory.class);
			//System.out.println("Output"+home.getMenSubcategory().get(i).getText().toString());
		Assert.assertTrue(men.DispalyMenListPage().isDisplayed());
}
	
	@Test(description="Watches list page contains: Breadcrum:Home > MEN > Watches, Analog watches, digital watches, Analog & digital watches",priority=1)
	public void verifyWatchCategoryNavigatesWatchListPage(){
		driver.navigate().back();
		home=PageFactory.initElements(driver, HomePage.class);
		home.displayMenSubcategory();
		men=PageFactory.initElements(driver, MenCategory.class);
			//System.out.println("Output"+home.getMenSubcategory().get(i).getText().toString());
		Assert.assertTrue(men.DispalyWatchListPage().isDisplayed());
}
	@Test(description="Analog Watches list page contains: Breadcrum:Home > MEN > Watches > Analog Watches, Analog watches, digital watches, Analog & digital watches",priority=2)
	public void verifyAnalogWatchCategoryNavigatesAnalogWatchListPage(){
		driver.navigate().back();
		home=PageFactory.initElements(driver, HomePage.class);
		home.displayMenSubcategory();
		men=PageFactory.initElements(driver, MenCategory.class);
			//System.out.println("Output"+home.getMenSubcategory().get(i).getText().toString());
		Assert.assertTrue(men.DispalyAnalogWatchListPage().isDisplayed());
}
	@Test(description="Digital Watches list page contains: Breadcrum:Home > MEN > Watches > Digital Watches",priority=3)
	public void verifyDigitalWatchCategoryNavigatesDigitalWatchListPage(){
		driver.navigate().back();
		home=PageFactory.initElements(driver, HomePage.class);
		home.displayMenSubcategory();
		men=PageFactory.initElements(driver, MenCategory.class);
			//System.out.println("Output"+home.getMenSubcategory().get(i).getText().toString());
		Assert.assertTrue(men.DisplayDigitalWatchListPage().isDisplayed());
}
	
	@Test(description="Analog and Digital Watches list page contains: Breadcrum:Home > MEN > Watches > Analog & Digital Watches",priority=4)
	public void verifyAnalogandDigitalWatchCategoryNavigatesAnalogandDigitalWatchListPage(){
		driver.navigate().back();
		home=PageFactory.initElements(driver, HomePage.class);
		home.displayMenSubcategory();
		men=PageFactory.initElements(driver, MenCategory.class);
			//System.out.println("Output"+home.getMenSubcategory().get(i).getText().toString());
		Assert.assertTrue(men.DisplayAnalogandDigitalWatchListPage().isDisplayed());
}
	@Test(description="Shoes list page contains: Breadcrum:Home > MEN > Shoes",priority=5)
	public void verifyShoesCategoryNavigatesShoesListPage(){
		driver.navigate().back();
		home=PageFactory.initElements(driver, HomePage.class);
		home.displayMenSubcategory();
		men=PageFactory.initElements(driver, MenCategory.class);
			//System.out.println("Output"+home.getMenSubcategory().get(i).getText().toString());
		Assert.assertTrue(men.DispalyShoesListPage().isDisplayed());
}
	@Test(description="Formal Shoes list page contains: Breadcrum:Home > MEN > Shoes > Formal shoes",priority=6)
	public void verifyFormalShoesCategoryNavigatesFormalShoesListPage(){
		driver.navigate().back();
		home=PageFactory.initElements(driver, HomePage.class);
		home.displayMenSubcategory();
		men=PageFactory.initElements(driver, MenCategory.class);
			//System.out.println("Output"+home.getMenSubcategory().get(i).getText().toString());
		Assert.assertTrue(men.DispalyFormalShoesListPage().isDisplayed());
}
	@Test(description="Casual Shoes list page contains: Breadcrum:Home > MEN > Shoes > Casual Shoes",priority=7)
	public void verifyCasualShoesCategoryNavigatesCasualShoesListPage(){
		driver.navigate().back();
		home=PageFactory.initElements(driver, HomePage.class);
		home.displayMenSubcategory();
		men=PageFactory.initElements(driver, MenCategory.class);
			//System.out.println("Output"+home.getMenSubcategory().get(i).getText().toString());
		Assert.assertTrue(men.DispalyCasualShoesListPage().isDisplayed());
}
	@Test(description="Boots list page contains: Breadcrum:Home > MEN > Shoes > Boots",priority=8)
	public void verifyBootsCategoryNavigatesBootsListPage(){
		driver.navigate().back();
		home=PageFactory.initElements(driver, HomePage.class);
		home.displayMenSubcategory();
		men=PageFactory.initElements(driver, MenCategory.class);
			//System.out.println("Output"+home.getMenSubcategory().get(i).getText().toString());
		Assert.assertTrue(men.DispalyBootsListPage().isDisplayed());
}
		
@AfterTest
public void endAllTest(){
	Browser.close();
}*/
	

}
