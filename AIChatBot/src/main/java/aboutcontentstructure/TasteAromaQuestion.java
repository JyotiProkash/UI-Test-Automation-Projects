package aboutcontentstructure;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pagebase.BasePage;

/**
 * created by Jyoti 10/10/2019
 */

public class TasteAromaQuestion extends BasePage
   {
      WebDriver driver;
      
	  public TasteAromaQuestion(WebDriver driver) 
	    {
		  this.driver=driver;
	    }
	//Find out text for taste or aroma related question
	@FindBy(xpath="//div[contains(text(), '味や香りについて感じたことがあれば教えてください。')]")
	private WebElement ask_taste_aroma_question_text;
		  
	//Verification taste and aroma related question text
	public void verifyTasteAromaQuestionTextAboutContent(String text)
	   {
		    textVerification(ask_taste_aroma_question_text, text);
	   }
	   
    //Verification valid answer for first hierarchy keyword 
	public void validFirstHierarchyKeyword(String text)
	   {
		    enterValueIntoTextField(find_chat_text_field, text);
	   }
    //Verification click send button after entering valid first hierarchy keyword
	public void clickSendButtonAfterEnteringValidFirstHierarchyKeyword()
	   {
		    clickSendButtonForTextSending(1);
	   }
	   
	   
   }
