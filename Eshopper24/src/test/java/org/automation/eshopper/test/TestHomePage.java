package org.automation.eshopper.test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestHomePage {
	
	/*public WebDriver driver=null;
	public static RemoteWebDriver aRemoteBrowser=null;
	public HomePage home=null;
	@BeforeTest
	public void initiation() throws IOException{*/
		/*driver=new FirefoxDriver();
		driver.get("https://www.eshopper24.com");*/
		/*Properties pro=new Properties();
		FileInputStream fi=new FileInputStream("F:\\Testing_Project\\EShopper\\EShopper_Project\\EShopper24\\Eshopper24\\src\\main\\java\\org\\bjit\\eshopper\\browser.properties");
		pro.load(fi);
		if(pro.getProperty("browser").contains("firefox")){
			driver=new FirefoxDriver();
			driver.get(pro.getProperty("url"));
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		}*/
		/*driver=Browser.getInstance();
		String page_url=PropertyUtil.getProperty("browser.properties", "URL");
		driver.get(page_url);
	}
	
	@Test(description="HomePage title contains [online shopping in Bangladesh for men and women : tangail saree | Brand watch | Brand Shoes]",priority=0)
	public void verifyHomePageTitle(){
		home=PageFactory.initElements(driver, HomePage.class);
		String expHomePageTitle="online shopping in Bangladesh for men and women : tangail saree | Brand watch | Brand Shoes";
		System.out.println(" Output is:"+home.getHomePageTitle());
		Assert.assertEquals(home.getHomePageTitle(), expHomePageTitle);	
	}
	
	@Test(description="Men Subcategories are Analog Watches, Digital Watches, Analog and Digital Watches, Formal Shoes, Casual Shoes, Boots",priority=1)
	public void verifyMenSubCategory(){
		home=PageFactory.initElements(driver, HomePage.class);
		for(int i=0;i<home.getMenSubcategory().size();i++){
			Browser.setWebDriverWait(2);
			//System.out.println("Output"+home.getMenSubcategory().get(i).getText().toString());
			Assert.assertTrue(home.getMenSubcategory().get(i).isDisplayed());	
		}
	}
	
	@Test(description="Women Subcategories are Sarees, Salwar Kameez, Analog Watches",priority=2)
	public void verifyWomenSubCategory(){
		home=PageFactory.initElements(driver, HomePage.class);
		for(int i=0;i<home.getWomenSubcategory().size();i++){
			Browser.setWebDriverWait(2);
			//System.out.println("Output"+home.getMenSubcategory().get(i).getText().toString());
			Assert.assertTrue(home.getWomenSubcategory().get(i).isDisplayed());
		}
	}
		
		@Test(description="Electronics Subcategories are Accessories, calculator",priority=3)
		public void verifyElectronicsSubCategory(){
			home=PageFactory.initElements(driver, HomePage.class);
			for(int i=0;i<home.getElectronicsSubcategory().size();i++){
				Browser.setWebDriverWait(2);
				//System.out.println("Output"+home.getMenSubcategory().get(i).getText().toString());
				Assert.assertTrue(home.getElectronicsSubcategory().get(i).isDisplayed());	
			}
	}
	
		@Test(description="Boishakhi Collection Category available",priority=4)
		public void verifyBoishakhiCollectionCategory(){
			home=PageFactory.initElements(driver, HomePage.class);
				//System.out.println("Output"+home.getMenSubcategory().get(i).getText().toString());
				Assert.assertTrue(home.getBoishakhiCollectionCategory().isDisplayed());
	}
		
		@Test(description="Eid Collection Category available",priority=5)
		public void verifyEidCollectionCategory(){
			home=PageFactory.initElements(driver, HomePage.class);
				//System.out.println("Output"+home.getMenSubcategory().get(i).getText().toString());
				Assert.assertTrue(home.getEidCollectionCategory().isDisplayed());
	}
		
	@AfterTest
	public void endAllTest(){
		Browser.close();
	}*/

}
