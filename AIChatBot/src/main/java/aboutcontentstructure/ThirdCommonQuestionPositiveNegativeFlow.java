package aboutcontentstructure;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pagebase.BasePage;

/**
 * created by Jyoti 14/10/2019
 */

public class ThirdCommonQuestionPositiveNegativeFlow extends BasePage
   {
	   public WebDriver driver;
	   
	   public ThirdCommonQuestionPositiveNegativeFlow(WebDriver driver) 
	      {
		     this.driver=driver;
	      }
	   
	   /*Find out first part of third common question positive and negative flow: Please continue to drink until the end and tell us about the impression.
	    * 最後まで飲む進めていただき、その印象について教えてください。
	    */
	   @FindBy(xpath="//div[contains(text(), '最後まで飲む進めていただき、その印象について教えてください。')]")
	   private WebElement first_text_third_question_positive_negative_flow;
			  
	   //Verification first part of third common question positive and negative flow: Please continue to drink until the end and tell us about the impression.
	   public void verifyFirstTextThirdCommonQuestionPositiveNegativeFlowAboutContent(String text)
		  {
			  textVerification(first_text_third_question_positive_negative_flow, text);
		  }
	   
	   /*Find out second part of  third common question positive and negative flow: If there is no change, please give the same answer as before.
	    * 変化なしの場合は先程と同様の回答お願いします。
	    */
	   //@FindBy(xpath="//div[contains(text(), '変化なしの場合は先程と同様の回答お願いします。')]")
	   //private WebElement second_text_third_question_positive_negative_flow;
			  
	   //Verification second part of third common question positive and negative flow: If there is no change, please give the same answer as before.
	   public void verifySecondTextThirdCommonQuestionPositiveNegativeFlowAboutContent(String text)
		  {
			  WebElement element_second_text=find_second_text_selection_positive_negative_flow.get(2);
		      textVerification(element_second_text, text);
		  }
	   
	   //Find out rating slider of full bite Impression 
	   @FindBy(xpath="//div[@class='mat-slider-ticks-container']//following::div[@class='mat-slider-ticks']") 
	   private List<WebElement> findSliderFullBiteImpression;
			 
	   //Full Bite Impression ratings selection from slider
	   public void fullBiteImpressionRatingsSelectionFromSlider(int rating)
		  {
	          WebElement strength_element=findSliderFullBiteImpression.get(4);
		      selectRatingsFromSlider(driver, strength_element, rating);
	                   
	      }
	   
	   //Click send button after selecting full bite impression
	   public void clickSendButtonFullBiteImpressionRatingsSelection()
		  {
			  find_All_Send_button.get(6).click();
		  }
   }
