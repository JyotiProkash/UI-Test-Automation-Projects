package icebreakstructure;

/**
 * Created by Jyoti 23/09/2019
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import pagebase.BasePage;

public class StartChat extends BasePage
   {
	  WebDriver driver;  
	  public StartChat(WebDriver driver) 
	      {
		    this.driver=driver;
	      }
	  
	//Find out Start button in Chat Window
		 @FindBy(xpath="//span[contains(text(), 'スタート')]")
		 @CacheLookup
		 private WebElement startButtonChatWindow;
		 
		 //Click Start button of Chat window
		 public void clickStartButtonChatWindow()
		    {
			   clickButton(startButtonChatWindow);
		    }
   }
