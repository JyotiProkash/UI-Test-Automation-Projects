package org.automation.eshopper.pages;

import java.util.List;

import org.automation.eshopper.EShopperPageBase;
import org.automation.selenium.page.PageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;

public class HomePage extends EShopperPageBase {

	public HomePage(WebDriver aDriver) {
		super(aDriver);
		// TODO Auto-generated constructor stub
	}
	
	//Find out login link
	@FindBy(how=How.LINK_TEXT, linkText="Log in")
    public WebElement login_link;
	
	//Login page verification
	@FindBy(how=How.XPATH, xpath=".//h2[text()='Welcome, Please Sign In!']")
	public WebElement login_page_text_verification;
	
	//Find out register link
	@FindBy(how=How.LINK_TEXT, linkText="Register")
	public WebElement register_link;
	
	//Register page verification 
	@FindBy(how=How.XPATH, xpath="//form//h2[text()='Register']")
	public WebElement register_page_text_verification;
	
	//Code identify for Men category item
	@FindBy(xpath=".//*[@class='menu_wrap relative']//following::ul/li[1]/a/b")
	public WebElement findMenCategoryItem;
	
	//code identify for Watch category under Men
	@FindBy(xpath=".//*[@class='menu_wrap relative']//following::ul/li[1]/div/div[1]/a/b")
	public WebElement findWatchCategory;
	
	//code identify for Shoes category under Men
	@FindBy(xpath=".//*[@class='menu_wrap relative']//following::ul/li[1]/div/div[2]/a/b")
	public WebElement findShoesCategory;
	
	//code identify for Watch subcategory under Watch
	@FindBys({
	          @FindBy(xpath=".//*[@class='menu_wrap relative']//following::ul/li[1]/div/div[1]/ul/li[1]"),
	          @FindBy(xpath=".//*[@class='menu_wrap relative']//following::ul/li[1]/div/div[1]/ul/li[2]"),
	          @FindBy(xpath=".//*[@class='menu_wrap relative']//following::ul/li[1]/div/div[1]/ul/li[3]")
	})
	public List<WebElement> findWatchSubcategory;
	
	//code identify for Shoes subcategory under Shoes
	@FindBys({
	          @FindBy(xpath=".//*[@class='menu_wrap relative']//following::ul/li[1]/div/div[2]/ul/li[1]"),
	          @FindBy(xpath=".//*[@class='menu_wrap relative']//following::ul/li[1]/div/div[2]/ul/li[2]"),
	          @FindBy(xpath=".//*[@class='menu_wrap relative']//following::ul/li[1]/div/div[2]/ul/li[3]")
	})
	public List<WebElement> findShoesSubcategory;
	
	//Code identify for Women category item
	@FindBy(xpath=".//*[@class='menu_wrap relative']//following::ul/li[2]/a/b")
	public WebElement findWomenCategoryItem;
	
	//code identify for Clothing category under Women
	@FindBy(xpath=".//*[@class='menu_wrap relative']//following::ul/li[2]/div/div[1]/a/b")
	public WebElement findClothingCategory;
	
	//code identify for Watches category under Women
	@FindBy(xpath=".//*[@class='menu_wrap relative']//following::ul/li[2]/div/div[2]/a/b")
	public WebElement findWatchesCategory;
	
	//code identify for Clothing subcategory under Clothing
	@FindBys({
	          @FindBy(xpath=".//*[@class='menu_wrap relative']//following::ul/li[2]/div/div[1]/ul/li[1]"),
	          @FindBy(xpath=".//*[@class='menu_wrap relative']//following::ul/li[2]/div/div[1]/ul/li[2]")
	})
	public List<WebElement> findClothingSubcategory;
	
	//code identify for Watches subcategory under Watches
	@FindBys({
	          @FindBy(xpath=".//*[@class='menu_wrap relative']//following::ul/li[2]/div/div[2]/ul/li[1]")
	})
	public List<WebElement> findWatchesSubcategory;
	
	//Code identify for Electronics category item
	@FindBy(xpath=".//*[@class='menu_wrap relative']//following::ul/li[3]/a/b")
	public WebElement findElectronicsCategoryItem;
	
	//code identify for Accessories category under Electronics
	@FindBy(xpath=".//*[@class='menu_wrap relative']//following::ul/li[3]/div/div[1]/a/b")
	public WebElement findElectronicsCategory;
	
	//code identify for Accessories subcategory under Accessories
	@FindBys({
        @FindBy(xpath=".//*[@class='menu_wrap relative']//following::ul/li[3]/div/div[1]/ul/li[1]")
})
    public List<WebElement> findAccessoriesSubcategory;
	
	//Code identify for Boishakhi Collection category item
	@FindBy(xpath=".//*[@class='menu_wrap relative']//following::ul/li[4]/a/b")
	public WebElement findBoishakhiCategoryItem;
	
	//Code identify for Eid Collection category item
	@FindBy(xpath=".//*[@class='menu_wrap relative']//following::ul/li[5]/a/b")
	public WebElement findEidCollectionCategoryItem;
	
	//Code method for getting HomePage title
	public String getHomePageTitle(){
		return driver.getTitle();
		
	}
	//code for display Men sub category
	public WebElement displayMenSubcategory(){
		Actions m_builder = new Actions(driver);
		m_builder.moveToElement(findMenCategoryItem).build().perform();
		return findMenCategoryItem;
	}
	
	//code for display Women sub category
	public WebElement displayWomenSubcategory(){
		Actions wm_builder = new Actions(driver);
		wm_builder.moveToElement(findWomenCategoryItem).build().perform();
		return findWomenCategoryItem;
	}
	
	//code for display Electronics sub category
	public WebElement displayElectronicsSubcategory(){
		Actions elec_builder = new Actions(driver);
		elec_builder.moveToElement(findElectronicsCategoryItem).build().perform();
		return findElectronicsCategoryItem;
	}
	
	//code method for Women Subcategory verification
	public List<WebElement> getWomenSubcategory(){
		Actions w_builder = new Actions(driver);
		w_builder.moveToElement(findWomenCategoryItem).build().perform();
		findWatchSubcategory.add(findWatchCategory);
		findShoesSubcategory.add(findShoesCategory);
		for(int i=0;i<findShoesSubcategory.size();i++)
		findWatchSubcategory.add(findShoesSubcategory.get(i));
		return findWatchSubcategory;
	}
	
	//code method for Men Subcategory verification
	public List<WebElement> getMenSubcategory(){
		Actions m_builder = new Actions(driver);
		m_builder.moveToElement(findMenCategoryItem).build().perform();
		findClothingSubcategory.add(findClothingCategory);
		findWatchesSubcategory.add(findWatchesCategory);
		for(int i=0;i<findWatchesSubcategory.size();i++)
		findClothingSubcategory.add(findWatchesSubcategory.get(i));
		return findClothingSubcategory;
	}
	
	//code method for Electronics Subcategory verification
	public List<WebElement> getElectronicsSubcategory(){
		Actions elec_builder = new Actions(driver);
		elec_builder.moveToElement(findElectronicsCategoryItem).build().perform();
		findAccessoriesSubcategory.add(findElectronicsCategory);
		/*for(int i=0;i<findAccessoriesSubcategory.size();i++)
		findClothingSubcategory.add(findWatchesSubcategory.get(i));*/
		return findAccessoriesSubcategory;
	}
	
	//code method for Boishakhi Collection category verification
	public WebElement getBoishakhiCollectionCategory(){
		Actions boi_collec_builder = new Actions(driver);
		boi_collec_builder.moveToElement(findBoishakhiCategoryItem).build().perform();
		return findBoishakhiCategoryItem;
	}
	
	//code method for Electronics Subcategory verification
	public WebElement getEidCollectionCategory(){
		Actions elec_builder = new Actions(driver);
		elec_builder.moveToElement(findEidCollectionCategoryItem).build().perform();
		return findEidCollectionCategoryItem;
	}
	
	public WebElement clickLoginLink(){
		login_link.click();
		return login_page_text_verification;
	}
	
	public String clickRegisterLink() {
		// TODO Auto-generated method stub
		register_link.click();
		return register_page_text_verification.getText();
		
	}
	
	public HomePage open(String url){
        driver.get(url);
        return this;
    }
	
	public PageBase load() {
        driver.get(getUrl());
        return this;
	}


}
