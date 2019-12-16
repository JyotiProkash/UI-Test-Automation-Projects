package targetprofilestructure;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import pagebase.BasePage;

/**
 * created by Jyoti 23/09/2019
 */

public class AgeSelection extends BasePage
   {
	 WebDriver driver;  
	 public AgeSelection(WebDriver driver) 
	    {
		  this.driver=driver;
	    }
	     //Find out Age question text
		 @FindBy(xpath="//div[contains(text(), '年令を教えてください。')]")
		 @CacheLookup
		 private WebElement ageQuestion;
		 
         //Age question text verification
		 public void ageQuestionText(String text) 
		    {
				textVerification(ageQuestion, text);
		    }
		 
		 //Find out age slider
		 @FindBy(css="div.mat-slider-ticks-container")
		 private WebElement findSlider;
		 
		 //Age selection from slider
		 public void ageSelectionFromSlider(int age)
		    {
			 
			    Point pt = findSlider.getLocation();
			    int NumberX=pt.getX();
			    int NumberY=pt.getY();
			    //System.out.println(NumberX);
			    //System.out.println(NumberY);
			    //System.out.println(findSlider.getSize().width);
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
		 
		 //Click send button after age selection
		  public void clickSendButtonAgeSelection()
		     {
			    find_All_Send_button.get(0).click();
		     }
   } 
