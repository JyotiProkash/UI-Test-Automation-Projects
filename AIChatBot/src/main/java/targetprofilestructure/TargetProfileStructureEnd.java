package targetprofilestructure;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pagebase.BasePage;

/**
 * created by Jyoti 05/10/2019
 */

public class TargetProfileStructureEnd extends BasePage
   {
	  WebDriver driver;  
	  public TargetProfileStructureEnd(WebDriver driver) 
	     {
		   this.driver=driver;
	     }
	  
	  //Find out "I understand that! Thank you very much." text
	  @FindBy(xpath="//div[contains(text(), 'よくわかりました！ありがとうございます。')]")
	  private WebElement target_profile_end_thank_you_text;
	  
	  // Find out "I'll ask you about your impressions after taking a sample." text
	  @FindBy(xpath="//div[contains(text(), 'これからサンプルを飲んでいただき、印象についてお伺いします。')]")
	  private WebElement sample_impression_text;
	  
	  //Find out first impression question text for About Content structure
	  /*
	  @FindBy(xpath="//div[contains(text(), 'まずは、1口お飲みいただき、その印象について教えてください。')]")
	  private WebElement first_Impression_question_text;*/
	  
	  //Verification "I understand that! Thank you very much." text
	  /*public void verifyThanksMessageTextAfterEndingTargetProfileStructure(String text)
	     {
		      textVerification(target_profile_end_thank_you_text, text);
	     }*/
	  
	  //Verification average response time message text
	  public void verifyAverageResponseTimeMessageTextAfterEndingTargetProfileStructure()
	     {
		      isTextDisplay(each_question_structure_end_average_response_time_message.get(0));
	     }
	  
	  //Verification "I'll ask you about your impressions after taking a sample." question text
	  public void verifySampleImpressionTextAfterEndingTargetProfileStructure(String text)
	     {
		      textVerification(sample_impression_text, text);
	     }
	  
	  //Verification "First of all, have a drink and tell us about your impressions." question text
	  /*public void verifyFirstImpressionQuestionTextAboutContent(String text)
	     {
		      textVerification(first_Impression_question_text, text);
	     }*/
	  
   }
