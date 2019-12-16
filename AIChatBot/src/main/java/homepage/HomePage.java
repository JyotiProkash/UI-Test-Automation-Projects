package homepage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import pagebase.BasePage;

/**
 * Created by Jyoti 17/09/2019
 */

public class HomePage extends BasePage
  {
	WebDriver driver;
	
	public HomePage(WebDriver driver) 
	  {
		this.driver=driver;
	  }
	
	  //Find out Logout button 
	  @FindBy(linkText="ログアウト")
	  @CacheLookup
	  private WebElement bot_link_text;
	  
	  //Find out start chat button
	  @FindBy(xpath="//button[contains(text(),'インタビューを開始する')]")
	  @CacheLookup
	  private WebElement startChatButton;
	  
	  //Verification successful login
	  public void verificationSuccessfulLogin(String text) 
	    {
           textVerification(bot_link_text, text); 
	    }
	  
	  //Click Start chat button
	  public void clickStartChatButton()
	    {
		  startChatButton.click();
	    }
  }
