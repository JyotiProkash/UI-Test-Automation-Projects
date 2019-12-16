package pagebase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

/**
 * Created by Jyoti 20/09/2019
 */

public class BasePage 
   {
	     /*===============Find out chat text field=====================*/
	     @FindBy(css="textarea#chattextinput")
	     public WebElement find_chat_text_field; 
	     
	     /*==============Find out Average response time message" ==============*/
	     @FindBy(xpath="//div[starts-with(text(), '平均応答時間は:')]")
		 public List<WebElement> each_question_structure_end_average_response_time_message;
	    
	     /*============Find out send button for age and gender================*/
		 @FindAll({
		 @FindBy(css="div.btn-send"),
		 //@FindBy(css="div.btn-send")
		 })
	     public List<WebElement> find_All_Send_button;
		 
		 // Find out send button
		 @FindAll({
		 @FindBy(css="i.material-icons"),
		 //@FindBy(css="div.btn-send")
		 })
		 public List<WebElement> find_text_Send_button;
		 
		 /*============Clear text field==============*/
		 public void clearTextField(WebElement clear_field)
		    {
			   clear_field.clear();
		    }
		 
		 /*============Enter value into text field============*/ 
		 public void enterValueIntoTextField(WebElement text_field, String text_value)
		    {
			   text_field.sendKeys(text_value);
		    }
		 
		 /*============Click any type of button==============*/
		 public void clickButton(WebElement press_button)
		    {
			   press_button.click();
		    }
		 
		/*===============Click send button for text==============*/
		 public void clickSendButtonForTextSending(int text)
		    {
			 find_text_Send_button.get(text).click();
		    }
		 
	    /*===============Common method for static text verification================*/
	    public void textVerification(WebElement element, String text)
	        {
		       String expected_text=element.getText().toString();
			   String actual_text=text.trim();
			   Assert.assertEquals(actual_text, expected_text);
			   //return true;
			   
	        }
	    
	    /*===============Common method for dynamic text verification with one sub string================*/
	    public void textVerificationDynamic(WebElement element_dynamic, String keyword_text, String sub_text)
	        {
		       String expected_text=element_dynamic.getText().toString();
			   //String sub_string="についてもう少し詳しく教えてください。";
		       String actual_text=(keyword_text+sub_text).trim();
			   Assert.assertEquals(actual_text, expected_text);
			   //return true;
			   
	        }
	    
	    /*===============Common method for dynamic text verification with two sub string================*/
	    public void textVerificationDynamicTwoSubString(WebElement element_dynamic, String keyword_text, String first_sub_text, String last_sub_text)
	        {
		       String expected_text=element_dynamic.getText().toString();
			   //String sub_string="についてもう少し詳しく教えてください。";
		       String actual_text=(first_sub_text+keyword_text+last_sub_text).trim();
			   Assert.assertEquals(actual_text, expected_text);
			   //return true;
			   
	        }
	    /*===============Find out second text selection: 変化なしの場合は先程と同様の回答お願いします。 ================*/
	    @FindBy(xpath="//div[contains(text(), '変化なしの場合は先程と同様の回答お願いします。')]")
		public List<WebElement> find_second_text_selection_positive_negative_flow;
			   
	       
	    
	    /*===============Common method for text Display================*/
	    public Boolean isTextDisplay(WebElement text_display)
	        {
	    	   return text_display.isDisplayed();
	   
	        }
	    
	   /*===============Common method for pressing Keyboard Enter key===================*/
	    public void pressEnterKeyFromKeyboard()
	        {
	    	    find_chat_text_field.sendKeys(Keys.ENTER);
	        }
	 
	    /*=============Common method for selecting radio button items==============*/
	    public void selectRadioButtonItem(List<WebElement> radio_button, List<WebElement> radio_button_text, String actual_radio_text) throws InterruptedException
	        {
	    	   // Start the loop from first radio button to last radio button
               for(int i=0; i < radio_button.size() ; i++ )
                 {
                    //Select radio button that value is same what are looked for
                    if (radio_button.get(i).isSelected()==false && actual_radio_text.equals(radio_button_text.get(i).getText().toString()))
                      {
                    	radio_button.get(i).click();
                        break;
                      }
	              }    
           
          /*=============Alternative Common method for selecting radio button items==============*/  
          /*Map<WebElement, String> map=new HashMap<WebElement, String>();

          //Store key value into Hash map
          for(int i=0; i<radio_button.size();i++)
            {
              map.put(radio_button.get(i),radio_button_text.get(i).getText().toString());
            }

          //Extract value from hash map and look for value which is expected
          for(WebElement key : map.keySet())
            {
               if(key.isSelected()==false && actual_radio_text.equals(map.get(key)))
                 {
                   key.click();
                   Thread.sleep(2000);
                   break;
                 }
             }*/
               
          }
	    
	    /*=============Common method for Selecting ratings from slider==============*/
        public WebDriver selectRatingsFromSlider(WebDriver driver, WebElement find_Slider,int rating)
           {
        	  /*Point pt = find_Slider.getLocation();
		      int NumberX=pt.getX();
		      int NumberY=pt.getY();
		      System.out.println(find_Slider.getSize().width);
		      System.out.println(NumberX);
		      System.out.println(NumberY);*/
		      //WebElement webElement=findSliderFirstImpression.get(1);
		      Actions move = new Actions(driver);
	          Action action = (Action) move.dragAndDropBy(find_Slider, - 144, 0).click().build();
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
	          return driver;
        	
           }
   }
