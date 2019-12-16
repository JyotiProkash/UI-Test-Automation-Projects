package homepage;

import org.openqa.selenium.WebDriver;
import pagebase.BasePage;

/**
 * Created by Jyoti 17/09/2019
 */

public class OpenChatWindow extends BasePage
  {
	WebDriver driver;
	
	public OpenChatWindow(WebDriver driver) 
	   {
		 this.driver=driver;
	   }
	 /*
	 //Find out title of Chat Window
	 @FindBy(xpath="//div[contains(text(), '3Aプロジェクトボット')]")
	 @CacheLookup
	 WebElement titleChatWindow;
	 
	 //Title verification of Chat Window 
	 public void verificationChatWindowTitle(String text) 
	    {
		   textVerification(titleChatWindow, text);
	    }
	 */
	/*
	 //Find out Start button in Chat Window
	 @FindBy(xpath="//span[contains(text(), 'スタート')]")
	 @CacheLookup
	 WebElement startButtonChatWindow;
	 
	 //Click Start button of Chat window
	 public void clickStartButtonChatWindow()
	    {
		   startButtonChatWindow.click();
	    }
	    */
	 
	/*
	 //Find out Age question text
	 @FindBy(xpath="//div[contains(text(), '年令を教えてください。')]")
	 @CacheLookup
	 WebElement ageQuestion;
	 
	 //Age question text verification
	 public void ageQuestionText(String text) 
	    {
			textVerification(ageQuestion, text);
	    }
	 
	 //Find out age slider
	 @FindBy(css="div.mat-slider-ticks-container")
	 WebElement findSlider;
	 
	 //Age selection from slider
	 public void ageSelectionFromSlider(int age)
	    {
		 
		    Point pt = findSlider.getLocation();
		    int NumberX=pt.getX();
		    int NumberY=pt.getY();
		    //System.out.println(NumberX);
		    //System.out.println(NumberY);
		    float age1=(float) 0.0;
		    if(age==20)
		    age1=(float) 0.0;
		    else
		    {
		    	for(int i=age; i>20;i--)
		    	{
		    	   age1=(float) (age1+4.83);
		    	}
		    }
		    Actions act= new Actions(driver);
		    act.moveByOffset((int) (NumberX+age1), NumberY).click().build().perform();
	    }
	    */
	/*
	 //Find out send button for age and gender
	 @FindAll({
	 @FindBy(css="div.btn-send"),
	 @FindBy(css="div.btn-send")
	 })
     private List<WebElement> find_All_Send_button;
	 */
	/* 
	//Click send button after age selection
	 public void clickSendButtonAgeSelection()
	    {
		    find_All_Send_button.get(0).click();
	    }
	 */
	 /*
	 //Find out gender question text
	 @FindBy(xpath="//div[contains(text(), '性別を教えてください。')]")
	 WebElement find_gender_question_text;
	 
	//Gender question text verification
	 public void genderQuestionText(String text) 
	   {
	        textVerification(find_gender_question_text, text);
	   }
	 
	//Find out gender female
	 @FindBy(css="span.switch-label-unchecked")
	 WebElement find_gender_female;

	 //Find out gender male
	 @FindBy(css="span.switch-label-checked")
	 WebElement find_gender_male;
	 
	 //Gender selection code
	 public void selectGender(String gender)
	   {  
	      if(gender.equalsIgnoreCase("Male"))
	        {
	    	   JavascriptExecutor js = (JavascriptExecutor)driver;
	    	   js.executeScript("arguments[0].click();", find_gender_female);
	        } 
	   }
	 
	//Click send button after gender selection
	public void clickSendButtonGenderSelection()
	   { 
		  find_All_Send_button.get(1).click();
	   }
	*/
	
	/*
	//Can chu_hi type question
	@FindBy(xpath="//div[contains(text(), '普段、一番良くお飲みになる缶チューハイのタイプを教えてください。')]")
	WebElement chu_hi_question_type_text;
	
	//Chu_hi question type text verification
		 public void chuHiQuestionText(String text) 
		   {
		        textVerification(chu_hi_question_type_text, text);
		   }
		   */
	
	 
  }
