package targetprofilestructure;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import pagebase.BasePage;

/**
 * created by Jyoti 05/10/2019
 */
public class HowMuchTimesDrinkHome extends BasePage
   {
	  WebDriver driver;  
	  public HowMuchTimesDrinkHome(WebDriver driver) 
	     {
		    this.driver=driver;
	     }
	  
	     //Find out "How often do you drink at home?" question text 
		 @FindBy(xpath="//div[contains(text(),'自宅でどの位の頻度でお飲みになりますか？')]")
		 public WebElement how_much_time_drink_question_text;
		 
		 //Verification "How often do you drink at home?" question text 
		 public void countDrinkTimesHome(String text) 
		    {
			    textVerification(how_much_time_drink_question_text, text);
		    }
		 
		  //Find out radio button for drink times 
		  @FindAll({
		  @FindBy(css="div.mat-radio-container")
		  })
		  private List<WebElement> select_radio_button_drink_times;
		  
		  //Find out radio button text for drink times 
		  @FindAll({
		  @FindBy(css="div.mat-radio-label-content")
		  })
		  private List<WebElement> select_radio_button_drink_times_text;
		 
		  //Select any brand clicking radio button 
		  public void selectDrinkTimesHome(String str) throws InterruptedException
		  	 {
		  	     selectRadioButtonItem(select_radio_button_drink_times , select_radio_button_drink_times_text , str);
		  	    
		  	 }
		  //Code for click send button after selecting drink times	 
		  public void clickSendButtonSelectingDrinkTimes()
		  	 {
			    clickButton(find_All_Send_button.get(2));
		  		   
		  	 }
   }
