package helper;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;

/**
 * created by 12/09/2019
 */

public class BrowserFactory
{
	public static WebDriver driver;
	// Starting a browser
	public static WebDriver startBrowser(String browserName, String url) 
	  {
		 if(browserName.equalsIgnoreCase("firefox")) 
		   {
			   WebDriverManager.firefoxdriver().setup();
		   	   driver=new FirefoxDriver();
		   }
		 
		 else if(browserName.equalsIgnoreCase("chrome")) 
		   {
			 //System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");

			   WebDriverManager.chromedriver().setup();
			   driver=new ChromeDriver();
		   }
		 
		 else if(browserName.equalsIgnoreCase("IE")) 
		   {
			   WebDriverManager.iedriver().setup();
		   	   driver=new InternetExplorerDriver();
		   }

		 else if(browserName.equalsIgnoreCase("Edge"))
		   {
			   WebDriverManager.edgedriver().setup();
			   driver=new EdgeDriver();
		   }

		 else if(browserName.equalsIgnoreCase("Opera"))
		   {
			   WebDriverManager.operadriver().setup();
			   driver=new OperaDriver();
		   }
		 
		 driver.manage().window().maximize();
		 //driver.manage().deleteAllCookies();
		 driver.get(url);
		 return driver;
	  }
	
	//Closing a browser
	public static void closeBrowser(WebDriver web_driver) 
	  {
		driver=web_driver;
		driver.quit();
		driver=null;
	  }
	
	//Implicit wait

}
