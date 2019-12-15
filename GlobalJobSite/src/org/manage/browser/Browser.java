package org.manage.browser;
import java.util.concurrent.TimeUnit;

import org.manage.browser.BrowserFactory;
import org.openqa.selenium.WebDriver;

/***
 * Only used for browser behavior, quit etc 
 * @author User
 *
 */

public class Browser {
    
	/*private static WebDriver aDriver=new FirefoxDriver();
	private static WebDriver aDriver=null;
	public static final int defaultTimeout=50;*/
	
	/*private Browser(){
		aDriver=new FirefoxDriver();
	}*/
	
	public static final int defaultTimeout=50;
	public static int DEFAULT_WAIT_4_PAGE=30;
	public static int DEFAULT_WAIT_4_ELEMENT=10;
	private static WebDriver driver=null;
	
	public static WebDriver getInstance(){

    	/*String nodeUrl="http://192.168.1.103:4444/wd/hub";
    	DesiredCapabilities capability=DesiredCapabilities.firefox();
    	capability.setBrowserName("Firefox");
    	capability.setPlatform(Platform.WINDOWS);
    	aDriver=new RemoteWebDriver(new URL(nodeUrl), capability);*/
    	
		if(driver==null){
			driver= new BrowserFactory().getABrowser();
			initiDriver();
		}
			
		return driver;
	}
	private static void initiDriver() {
		// TODO Auto-generated method stub
		makeFullScreen();
		setDefaultTimeout();
		
	}
	
	public static void resetImplicitWait(){
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
	
	public static void setImplicitWait(int newWaittime_InSeconds) {
        nullifyImplicitWait();
        driver.manage().timeouts().implicitlyWait(newWaittime_InSeconds, TimeUnit.SECONDS);
    }
	
	public static void nullifyImplicitWait() {
        driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
    }

	public static void setDefaultTimeout() {
		// TODO Auto-generated method stub
		driver.manage().timeouts().implicitlyWait(defaultTimeout, TimeUnit.SECONDS);
		
	}

	private static void makeFullScreen() {
		// TODO Auto-generated method stub
		driver.manage().window().maximize();
		
	}
	
	public static void endtest(WebDriver aDriver) {
		aDriver.close();
	}
	
	private Browser(){}

}