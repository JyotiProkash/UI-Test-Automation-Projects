package aboutcontentstructure;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pagebase.BasePage;

public class AboutContentStructureEnd extends BasePage
   {
	  WebDriver driver;  
	  public AboutContentStructureEnd(WebDriver driver) 
	     {
		   this.driver=driver;
	     }
	  
	  //Find out "Thank you very much." text
	  @FindBy(xpath="//div[@class='ng-tns-c6-0']//following::div[contains(text(), 'ありがとうございます。')]")
	  private List<WebElement> about_content_structure_end_thank_you_text;
	  
	  //Verification "Thank you very much." text after ending About Content structure
	  public void verifyThanksMessageTextAfterEndingAboutContentStructure(String text)
	     {
		      WebElement element_greetings_message=about_content_structure_end_thank_you_text.get(2);
		      textVerification(element_greetings_message, text);
	     }
	  
	  //Verification average response time message text
	  public void verifyAverageResponseTimeMessageTextAfterEndingAboutContentStructure()
	     {
		      isTextDisplay(each_question_structure_end_average_response_time_message.get(1));
	     }
	
   }
