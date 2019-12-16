package targetprofilestructure;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import pagebase.BasePage;

/**
 * created by Jyoti 30/09/2019
 */

public class BrandsDrinkHome extends BasePage
   {
	  WebDriver driver;  
	  public BrandsDrinkHome(WebDriver driver) 
	     {
		   this.driver=driver;
	     }
	  
	  //Find out question text for brand drink at home
	  @FindBy(xpath="//div[contains(text(),'自宅で缶チューハイではどの銘柄をお飲みになりますか？')]")
	  private WebElement find_question_brand_drink_home;

	  //Brand drink at home question text verification
	  public void brandDrinkHomeQuestionText(String text) 
	     {
		    textVerification(find_question_brand_drink_home, text);
		 }
	  
	//Find out radio button for all brand types
	  @FindAll({
	  @FindBy(css="div.mat-radio-container")
	  })
	  private List<WebElement> select_radio_button_brand;
	  
	//Find out radio button for all brand types
	  @FindAll({
	  @FindBy(css="div.mat-radio-label-content")
	  })
	  private List<WebElement> select_radio_button_brand_text;
	 
	  //Select any brand clicking radio button 
	  	 public void selectItemForHomeDrink(String str) throws InterruptedException
	  	    {
	  	        selectRadioButtonItem(select_radio_button_brand , select_radio_button_brand_text , str);
	  	    
	  	    }
	  //Code for click send button after selecting brand type	 
	  	 public void clickSendButtonSelectingBrandtype()
	  	    {
	  		   clickButton(find_All_Send_button.get(2));
	  		   
	  	    }
   }
