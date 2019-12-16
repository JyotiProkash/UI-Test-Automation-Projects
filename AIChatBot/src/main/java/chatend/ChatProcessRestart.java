package chatend;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pagebase.BasePage;

/**
 * created by Jyoti 24/10/2019
 */

public class ChatProcessRestart extends BasePage
   {
	   WebDriver driver;  
	   
	   public ChatProcessRestart(WebDriver driver) 
	      {
		    this.driver=driver;
	      }
	   
	   /*Find out Yes button from pop-up of Chat End process
	    * はい 
	    */
	   @FindBy(css="div#yes")
	   private WebElement restart_chat_process;
	   
	   //Verification click Yes button for restarting Chat
	   public void verifyClickYesButtonForChatRestart()
		  {
		     clickButton(restart_chat_process);
		  }
   }
