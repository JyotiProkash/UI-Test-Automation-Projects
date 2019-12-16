package aboutcontentstructure;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pagebase.BasePage;

/**
 * created by Jyoti 17/10/2019
 */

public class FifthCommonQuestionPositiveNegativeFlow extends BasePage
   {
	   public WebDriver driver;
	   
	   public FifthCommonQuestionPositiveNegativeFlow(WebDriver driver) 
	      {
		     this.driver=driver;
	      }
	   
	   /*Find out fifth common question positive and negative flow: Do you want to drink this drink again?
	    * この飲料について、また飲みたいと思いますか？
	    */
	   @FindBy(xpath="//div[contains(text(), 'この飲料について、また飲みたいと思いますか？')]")
	   private WebElement fifth_question_positive_negative_flow;
			  
	   //Verification fifth common question positive and negative flow: Do you want to drink this drink again?
	   public void verifyFifthCommonQuestionTextPositiveNegativeFlowAboutContent(String text)
		  {
			  textVerification(fifth_question_positive_negative_flow, text);
		  }
	   
	   //Find out rating slider of second time drink Impression 
	   @FindBy(xpath="//div[@class='mat-slider-ticks-container']//following::div[@class='mat-slider-ticks']") 
	   private List<WebElement> findSliderSecondTimeDrinkImpression;
			 
	   //Second time drink Impression ratings selection from slider
	   public void secondTimeDrinkImpressionRatingsSelectionFromSlider(int rating)
		  {
	          WebElement strength_element=findSliderSecondTimeDrinkImpression.get(5);
		      selectRatingsFromSlider(driver, strength_element, rating);
	                   
	      }
	   
	   //Click send button after selecting second time drink impression
	   public void clickSendButtonSecondTimeDrinkImpressionRatingsSelection()
		  {
			  find_All_Send_button.get(7).click();
		  }
   }
