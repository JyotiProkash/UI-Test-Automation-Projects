package org.bjit.globaljobs.selenium.core;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage{
	
	WebDriver driver=null;
	
	public HomePage(WebDriver driver){
		this.driver=driver;
	}
	
	@FindBy(xpath ="/html/body/div[2]/section[1]/div[1]/div/div/div/a[1]" )//Sign in header link
	public WebElement signinHeaderLink;
	
	@FindBy(id ="forgot_mod")//Sign in popup verification
	public WebElement signinPopupVerification;
	
	@FindBy(xpath =".//*[@id='wrapper']/section[1]/div[1]/div/div/div/a[2]" )//Sign up header link
	public WebElement signupHeaderLink;
	
	@FindBy(xpath =".//*[@id='signupSubmit']/div[5]/label" )//Sign up popup verification
	public WebElement signupPopupVerification;
	
	@FindBy(xpath =".//*[@id='navbar']/div/div/div/ul/li[1]/a" )//For Home menu link
	public WebElement homeMenuLink;
	
	@FindBy(xpath =".//*[@id='home']/div[2]/div/div/div[1]/ul/li[2]/p" )//For Home page text verification
	public WebElement homePageTextVerification;
	
	@FindBy(xpath =".//*[@id='navbar']/div/div/div/ul/li[2]/a" )//For Service menu link
	public WebElement serviceMenuLink;
	
	@FindBy(xpath =".//*[@id='services']/div[1]/div[1]/h1" )//For Service page text verification
	public WebElement servicePageTextVerification;
	
	@FindBy(xpath =".//*[@id='navbar']/div/div/div/ul/li[3]/a" )//For about us menu link
	public WebElement aboutUsMenuLink;
	
	@FindBy(xpath =".//*[@id='about']/div/div[1]/div[1]/h1" )//For About us page text verification
	public WebElement aboutUsPageTextVerification;
	
	@FindBy(xpath =".//*[@id='navbar']/div/div/div/ul/li[4]/a" )//For Client menu link
	public WebElement clientsMenuLink;
	
	@FindBy(xpath =".//*[@id='clients']/div/div/div[1]/p" )//For Client page text verification
	public WebElement clientsPageTextVerification;
	
	@FindBy(xpath =".//*[@id='navbar']/div/div/div/ul/li[5]/a" )//For Support menu link
	public WebElement supportsMenuLink;
	
	@FindBy(xpath =".//*[@id='support']/div/div[1]/h1" )//For Support page text verification
	public WebElement supportsPageTextVerification;
	
	@FindBy(xpath =".//*[@id='navbar']/div/div/div/ul/li[6]/a" )//For Portfolio menu link
	public WebElement portfolioMenuLink;
	
	@FindBy(xpath =".//*[@id='success']/div/div/div[1]/h2" )//For Portfolio page text verification
	public WebElement portfolioPageTextVerification;
	
	@FindBy(xpath =".//*[@id='navbar']/div/div/div/ul/li[7]/a" )//For Find us menu link
	public WebElement findUsMenuLink;
	
	@FindBy(xpath =".//*[@id='contact']/div/div[1]/h1" )//For Find us page text verification
	public WebElement findUsPageTextVerification;
	
	@FindBy(xpath ="html/body/footer/div/div/div[1]/div[1]/ul/li[1]/a" )//For Our Story Footer link
	public WebElement ourStoryFooterLink;
	
	@FindBy(xpath =".//*[@id='wrapper']/div[2]/div/div/div/div/div/article/h3/strong" )//For Our Story Page verification
	public WebElement ourStoryPageVerification;

	@FindBy(xpath ="html/body/footer/div/div/div[1]/div[1]/ul/li[2]/a" )//For Our Supports Footer link
	public WebElement ourSupportsFooterLink;
	
	@FindBy(xpath =".//*[@id='wrapper']/div[2]/div/div/div/div/div/article/h3/strong" )//For Our Supports Page verification
	public WebElement ourtSupportsPageVerification;
	
	@FindBy(xpath ="html/body/footer/div/div/div[1]/div[1]/ul/li[3]/a" )//For FAQ Footer link
	public WebElement FaqFooterLink;
	
	@FindBy(xpath =".//*[@id='wrapper']/div[2]/div/div/div/div/div/article/h3/strong" )//For FAQ Page verification
	public WebElement FaqPageVerification;
	
	@FindBy(xpath ="html/body/footer/div/div/div[1]/div[1]/ul/li[4]/a" )//For Terms of Use Footer link
	public WebElement termsofUseFooterLink;
	
	@FindBy(xpath =".//*[@id='wrapper']/div[2]/div/div/div/div/div/article/h3/strong" )//For Terms of Use Page verification
	public WebElement termsofUsePageVerification;
	
	@FindBy(xpath ="html/body/footer/div/div/div[1]/div[1]/ul/li[5]/a" )//For Contact Us Footer link
	public WebElement contactUsFooterLink;
	
	@FindBy(xpath =".//*[@id='wrapper']/div[2]/div/div/div/div/div/h3" )//For Contact Us Page verification
	public WebElement contactUsPageVerification;
	
	@FindBy(xpath ="html/body/footer/div/div/div[1]/div[2]/ul/li[1]/a/i" )//For Facebook Footer link
	public WebElement facebookFooterLink;
	
	@FindBy(xpath =".//*[@id='login_form']/table/tbody/tr[1]/td[1]/label" )//For Facebook Page verification
	public WebElement facebookPageVerification;
	
	@FindBy(xpath ="html/body/footer/div/div/div[1]/div[2]/ul/li[2]/a/i" )//For Twitter Footer link
	public WebElement twitterFooterLink;
	
	@FindBy(xpath =".//*[@id='page-container']/div[2]/div/div/div[1]/div/div/div/div[1]/p" )//For Twitter Page verification
	public WebElement twitterPageVerification;
	
	@FindBy(xpath ="html/body/footer/div/div/div[1]/div[2]/ul/li[3]/a/i" )//For Google Plus Footer link
	public WebElement googlePlusFooterLink;
	
	@FindBy(xpath =".//*[@id='i13']/div/div/div[2]/div[1]/div[1]/div/div" )//For GooglePlus Page verification
	public WebElement googlePlusPageVerification;
	
	/***Header Items verification**/
	public WebElement clickSignIn() { //Signin popup verification
		// TODO Auto-generated method stub
		signinHeaderLink.click();
		browserWaitingTime();
		//Browser.setDefaultTimeout();
		return signinPopupVerification;
	}

	public WebElement clickSignUp() {
		// TODO Auto-generated method stub
		signupHeaderLink.click();
		browserWaitingTime();
		//Browser.setDefaultTimeout();
		return signupPopupVerification;
	}
	
	/***Menu Items verification**/
	
	public String clickHome() {
	// -> click the link
	// right down corner up link
	// check browser viewing area 
	// if area ok, then return ok
	//return
		homeMenuLink.click();
		browserWaitingTime();
		return homePageTextVerification.getText();
}
	
public String clickService() {
	// TODO Auto-generated method stub
	serviceMenuLink.click();
	browserWaitingTime();
	return servicePageTextVerification.getText();
}

public String clickAboutUS() {
	// TODO Auto-generated method stub
	aboutUsMenuLink.click();
	browserWaitingTime();
	return aboutUsPageTextVerification.getText();
}

public String clickClients() {
	// TODO Auto-generated method stub
	clientsMenuLink.click();
	browserWaitingTime();
	return clientsPageTextVerification.getText();
}

public String clickSupports() {
	// TODO Auto-generated method stub
	supportsMenuLink.click();
	browserWaitingTime();
	return supportsPageTextVerification.getText();
}

public String clickProtfolio() {
	// TODO Auto-generated method stub
	portfolioMenuLink.click();
	browserWaitingTime();
	return portfolioPageTextVerification.getText();
}

public String clickFindUs() {
	// TODO Auto-generated method stub
	findUsMenuLink.click();
	browserWaitingTime();
	return findUsPageTextVerification.getText();
}


/***Footer Link Verification**/

public String clickOurStory() {
	// TODO Auto-generated method stub
	ourStoryFooterLink.click();
	browserWaitingTime();
	return ourStoryPageVerification.getText();
}

public String clickSupportsFooterLink() {
	// TODO Auto-generated method stub
	ourSupportsFooterLink.click();
	browserWaitingTime();
	return ourtSupportsPageVerification.getText();
}

public String clickTermsofUse() {
	// TODO Auto-generated method stub
	termsofUseFooterLink.click();
	browserWaitingTime();
	return termsofUsePageVerification.getText();
}

public String clickFaq() {
	// TODO Auto-generated method stub
	FaqFooterLink.click();
	browserWaitingTime();
	return FaqPageVerification.getText();
}

public String clickContactUs() {
	// TODO Auto-generated method stub
	contactUsFooterLink.click();
	browserWaitingTime();
	return contactUsPageVerification.getText();
}

public String clickFaceBookLink() {
	// TODO Auto-generated method stub
	String textmessageFacebookpage= windowHandle(facebookFooterLink,facebookPageVerification);
	return textmessageFacebookpage;
}

public String clickTwitterLink() {
	// TODO Auto-generated method stub
	String textmessageTwitter= windowHandle(twitterFooterLink,twitterPageVerification);
	return textmessageTwitter;
}

public String clickGooglePlusLink() {
	// TODO Auto-generated method stub
	String textmessageGooglePlus= windowHandle(googlePlusFooterLink,googlePlusPageVerification);
	return textmessageGooglePlus;
}

public String windowHandle(WebElement webElementLink, WebElement textVerification){

	String parentWindow=driver.getWindowHandle();
	webElementLink.click();
	browserWaitingTime();
	for(String childWindow:driver.getWindowHandles()){
	driver.switchTo().window(childWindow);
	browserWaitingTime();
	}
	
	String isTextPresent=textVerification.getText();
	//driver.close();
	browserWaitingTime();
	driver.switchTo().window(parentWindow);
	browserWaitingTime();
	return isTextPresent;
	
}


private void browserWaitingTime(){ //time for loading page in  browser 
	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
}

public WebElement displayHomePage() {
	// TODO Auto-generated method stub
	browserWaitingTime();
	return signinHeaderLink;
	
}



}
