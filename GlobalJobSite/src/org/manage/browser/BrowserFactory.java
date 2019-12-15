package org.manage.browser;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;
import util.PropertyReader;
import util.PropertyUtil;

import com.opera.core.systems.OperaDriver;

public class BrowserFactory {

	//private String nameOfBrowser=new PropertyReader().getProperty(browser.properties, selenium.browser);
	private static WebDriver aBrowser;
	private String nameOfBrowser2="ie";
	private String nameOfBrowser1; 
	private static String nameOfBrowser=getTheProperties();
	private static DesiredCapabilities capabilities=null;
	//private static String internalRemoteDriverConfig="remote-firefox";
	private static String internalRemoteDriverConfig = "node1.firefox.1920x1080";
	
	//public static WebDriver getBrowserInstance(String name) {
	public static WebDriver getABrowser() {
		// TODO Auto-generated method stub
		if(nameOfBrowser=="firefox"){
			aBrowser=new FirefoxDriver();
		}
		
		else if(nameOfBrowser=="edge"){
			aBrowser=new EdgeDriver();
		}
		else if(nameOfBrowser=="ie"){
			/*File IEDriver = new File("F:\\Testing_Material\\SeleniumTest\\IEDriverServer_x64_2.53.0\\IEDriverServer.exe");
			System.setProperty("webdriver.ie.driver", IEDriver.getAbsolutePath());*/
			File iedriver= new File(GetIePath());
			System.setProperty("webdriver.ie.driver", iedriver.getAbsolutePath());
			aBrowser=new InternetExplorerDriver();
		}
		    
		else if(nameOfBrowser=="chrome")
			aBrowser=new ChromeDriver();
		
		else if(nameOfBrowser=="safari")
			aBrowser=new SafariDriver();
		
		else if(nameOfBrowser=="opera")
			aBrowser= new OperaDriver();
		else if(nameOfBrowser=="browserstack"){
			try{
				return new RemoteWebDriver(new URL(RemoteConfig.browserstack_URL), DesiredcapabilityFactory.getCapability("browserstack") );
			}
			
			catch (MalformedURLException e) {
                e.printStackTrace();
            }
		}
		
		else if(nameOfBrowser=="saucelab"){
			try{
				return new RemoteWebDriver(new URL(RemoteConfig.saucelabs_URL),DesiredcapabilityFactory.getCapability("saucelab"));
			}
			catch(MalformedURLException e){
				e.printStackTrace();
			}
		}
		
		else if(nameOfBrowser=="appium-ios"){
			try{
				aBrowser=new IOSDriver(new URL(RemoteConfig.appium_URL),DesiredcapabilityFactory.getCapability("appium-ios"));
			}
			catch(MalformedURLException e){
				e.printStackTrace();
			}
		}
		
		else if(nameOfBrowser=="appium-android"){
			try{
				aBrowser=new AndroidDriver(new URL(RemoteConfig.appium_URL),DesiredcapabilityFactory.getCapability("appium-android"));
			}
			catch(MalformedURLException e){
				e.printStackTrace();
			}
		}
		
		else{
			try{
				return new RemoteWebDriver(new URL(RemoteConfig.inhouse.hub_URL),DesiredcapabilityFactory.getInhouseCapabilities(internalRemoteDriverConfig)));
			}
			catch(MalformedURLException e){
				e.printStackTrace();
			}
		}
			
		return aBrowser;	
	}
	
	
	private static String getTheProperties() {
		// TODO Auto-generated method stub
		try{
			return PropertyUtil.getProperty("browser.properties", "selenium.browser");
		}
		catch(IOException e){
			e.printStackTrace();
		}
		return getTheProperties();
	}
	
	private static String GetIePath(){
        try {
            return PropertyUtil.getProperty("browser.properties","selenium.browser.ie.path");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

}
