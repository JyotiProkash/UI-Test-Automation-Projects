package targetprofilestructure;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import pagebase.BasePage;

/**
 * created by Jyoti 27/09/2019
 */

public class ChuhiQuestionType extends BasePage
   {
	 WebDriver driver;  
	 public ChuhiQuestionType(WebDriver driver) 
	    {
		  this.driver=driver;
	    }
	 
	 //Can chu_hi type question
	 @FindBy(xpath="//div[contains(text(), '普段、一番良くお飲みになる缶チューハイのタイプを教えてください。')]")
	 private WebElement chu_hi_question_type_text;
	 
	 //Chu_hi question type text verification
	 public void chuHiQuestionText(String text) 
	    {
		    textVerification(chu_hi_question_type_text, text);
	    }
	 
	 //Find out drop-down box   
	 @FindBy(css="select.ng-valid")	 
	 private WebElement selectDropDownItem;
	 
	 //Select any item from drop down 
	 public void selectItemDropDown(String str) throws InterruptedException
	    {
	        Select dropdown = new Select(selectDropDownItem);
	        dropdown.selectByVisibleText(str);
	    }
	 
	 //Click send button after selecting Chu_hi type
	 //Send button index for emoji 0
	 //Send button index for chu_hi type 1
	 
	 public void clickSendButtonAfterSelectingChuhiType()
	    {
		   clickSendButtonForTextSending(1);
	    }
	 
   }
