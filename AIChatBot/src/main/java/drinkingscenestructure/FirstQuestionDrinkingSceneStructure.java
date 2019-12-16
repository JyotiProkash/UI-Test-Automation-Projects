package drinkingscenestructure;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pagebase.BasePage;

/**
 * created by Jyoti 23/10/2019
 */

public class FirstQuestionDrinkingSceneStructure extends BasePage
   {
	   WebDriver driver;  
	   
	   public FirstQuestionDrinkingSceneStructure(WebDriver driver) 
	      {
		    this.driver=driver;
	      }
	   
	   /*Find out first drinking scene question: "When did you drink the chu-hi you just drank?" 
		* 今お飲み頂いたチューハイは、どんな時に飲みましたか？
		*/
	   @FindBy(xpath="//div[contains(text(), '今お飲み頂いたチューハイは、どんな時に飲みましたか？')]")
	   private WebElement first_question_drinking_scene_structure;
		  
	   /*Verification first drinking scene question text: "When did you drink the chu-hi you just drank?"
		* 今お飲み頂いたチューハイは、どんな時に飲みましたか？
		*/
	   public void verifyFirstDrinkingSceneQuestionTextAfterEndingAboutContentStructure(String text)
		  {
			  textVerification(first_question_drinking_scene_structure, text);
		  }
	   
	   /*Verification answer of first question of Drinking Scene structure: "When did you drink the chu-hi you just drank?"
	    * 今お飲み頂いたチューハイは、どんな時に飲みましたか？
	    */
	   public void validAnswerFirstDrinkingSceneQuestion(String text)
		  {
			  enterValueIntoTextField(find_chat_text_field, text);
		  }
	   //Verification click send button after entering answer of first drinking scene question
	   public void clickSendButtonAfterEnteringAnswerFirstDrinkingSceneQuestion()
		  {
			  clickSendButtonForTextSending(1);
		  }
   }
