package loginlogout;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import pagebase.BasePage;

/**
 * created by Jyoti 15/09/2019
 */

public class LoginPage extends BasePage
  {  
	WebDriver driver;  
	public LoginPage(WebDriver driver) 
	    {
		  this.driver=driver;
	    }
	  
	  @FindBy(css="input#username")
	  @CacheLookup
	  private WebElement userName;
	  
	  @FindBy(css="input#password")
	  @CacheLookup
	  private WebElement passWord;
	  
	  @FindBy(css="button#submit")
	  @CacheLookup
	  private WebElement submitLogin;
	  
	  public void LoginToApplication(String name, String pass) throws InterruptedException 
	  {
		  clearTextField(userName);
		  enterValueIntoTextField(userName, name);
		  
		  clearTextField(passWord);
		  enterValueIntoTextField(passWord, pass);
		  
		  clickButton(submitLogin);
		  //driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	  }
  }
