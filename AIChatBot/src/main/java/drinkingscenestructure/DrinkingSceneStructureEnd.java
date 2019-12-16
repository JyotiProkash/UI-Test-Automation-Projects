package drinkingscenestructure;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pagebase.BasePage;

/**
 * created by Jyoti 23/10/2019
 */

public class DrinkingSceneStructureEnd extends BasePage
   {
	   WebDriver driver;  
	   
	   public DrinkingSceneStructureEnd(WebDriver driver) 
	      {
		      this.driver=driver;
	      }
	   
	   //Verification average response time message text after ending Drinking Scene Structure
	   public void verifyAverageResponseTimeMessageTextAfterEndingDrinkingSceneStructure()
		  {
			  isTextDisplay(each_question_structure_end_average_response_time_message.get(2));
		  }
	   
	   /*Find out "Thank you for your cooperation in the survey." text
	    * アンケートにご協力いただきありがとうございました。
	    */
	   @FindBy(xpath="//div[contains(text(), 'アンケートにご協力いただきありがとうございました。')]")
	   private WebElement drinking_scene_structure_end_thank_you_text;
		  
	   //Verification "Thank you for your cooperation in the survey." text after ending Drinking Scene structure
	   public void verifyThanksMessageTextAfterEndingDrinkingSceneStructure(String text)
		  {
			 textVerification(drinking_scene_structure_end_thank_you_text, text);
		  }
	   
	   /*Find out "Japanese is difficult." text
	    * 日本語は難しいですね。
	    */
	   @FindBy(xpath="//div[contains(text(), '日本語は難しいですね。')]")
	   private WebElement drinking_scene_structure_end_japanese_difficult_text;
		  
	   //Verification "Japanese is difficult." text after ending Drinking Scene structure
	   public void verifyJapaneseDifficultTextAfterEndingDrinkingSceneStructure(String text)
		  {
			 textVerification(drinking_scene_structure_end_japanese_difficult_text, text);
		  }
	   
	   /*Find out "I would like to do my best to develop more delicious products and study Japanese by referring to the opinions I have received." text
	    * 頂いたご意見を参考に、もっとおいしい商品開発と日本語の勉強に全力で取り組んでいきたいと思います。
	    */
	   @FindBy(xpath="//div[contains(text(), '頂いたご意見を参考に、もっとおいしい商品開発と日本語の勉強に全力で取り組んでいきたいと思います。')]")
	   private WebElement drinking_scene_structure_end_third_text;
		  
	   //Verification third text "I would like to do my best to develop more delicious products and study Japanese by referring to the opinions I have received." text after ending Drinking Scene structure
	   public void verifyThirdTextAfterEndingDrinkingSceneStructure(String text)
		  {
			 textVerification(drinking_scene_structure_end_third_text, text);
		  }
	 
	   /*Find out pop-up title "Do you want to start again?" after ending Drinking Scene structure
	    * もう一度開始しますか？ 
	    */
	   @FindBy(xpath="//div[contains(text(), 'もう一度開始しますか？   ')]")
	   private WebElement drinking_scene_structure_end_popup_title_text;
	   
	   //Verification pop-up title text "Do you want to start again?" after ending Drinking Scene structure
	   public void verifyPopupTitleTextAfterEndingDrinkingSceneStructure(String text)
		  {
			 textVerification(drinking_scene_structure_end_popup_title_text, text);
		  }
		  
	   
   }
