package aboutcontentstructure;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pagebase.BasePage;

/**
 * created by Jyoti 10/10/2019
 */

public class FirstCommonQuestionPositiveNegativeFlow extends BasePage
   {
	   public WebDriver driver;
	   
	   public FirstCommonQuestionPositiveNegativeFlow(WebDriver driver) 
	      {
		     this.driver=driver;
	      }
	   
	   /*Find out first part of first common question positive and negative flow: Then, please tell me about the impression of the second mouthful.
	    * では２口目、飲んでいただき、その印象について教えてください。
	    */
	   @FindBy(xpath="//div[contains(text(), 'では２口目、飲んでいただき、その印象について教えてください。')]")
	   private WebElement first_text_first_question_positive_negative_flow;
			  
	   //Verification first part of first common question positive and negative flow: Then, please tell me about the impression of the second mouthful.
	   public void verifyFirstTextFirstCommonQuestionPositiveNegativeFlowAboutContent(String text)
		  {
			  textVerification(first_text_first_question_positive_negative_flow, text);
		  }
	   
	   /*Find out second part of first common question positive and negative flow: If there is no change, please give the same answer as before.
	    * 変化なしの場合は先程と同様の回答お願いします。
	    */
	   //@FindBy(xpath="//div[contains(text(), '変化なしの場合は先程と同様の回答お願いします。')]")
	   //private WebElement second_text_first_question_positive_negative_flow;
			  
	   //Verification second part of first common question positive and negative flow: If there is no change, please give the same answer as before.
	   public void verifySecondTextFirstCommonQuestionPositiveNegativeFlowAboutContent(String text)
		  {
		       WebElement element_second_text=find_second_text_selection_positive_negative_flow.get(0);
		       textVerification(element_second_text, text);
		  }
	   
	   //Find out rating slider of second Impression 
	   @FindBy(xpath="//div[@class='mat-slider-ticks-container']//following::div[@class='mat-slider-ticks']") 
	   private List<WebElement> findSliderSecondImpression;
			 
	   //Strength Impression  ratings selection from slider
	   public void secondImpressionRatingsSelectionFromSlider(int rating)
		  {
	          WebElement strength_element=findSliderSecondImpression.get(2);
		      selectRatingsFromSlider(driver, strength_element, rating);
	                   
	      }
	   
	   //Click send button after selecting second impression
	   public void clickSendButtonSecondImpressionRatingsSelection()
		  {
			  find_All_Send_button.get(4).click();
		  }
   }
