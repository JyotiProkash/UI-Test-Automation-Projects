package org.automation.selenium.browser;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.automation.selenium.browser.remote.RemoteConfig;
import org.automation.utils.common.PropertyUtil;
import org.automation.utils.tracking.error.ExceptionManager;
import org.automation.utils.tracking.error.TestError;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
//import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Browser {


    //todo => need to read from property
	public static final int defaultTimeout=50;
    public static final long DEFAULT_WAIT_4_PAGE = 30;
    public static final long DEFAULT_WAIT_4_ELEMENT = 10;
    //private static RemoteWebDriver aRemoteBrowser=null;

    private static WebDriver driver = null;
    
    /*public static WebDriver getInstance() throws IOException{
        if(driver==null){
       
                    // todo , get this capability config from property
         	
        	File chromedriver = new File(getChromePath());
            PropertyUtil.setSysProperty("webdriver.chrome.driver", chromedriver.getAbsolutePath());
        	driver=new RemoteWebDriver(new URL(RemoteConfig.firefox_URL), CapabilityFactory.getCapability(PropertyUtil.getProperty("browser.properties", "selenium.remote.browser")));
        	//driver = new BrowserFactory().getARemoteBrowser();
            initiDriver();
        }
        return driver;
    }*/
    public static WebDriver getInstance(){
        if(driver==null){
            driver = new BrowserFactory().getABrowser();
            initiDriver();
        }
        return driver;
    }
    public static WebDriver getFreshInstance(){
        close();
        return getInstance();
    }
    private Browser(){}

    public static void close(){

        try {
        	driver.close();
        }catch (Exception e){
        	driver.quit();
        }
    }

    public static void closeAllChild(String parentHandle){
        Set<String> windows =   driver.getWindowHandles();
        windows.remove(parentHandle);
        for(String s : windows){
            driver.switchTo().window(s);
            close();
        }
    }
    /**
     * Size of screen
     * Timeout
     * All waiting
     * storing in session manager for re using
     */
    private static void initiDriver(){
		makeFullScreen();
		setDefaultTimeout();
        setImplicitWait(DEFAULT_WAIT_4_PAGE);
        setJSTimeOut(5);
        new WebDriverWait(driver,DEFAULT_WAIT_4_ELEMENT);
    }
    public static void resetImplicitWait(){
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
    public static void setImplicitWait(long newWaittime_InSeconds) {
        nullifyImplicitWait();
        driver.manage().timeouts().implicitlyWait(newWaittime_InSeconds, TimeUnit.SECONDS);
    }
    public static void nullifyImplicitWait() {
        driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
    }

    public static JavascriptExecutor getJSexcutor(){
        return (JavascriptExecutor)driver;
    }
    public static void setJSTimeOut(long sec){
        driver.manage().timeouts().setScriptTimeout(sec,TimeUnit.SECONDS);
    }
    public static WebDriverWait setWebDriverWait(long sec){
        WebDriverWait wait ;
        if(DEFAULT_WAIT_4_ELEMENT<sec){
            wait =  new WebDriverWait(driver, sec);
        }else
        {
            wait = new WebDriverWait(driver,DEFAULT_WAIT_4_ELEMENT);
        }
        return wait;
    }
    public static void pause(int sec){
        try {
            Thread.sleep((long)sec*1000);
        } catch (InterruptedException e) {
            ExceptionManager.performDefaultAction("Pause fail",e, new TestError());
        }
    }
    
	public static void setDefaultTimeout() {
		// TODO Auto-generated method stub
		driver.manage().timeouts().implicitlyWait(defaultTimeout, TimeUnit.SECONDS);
		
	}

	private static void makeFullScreen() {
		// TODO Auto-generated method stub
		driver.manage().window().maximize();
		
	}

}
