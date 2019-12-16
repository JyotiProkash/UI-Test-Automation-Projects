package targetprofilestructure;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import pagebase.BasePage;

/**
 * created by 30/09/2019
 */

public class DrinkTimesChuhiOutsideHome extends BasePage
   {
	  WebDriver driver;  
	  public DrinkTimesChuhiOutsideHome(WebDriver driver) 
	     {
		    this.driver=driver;
	     }
	  
	     //Find out "Please tell me when you drink chu_hi outside of your home. How often do you drink?" question text 
		 @FindBy(xpath="//div[contains(text(),'自宅以外でチューハイをお飲みになる時のことを教えてください。 どの位の頻度でお飲みになりますか？')]")
		 public WebElement drink_time_chuhi_outside_home_question_text;
		 
		 //Verification "Please tell me when you drink chu_hi outside of your home. How often do you drink?" question text 
		 public void countDrinkTimesChuhiOutsideHome(String text) 
		    {
			    textVerification(drink_time_chuhi_outside_home_question_text, text);
		    }
		 
		  //Find out radio button for drink times chu_hi outside home 
		  @FindAll({
		  @FindBy(css="div.mat-radio-container")
		  })
		  private List<WebElement> select_radio_button_drink_times_chuhi;
		  
		  //Find out radio button text for drink times chu_hi outside home
		  @FindAll({
		  @FindBy(css="div.mat-radio-label-content")
		  })
		  private List<WebElement> select_radio_button_drink_times_chuhi_text;
		 
		  //Select any brand clicking radio button 
		  public void selectDrinkTimesChuhiOutsideHome(String str) throws InterruptedException
		  	 {
		  	     selectRadioButtonItem(select_radio_button_drink_times_chuhi , select_radio_button_drink_times_chuhi_text , str);
		  	    
		  	 }
		  //Code for click send button after selecting drink times	 
		  public void clickSendButtonSelectingDrinkTimesChuhiOutsideHome()
		  	 {
			    clickButton(find_All_Send_button.get(2));
		  		   
		  	 }
   }
