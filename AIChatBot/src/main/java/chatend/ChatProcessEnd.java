package chatend;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pagebase.BasePage;

/**
 * created by Jyoti 24/10/2019
 */

public class ChatProcessEnd extends BasePage
   {
	   WebDriver driver;  
	   
	   public ChatProcessEnd(WebDriver driver) 
	      {
		    this.driver=driver;
	      }
	   
	   /*Find out No button from pop-up of Chat End process
	    * いいえ 
	    */
	   @FindBy(css="div#no")
	   private WebElement dismiss_chat_end_popup;
	   
	   //Verification click no button for Chat end
	   public void verifyClickNoButtonForChatEnd()
		  {
		     clickButton(dismiss_chat_end_popup);
		  }
   }
