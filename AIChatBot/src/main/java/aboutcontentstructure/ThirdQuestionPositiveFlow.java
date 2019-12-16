package aboutcontentstructure;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pagebase.BasePage;

/**
 * created by Jyoti 14/10/2019
 */

public class ThirdQuestionPositiveFlow extends BasePage
   {
	   public WebDriver driver;  
	   public ThirdQuestionPositiveFlow(WebDriver driver) 
	      {
		    this.driver=driver;
	      }
	   
	   /*Find out third question for positive flow: Do you feel anything other than "Keyword"?
	    *その他に "keyword" 以外に何か感じることはありませんか？
	    */
	   @FindBy(xpath="//div[contains(text(), '以外に何か感じることはありませんか？')]")
	   private WebElement third_question_text_positive_flow;

	   /*Verification third question text for positive flow
	    * その他に "keyword" 以外に何か感じることはありませんか？
	    */
	   public void verifyThirdQuestionPositiveFlowOfAboutContent(String keyword_text,String first_sub_text, String second_sub_text)
	      {
		      textVerificationDynamicTwoSubString(third_question_text_positive_flow, keyword_text, first_sub_text,second_sub_text);
	      }
	   
	   /*Verification answer of third question of positive flow: Do you feel anything other than "keyword"?
	    * その他に "keyword" 以外に何か感じることはありませんか？
	    */
	   public void validAnswerThirdQuestionPositiveFlowOfAboutContent(String text)
		  {
			  enterValueIntoTextField(find_chat_text_field, text);
		  }
	   //Verification click send button after entering answer of third question of positive flow
	   public void clickSendButtonAfterEnteringAnswerThirdQuestionPositiveFlow()
		  {
			  clickSendButtonForTextSending(1);
		  }
   }
