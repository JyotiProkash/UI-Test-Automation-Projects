package aboutcontentstructure;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pagebase.BasePage;

/**
 * created by Jyoti 15/10/2019
 */

public class FourthCommonQuestionPositiveNegativeFlow extends BasePage
   {
	   public WebDriver driver;
	   
	   public FourthCommonQuestionPositiveNegativeFlow(WebDriver driver) 
	      {
		     this.driver=driver;
	      }
	   
	   /*Find out fourth question : Please tell us what you felt about the taste and aroma, and if there are any changes in the impression.
	    *味や香りについて感じたことや、印象の変化があればその理由を教えてください。
	    */
	   @FindBy(xpath="//div[contains(text(), '味や香りについて感じたことや、印象の変化があればその理由を教えてください。')]")
	   private WebElement fourth_question_positive_negative_flow;
	   
	   //Verification fourth common question text of positive and negative flow: Please tell us what you felt about the taste and aroma, and if there are any changes in the impression.
	   public void verifyFourthCommonQuestionTextPositiveNegativeFlowAboutContent(String text)
		  {
			  textVerification(fourth_question_positive_negative_flow, text);
		  }
	   
	   /*Verification answer of fourth question of positive and negative flow: Please tell us what you felt about the taste and aroma, and if there are any changes in the impression.
	    * 味や香りについて感じたことや、印象の変化があればその理由を教えてください。
	    */
	   public void validAnswerFourthQuestionPositiveNegativeFlowOfAboutContent(String text)
		  {
			  enterValueIntoTextField(find_chat_text_field, text);
		  }
	   //Verification click send button after entering answer of fourth question of positive negative flow
	   public void clickSendButtonAfterEnteringAnswerFourthQuestionPositiveNegativeFlow()
		  {
			  clickSendButtonForTextSending(1);
		  }
   }
