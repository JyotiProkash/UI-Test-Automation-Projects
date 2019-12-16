package homepage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import pagebase.BasePage;

/**
 * Created by Jyoti 17/09/2019
 */

public class LaunchChatWindow extends BasePage
   {
      WebDriver driver;
	  public LaunchChatWindow(WebDriver driver) 
	     {
		   this.driver=driver;
	     }
	  
		 //Find out title of Chat Window
		 @FindBy(xpath="//div[contains(text(), '3Aプロジェクトボット')]")
		 @CacheLookup
		 private WebElement titleChatWindow;
		 
		 //Title verification of Chat Window 
		 public void verificationChatWindowTitle(String text) 
		    {
			   textVerification(titleChatWindow, text);
		    }
   }
