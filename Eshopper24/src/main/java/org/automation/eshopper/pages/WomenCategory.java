package org.automation.eshopper.pages;

import org.automation.eshopper.EShopperPageBase;
import org.automation.selenium.browser.Browser;
import org.automation.selenium.page.PageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WomenCategory extends EShopperPageBase {
	public WomenCategory(WebDriver aDriver) {
		super(aDriver);
		// TODO Auto-generated constructor stub
	}
	
	//Code identify for Women category item
	@FindBy(xpath=".//*[@class='menu_wrap relative']//following::ul/li[2]/a/b")
	public WebElement findWomenCategoryItem;
	
	//code for Women List page
	@FindBy(xpath=".//*[@class='horizontal_list clearfix bc_list f_size_medium']//following::li")
	public WebElement findWomenListPage;
	
	//Code for identify Clothing category item
	@FindBy(xpath=".//*[@class='menu_wrap relative']//following::ul/li[2]/div/div[1]/a/b")
	public WebElement findClothingCategoryItem;
	//code for Clothing list page
	@FindBy(xpath=".//*[@class='container']//following::div/ul/li")
	public WebElement findClothingListPage;
	
	//Code for identify sarees category item
	@FindBy(xpath=".//*[@class='menu_wrap relative']//following::ul/li[2]/div/div[1]/ul/li[1]")
	public WebElement findSareesCategoryItem;
	//code for Sarees list page
	@FindBy(xpath=".//*[@class='container']//following::div/ul/li")
	public WebElement findSareesListPage;
	
	// code for Salwar Kameez category item
	@FindBy(xpath=".//*[@class='menu_wrap relative']//following::ul/li[2]/div/div[1]/ul/li[2]")
	public WebElement findSalwarKameezCategoryItem;
	
	// code for Salwar Kameez List page
	@FindBy(xpath=".//*[@class='container']//following::div/ul/li[4]")
	public WebElement findSalwarKameezListPage;
	
	//code for Watches category item
	@FindBy(xpath=".//*[@class='menu_wrap relative']//following::ul/li[2]/div/div[2]/a/b")
	public WebElement findWatchesCategoryItem;
	
	//code for Watches List page
	@FindBy(xpath=".//*[@class='container']//following::div/ul/li[3]")
	public WebElement findWatchesListPage;
	
	//code for Analog Watches category item
	@FindBy(xpath=".//*[@class='menu_wrap relative']//following::ul/li[2]/div/div[2]/ul/li[1]")
	public WebElement findAnalogWatchesCategoryItem;
	
	//code for Analog Watches List page
	@FindBy(xpath=".//*[@class='container']//following::div/ul/li[4]")
	public WebElement findAnalogWatchesListPage;
	
	public WebElement displayWomenListPage(){
		findWomenCategoryItem.click();
		Browser.setWebDriverWait(5);
		return findWomenListPage;
	}
	
	public WebElement displayClothingListPage() {
		findClothingCategoryItem.click();
		Browser.setWebDriverWait(5);
		return findClothingListPage;
	}
	
	public WebElement displaySareesListPage() {
		findSareesCategoryItem.click();
		Browser.setWebDriverWait(5);
		return findSareesListPage;
	}
	
	public WebElement displaySalwarKameezListPage() {
		findSalwarKameezCategoryItem.click();
		Browser.setWebDriverWait(5);
		return findSalwarKameezListPage;
	}
	
	public WebElement displayWatchesListPage() {
		findWatchesCategoryItem.click();
		Browser.setWebDriverWait(5);
		return findWatchesListPage;
	}
	public WebElement displayAnalogWatchesListPage() {
		findAnalogWatchesCategoryItem.click();
		Browser.setWebDriverWait(5);
		return findAnalogWatchesListPage;
	}
	
	public WomenCategory open(String url){
        driver.get(url);
        return this;
    }

	public PageBase load() {
        driver.get(getUrl());
        return this;
	}

}
