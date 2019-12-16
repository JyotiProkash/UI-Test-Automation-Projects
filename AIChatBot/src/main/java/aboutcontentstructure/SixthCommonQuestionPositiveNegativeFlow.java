package aboutcontentstructure;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pagebase.BasePage;

/**
 * created by Jyoti 17/10/2019
 */

public class SixthCommonQuestionPositiveNegativeFlow extends BasePage
   {
	   public WebDriver driver;
	   
	   public SixthCommonQuestionPositiveNegativeFlow(WebDriver driver) 
	      {
		     this.driver=driver;
	      }
	   
	   /*Find out sixth common question for positive and negative flow : Is there anything that you think will be even more delicious?
	    *こうしたらもっと美味しくなると思う点はありますか？
	    */
	   @FindBy(xpath="//div[contains(text(), 'こうしたらもっと美味しくなると思う点はありますか？')]")
	   private WebElement sixth_question_positive_negative_flow;
	   
	   //Verification sixth common question text of positive and negative flow: Is there anything that you think will be even more delicious?
	   public void verifySixthCommonQuestionTextPositiveNegativeFlowAboutContent(String text)
		  {
			  textVerification(sixth_question_positive_negative_flow, text);
		  }
	   
	   /*Verification answer of sixth question of positive and negative flow: sixth_question_positive_negative_flow
	    * こうしたらもっと美味しくなると思う点はありますか？
	    */
	   public void validAnswerSixthQuestionPositiveNegativeFlowOfAboutContent(String text)
		  {
			  enterValueIntoTextField(find_chat_text_field, text);
		  }
	   //Verification click send button after entering answer of sixth question of positive negative flow
	   public void clickSendButtonAfterEnteringAnswerSixthQuestionPositiveNegativeFlow()
		  {
			  clickSendButtonForTextSending(1);
		  }
   }
