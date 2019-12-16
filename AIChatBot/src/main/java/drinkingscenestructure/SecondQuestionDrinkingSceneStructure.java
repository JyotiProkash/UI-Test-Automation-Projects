package drinkingscenestructure;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pagebase.BasePage;

/**
 * created by Jyoti 23/10/2019
 */

public class SecondQuestionDrinkingSceneStructure extends BasePage
   {
	   WebDriver driver;  
	   
	   public SecondQuestionDrinkingSceneStructure(WebDriver driver) 
	      {
		    this.driver=driver;
	      }
	   
	   /*Find out second drinking scene question: "When do you want to drink what you just drank?" 
		* 今お飲みになっていただいたものは、どんな時に飲みたいですか？
		*/
	   @FindBy(xpath="//div[contains(text(), '今お飲みになっていただいたものは、どんな時に飲みたいですか？')]")
	   private WebElement second_question_drinking_scene_structure;
		  
	   /*Verification second drinking scene question text: "When do you want to drink what you just drank?"
		*今お飲みになっていただいたものは、どんな時に飲みたいですか？
		*/
	   public void verifySecondDrinkingSceneQuestionText(String text)
		  {
			  textVerification(second_question_drinking_scene_structure, text);
		  }
	   
	   /*Verification answer of second question of Drinking Scene structure: "When do you want to drink what you just drank?"
	    * 今お飲みになっていただいたものは、どんな時に飲みたいですか？
	    */
	   public void validAnswerSecondDrinkingSceneQuestion(String text)
		  {
			  enterValueIntoTextField(find_chat_text_field, text);
		  }
	   //Verification click send button after entering answer of second drinking scene question
	   public void clickSendButtonAfterEnteringAnswerSecondDrinkingSceneQuestion()
		  {
			  clickSendButtonForTextSending(1);
		  }
   }
