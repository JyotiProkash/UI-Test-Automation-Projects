package targetprofilestructure;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pagebase.BasePage;

/**
 * created by Jyoti 30/09/2019
 */

public class DrinkTimeOftenChuhi extends BasePage
   {
	  WebDriver driver;  
	  public DrinkTimeOftenChuhi(WebDriver driver) 
	     {
		    this.driver=driver;
	     }
	  
	  //Find out "When do you often drink it?" question text 
	  @FindBy(xpath="//div[contains(text(),'それはどんな時にお飲みになることが多いですか？')]")
	  public WebElement drink_time_chuhi_outside_home_question_text;
		 
	  //Verification "When do you often drink it?" question text 
	  public void countDrinkTimesChuhiOutsideHomeQuestionText(String text) 
		 {
		     textVerification(drink_time_chuhi_outside_home_question_text, text);
		 }
	  
	  //Verification valid answer for "When do you often drink it?" question
	  public void validDrinkTimeChuhi(String text)
	     {
		     enterValueIntoTextField(find_chat_text_field, text);
	     }
	  
	  //Verification click send button
	  public void clickSendButtonAfterEnteringValidTimesForChuhi()
	     {
		     clickSendButtonForTextSending(1);
	     }
   }
