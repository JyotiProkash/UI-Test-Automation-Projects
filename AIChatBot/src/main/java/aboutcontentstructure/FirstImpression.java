package aboutcontentstructure;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pagebase.BasePage;

/**
 * created by Jyoti 07/10/2019
 */

public class FirstImpression extends BasePage
   {
	  public WebDriver driver;  
	  public FirstImpression(WebDriver driver) 
	     {
		   this.driver=driver;
	     }
	  
	  //Find out first impression question text for About Content structure
	  @FindBy(xpath="//div[contains(text(), 'まずは、1口お飲みいただき、その印象について教えてください。')]")
	  private WebElement first_Impression_question_text;
	  
	  //Verification "First of all, have a drink and tell us about your impressions." question text
	  public void verifyFirstImpressionQuestionTextAboutContent(String text)
	     {
		      textVerification(first_Impression_question_text, text);
	     }
	  
	  //Find out First Impression ratings slider
	  @FindBy(xpath="//div[@class='mat-slider-ticks-container']//following::div[@class='mat-slider-ticks']") 
	  private WebElement findSliderFirstImpression;
		 
	  //First Impression ratings selection from slider
	  public void firstImpressionRatingsSelectionFromSlider(int rating)
		 {
             selectRatingsFromSlider(driver, findSliderFirstImpression, rating);
                   
         }
	  
	  /*public void selectRatingsFromSlider(int rating) throws InterruptedException
         {
		      Point pt = findSliderFirstImpression.getLocation();
		      int NumberX=pt.getX();
		      int NumberY=pt.getY();
		      System.out.println(findSliderFirstImpression.getSize().width);
		      System.out.println(NumberX);
		      System.out.println(NumberY);
		      //WebElement webElement=findSliderFirstImpression.get(1);
		      Actions move = new Actions(driver);
	          Action action = (Action) move.dragAndDropBy(findSliderFirstImpression, - 144, 0).click().build();
	          action.perform();
	          driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		      
		      Map<Integer, Integer> map=new HashMap<Integer, Integer>();

	          //Store key value into Hash map
	          for(int i=1; i<=10;i++)
	            {
	              map.put(1,15);
	              map.put(2, 47);
	              map.put(3, 79);
	              map.put(4, 111);
	              map.put(5, 143);
	              map.put(6, 175);
	              map.put(7, 207);
	              map.put(8, 239);
	              map.put(9, 270);
	              map.put(10, 287);
	            }

	          //Extract value from hash map and look for value which is expected
	          Actions act= new Actions(driver);
	          for(Integer key : map.keySet())
	            {
	               if(rating==key)
	                 {
	       	           
	            	   driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	       	           act.moveByOffset(map.get(key) , 0).click().build().perform();
	       		       //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	                   //Thread.sleep(2000);
	                   break;
	                 }
	             }
	        
	        
   	     }*/
      
	  //Click send button after selecting first impression
	  public void clickSendButtonFirstImpressionRatingsSelection()
		 {
		     find_All_Send_button.get(2).click();
		 }
	  
	  
   }
