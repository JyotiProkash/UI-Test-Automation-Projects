package aboutcontentstructure;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pagebase.BasePage;

/**
 * created by Jyoti 12/10/2019
 */

public class SecondCommonQuestionPositiveNegativeFlow extends BasePage
   {
	   public WebDriver driver;
	   
	   public SecondCommonQuestionPositiveNegativeFlow(WebDriver driver) 
	      {
		     this.driver=driver;
	      }
	   
	   /*Find out first part of second common question positive and negative flow: Then please drink about half and tell us about your impression.
	    * では半分程度飲む進めていただき、その印象について教えてください
	    */
	   @FindBy(xpath="//div[contains(text(), 'では半分程度飲む進めていただき、その印象について教えてください。')]")
	   private WebElement first_text_second_question_positive_negative_flow;
			  
	   //Verification second part of second common question positive and negative flow: Then please drink about half and tell us about your impression.
	   public void verifyFirstTextSecondCommonQuestionPositiveNegativeFlowAboutContent(String text)
		  {
			  textVerification(first_text_second_question_positive_negative_flow, text);
		  }
	   
	   /*Find out second part of  second common question positive and negative flow: If there is no change, please give the same answer as before.
	    * 変化なしの場合は先程と同様の回答お願いします
	    */
	   //@FindBy(xpath="//div[contains(text(), '変化なしの場合は先程と同様の回答お願いします。')]")
	   //private WebElement second_text_second_question_positive_negative_flow;
			  
	   //Verification second part of second common question positive and negative flow: If there is no change, please give the same answer as before.
	   public void verifySecondTextSecondCommonQuestionPositiveNegativeFlowAboutContent(String text)
		  {
		       WebElement element_second_text=find_second_text_selection_positive_negative_flow.get(1);
		       textVerification(element_second_text, text);
		  }
	   
	   //Find out rating slider of half bite Impression 
	   @FindBy(xpath="//div[@class='mat-slider-ticks-container']//following::div[@class='mat-slider-ticks']") 
	   private List<WebElement> findSliderHalfBiteImpression;
			 
	   //Half Bite Impression ratings selection from slider
	   public void halfBiteImpressionRatingsSelectionFromSlider(int rating)
		  {
	          WebElement strength_element=findSliderHalfBiteImpression.get(3);
		      selectRatingsFromSlider(driver, strength_element, rating);
	                   
	      }
	   
	   //Click send button after selecting half bite impression
	   public void clickSendButtonHalfBiteImpressionRatingsSelection()
		  {
			  find_All_Send_button.get(5).click();
		  }
   }
