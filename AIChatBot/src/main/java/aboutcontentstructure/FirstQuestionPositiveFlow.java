package aboutcontentstructure;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pagebase.BasePage;

/**
 * created by Jyoti 07/10/2019
 */

public class FirstQuestionPositiveFlow extends BasePage
   {
	   WebDriver driver;
    
	   public FirstQuestionPositiveFlow(WebDriver driver) 
	      {
		    this.driver=driver;
	      }
	   
	   //Find out first question text for positive flow: Can you tell me more about "keyword"
	   @FindBy(xpath="//div[contains(text(), 'についてもう少し詳しく教えてください。')]")
	   private WebElement first_question_text_positive_flow;

	   //Verification first question text for positive flow
	   public void verifyFirstQuestionPositiveFlowOfAboutContent(String keyword_text,String sub_text)
	      {
		      textVerificationDynamic(first_question_text_positive_flow, keyword_text, sub_text);
	      }
	   
	   //Verification valid answer for first question of positive flow
	   //"Keyword"についてもう少し詳しく教えてください。
	   public void validAnswerFirstQusetionOfPositiveFlow(String text)
	 	  {
	 		  enterValueIntoTextField(find_chat_text_field, text);
	 	  }
	   //Verification click send button after entering valid answer for first question of positive flow
	   public void clickSendButtonAfterEnteringAnswerFirstQuestionPositiveFlow()
	 	  {
	 		  clickSendButtonForTextSending(1);
	 	  }
	   
	   
   }
