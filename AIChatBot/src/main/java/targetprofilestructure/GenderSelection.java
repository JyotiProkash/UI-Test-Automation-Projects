package targetprofilestructure;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pagebase.BasePage;

/**
 * created by 23/09/2019
 */

public class GenderSelection extends BasePage
   {
	 WebDriver driver;  
	 public GenderSelection(WebDriver driver) 
	    {
		  this.driver=driver;
	    }
	 
	//Find out gender question text
		 @FindBy(xpath="//div[contains(text(), '性別を教えてください。')]")
		 private WebElement find_gender_question_text;
		 
		//Gender question text verification
		 public void genderQuestionText(String text) 
		   {
		        textVerification(find_gender_question_text, text);
		   }
		 
		//Find out gender female
		 @FindBy(css="span.switch-label-unchecked")
		 private WebElement find_gender_female;

		 //Find out gender male
		 @FindBy(css="span.switch-label-checked")
		 private WebElement find_gender_male;
		 
		 //Gender selection code
		 public void selectGender(String gender)
		   {  
		      if(gender.equalsIgnoreCase("Male"))
		        {
		    	   JavascriptExecutor js = (JavascriptExecutor)driver;
		    	   js.executeScript("arguments[0].click();", find_gender_female);
		        } 
		   }
		 
		//Click send button after gender selection
		public void clickSendButtonGenderSelection()
		   { 
			  find_All_Send_button.get(1).click();
		   }
   }
