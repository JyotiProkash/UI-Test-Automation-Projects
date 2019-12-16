package aboutcontentstructure;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pagebase.BasePage;

/**
 * created by Jyoti 12/10/2019
 */

public class SecondQuestionPositiveFlow extends BasePage
   {
	   WebDriver driver;
    
	   public SecondQuestionPositiveFlow(WebDriver driver) 
	      {
		    this.driver=driver;
	      }
	   
	   /*Find out second question for positive flow: How is it "keyword"
	    *"Keyword"の程度はどうですか？
	    */
	   @FindBy(xpath="//div[contains(text(), 'の程度はどうですか？')]")
	   private WebElement second_question_text_positive_flow;

	   /*Verification second question text for positive flow
	    * "Keyword"の程度はどうですか？
	    */
	   public void verifySecondQuestionPositiveFlowOfAboutContent(String keyword_text,String sub_text)
	      {
		      textVerificationDynamic(second_question_text_positive_flow, keyword_text, sub_text);
	      }
	   
	   //Find out rating slider of strength Impression 
	   @FindBy(xpath="//div[@class='mat-slider-ticks-container']//following::div[@class='mat-slider-ticks']") 
	   private List<WebElement> findSliderStrengthImpression;
			 
	   //Strength Impression  ratings selection from slider
	   public void strengthImpressionRatingsSelectionFromSlider(int rating)
		  {
	          WebElement strength_element=findSliderStrengthImpression.get(1);
		      selectRatingsFromSlider(driver, strength_element, rating);
	                   
	      }
	   
	   //Click send button after selecting strength impression
	   public void clickSendButtonStrengthImpressionRatingsSelection()
		  {
			  find_All_Send_button.get(3).click();
		  }
   }
