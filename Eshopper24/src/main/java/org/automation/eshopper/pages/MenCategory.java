package org.automation.eshopper.pages;

import org.automation.eshopper.EShopperPageBase;
import org.automation.selenium.browser.Browser;
import org.automation.selenium.page.PageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MenCategory extends EShopperPageBase {
	public MenCategory(WebDriver aDriver) {
		super(aDriver);
		// TODO Auto-generated constructor stub
	}
	
	//Code identify for Men category item
	@FindBy(xpath=".//*[@class='menu_wrap relative']//following::ul/li[1]/a/b")
	public WebElement findMenCategoryItem;
	
	//code for Men List page
	@FindBy(xpath=".//*[@class='horizontal_list clearfix bc_list f_size_medium']//following::li")
	public WebElement findMenListPage;
	//Code for identify Clothing category item
	@FindBy(xpath=".//*[@class='menu_wrap relative']//following::ul/li[1]/div/div[1]/a/b")
	public WebElement findWatchCategoryItem;
	//code for Watch list page
	@FindBy(xpath=".//*[@class='container']//following::div/ul/li")
	public WebElement findWatchListPage;
	
	//Code for identify analog Watch category item
	@FindBy(xpath=".//*[@class='menu_wrap relative']//following::ul/li[1]/div/div[1]/ul/li[1]")
	public WebElement findAnalogWatchCategoryItem;
	//code for Analog Watch list page
	@FindBy(xpath=".//*[@class='container']//following::div/ul/li")
	public WebElement findAnalogWatchListPage;
	
	// code for Digital watch category item
	@FindBy(xpath=".//*[@class='menu_wrap relative']//following::ul/li[1]/div/div[1]/ul/li[2]")
	public WebElement findDigitalWatchCategoryItem;
	
	// code for Digital watch List page
	@FindBy(xpath=".//*[@class='container']//following::div/ul/li[4]")
	public WebElement findDigitalWatchListPage;
	
	//code for Analog & Digital watch category item
	@FindBy(xpath=".//*[@class='menu_wrap relative']//following::ul/li[1]/div/div[1]/ul/li[3]")
	public WebElement findAnalogandDigitalWatchCategoryItem;
	
	//code for Analog & Digital watch List page
	@FindBy(xpath=".//*[@class='container']//following::div/ul/li[4]")
	public WebElement findAnalogandDigitalWatchListPage;
	
	//code for shoes category item
	@FindBy(xpath=".//*[@class='menu_wrap relative']//following::ul/li[1]/div/div[2]/a/b")
	public WebElement findShoesCategoryItem;
	
	//code for shoes List page
	@FindBy(xpath=".//*[@class='container']//following::div/ul/li[3]")
	public WebElement findShoesListPage;
	
	//code for formal shoes category item
	@FindBy(xpath=".//*[@class='menu_wrap relative']//following::ul/li[1]/div/div[2]/ul/li[1]")
	public WebElement findFormalShoesCategoryItem;
	
	//code for formal shoes List page
	@FindBy(xpath=".//*[@class='container']//following::div/ul/li[4]")
	public WebElement findFormalShoesListPage;
	//code for casual shoes category item
	@FindBy(xpath=".//*[@class='menu_wrap relative']//following::ul/li[1]/div/div[2]/ul/li[2]")
	public WebElement findCasualShoesCategoryItem;
	
	//code for casual shoes List page
	@FindBy(xpath=".//*[@class='container']//following::div/ul/li[4]")
	public WebElement findCasualShoesListPage;
	
	//code for boots category item
	@FindBy(xpath=".//*[@class='menu_wrap relative']//following::ul/li[1]/div/div[2]/ul/li[3]")
	public WebElement findBootsCategoryItem;
	
	//code for boots List page
	@FindBy(xpath=".//*[@class='container']//following::div/ul/li[4]")
	public WebElement findBootsListPage;
	
	public WebElement DispalyMenListPage(){
		findMenCategoryItem.click();
		Browser.setWebDriverWait(5);
		return findMenListPage;
	}
	
	public WebElement DispalyWatchListPage() {
		findWatchCategoryItem.click();
		Browser.setWebDriverWait(5);
		return findWatchListPage;
	}
	
	public WebElement DispalyAnalogWatchListPage() {
		findAnalogWatchCategoryItem.click();
		Browser.setWebDriverWait(5);
		return findAnalogWatchListPage;
	}
	
	public WebElement DisplayDigitalWatchListPage() {
		findDigitalWatchCategoryItem.click();
		Browser.setWebDriverWait(5);
		return findDigitalWatchListPage;
	}
	public WebElement DisplayAnalogandDigitalWatchListPage() {
		findAnalogandDigitalWatchCategoryItem.click();
		Browser.setWebDriverWait(5);
		return findAnalogandDigitalWatchListPage;
	}
	
	public WebElement DispalyShoesListPage() {
		findShoesCategoryItem.click();
		Browser.setWebDriverWait(5);
		return findShoesListPage;
	}
	public WebElement DispalyFormalShoesListPage() {
		findFormalShoesCategoryItem.click();
		Browser.setWebDriverWait(5);
		return findFormalShoesListPage;
	}
	public WebElement DispalyCasualShoesListPage() {
		findCasualShoesCategoryItem.click();
		Browser.setWebDriverWait(5);
		return findCasualShoesListPage;
	}
	public WebElement DispalyBootsListPage() {
		findBootsCategoryItem.click();
		Browser.setWebDriverWait(5);
		return findBootsListPage;
	}
	
	public MenCategory open(String url){
        driver.get(url);
        return this;
    }
	
	public PageBase load() {
        driver.get(getUrl());
        return this;
	}	
}
