package org.automation.eshopper.pages;

import org.automation.eshopper.EShopperPageBase;
import org.automation.selenium.browser.Browser;
import org.automation.selenium.page.PageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ElectronicsCategory extends EShopperPageBase {
	
	public ElectronicsCategory(WebDriver aDriver) {
		super(aDriver);
		// TODO Auto-generated constructor stub
	}
	
	
	//Code identify for Electronics category item
		@FindBy(xpath=".//*[@class='menu_wrap relative']//following::ul/li[3]/a/b")
		public WebElement findElectronicsCategoryItem;
		
		//code for Electronics List page
		@FindBy(xpath=".//*[@class='horizontal_list clearfix bc_list f_size_medium']//following::li")
		public WebElement findElectronicsListPage;
		
		//Code for identify Accessories category item
		@FindBy(xpath=".//*[@class='menu_wrap relative']//following::ul/li[3]/div/div[1]/a/b")
		public WebElement findAccessoriesCategoryItem;
		
		//code for Accessories list page
		@FindBy(xpath=".//*[@class='container']//following::div/ul/li")
		public WebElement findAccessoriesListPage;
		
		//Code for identify calculators category item
		@FindBy(xpath=".//*[@class='menu_wrap relative']//following::ul/li[3]/div/div[1]/ul/li[1]")
		public WebElement findCalculatorsCategoryItem;
		//code for Calculators list page
		@FindBy(xpath=".//*[@class='container']//following::div/ul/li")
		public WebElement findCalculatorsListPage;
		
		public WebElement displayElectronicsListPage(){
			findElectronicsCategoryItem.click();
			Browser.setWebDriverWait(5);
			return findElectronicsListPage;
		}
		
		public WebElement displayAccessoriesListPage() {
			findAccessoriesCategoryItem.click();
			Browser.setWebDriverWait(5);
			return findAccessoriesListPage;
		}
		
		public WebElement displayCalculatorsListPage() {
			findCalculatorsCategoryItem.click();
			Browser.setWebDriverWait(5);
			return findCalculatorsListPage;
		}
		
		public ElectronicsCategory open(String url){
	        driver.get(url);
	        return this;
	    }
		
		public PageBase load() {
	        driver.get(getUrl());
	        return this;
		}
}
