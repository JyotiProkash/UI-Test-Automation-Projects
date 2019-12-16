package loginlogout;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pagebase.BasePage;

/**
 * Created by Jyoti 15/09/2019
 */

public class LogOutFromApp extends BasePage
   {
	   WebDriver driver;  
	   public LogOutFromApp(WebDriver driver) 
	      {
		     this.driver=driver;
	      }
	   
	   //Find out logout button
	   @FindBy(css="div.logout")
	   private List<WebElement> logoutapp;
	   
	   //Verification logout from App
	   public void verifyLogoutFromApp()
	      {
		     clickButton(logoutapp.get(0));
	      }
   }
