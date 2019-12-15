package org.automation.selenium.browser;

import java.io.IOException;

import org.automation.selenium.browser.remote.appium.AppiumCapabilities;
import org.automation.selenium.browser.remote.browserstack.BrowserStackCapabilities;
import org.automation.selenium.browser.remote.saucelab.SauceLabCapabilities;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;

public class CapabilityFactory {
    private static DesiredCapabilities capabilities;
    private CapabilityFactory(){}

    /**
     *
     * @param nameOfBrowser
     * @return
     * @throws IOException 
     */
    public static DesiredCapabilities getCapability(String nameOfBrowser) throws IOException{
        capabilities = new DesiredCapabilities();

        if(nameOfBrowser=="browserstack"){
            BrowserStackCapabilities.getCapabilities(capabilities,"win7.ff41.1024x768");
        }
        else if(nameOfBrowser=="saucelab"){
            SauceLabCapabilities.getCapabilities(capabilities,"win7.ff41.1024x768");
        }
        else if(nameOfBrowser=="appium-android"){
            AppiumCapabilities.getCapabilities(capabilities,"and41.htc1x.appium151.hybrid");
        }
        else if(nameOfBrowser=="appium-ios"){
            AppiumCapabilities.getCapabilities(capabilities,"ops92.ipadretina.appium151.app");
        }
        else if(nameOfBrowser=="phantomjs"){
            capabilities = DesiredCapabilities.phantomjs();
            capabilities.setJavascriptEnabled(true);
            capabilities.setCapability("takesScreenshot", true);
        }
        else if(nameOfBrowser=="remote-android"){
            capabilities = DesiredCapabilities.android();
        }
        /*else if(nameOfBrowser=="remote-chrome"){
            capabilities = DesiredCapabilities.chrome();
        }*/
        else if(nameOfBrowser=="remote-edge"){
            capabilities = DesiredCapabilities.edge();
        }
        else if(nameOfBrowser.equals("remote-firefox")){
            capabilities = DesiredCapabilities.chrome();
            //RemoteFirefox.getCapabilities(capabilities,getConfiguration());
            capabilities.setBrowserName("firefox");
            capabilities.setPlatform(Platform.WINDOWS);
            capabilities.setVersion("43.0.1");
            //setCommon(capabilities, "pc");
            //return capabilities;
            
        }
        else if(nameOfBrowser=="remote-htmlunit"){
            capabilities = DesiredCapabilities.htmlUnit();
        }
        else if(nameOfBrowser=="remote-htmljs"){
            capabilities = DesiredCapabilities.htmlUnitWithJs();
        }
        else if(nameOfBrowser=="remote-ie"){
            capabilities = DesiredCapabilities.internetExplorer();
        }
        else if(nameOfBrowser=="remote-ipad"){
            capabilities = DesiredCapabilities.ipad();
        }
        else if(nameOfBrowser=="remote-iphone"){
            capabilities = DesiredCapabilities.iphone();
        }
        else if(nameOfBrowser=="remote-opera"){
            capabilities = DesiredCapabilities.operaBlink();

        }
        else if(nameOfBrowser=="remote-phantomjs"){
            capabilities = DesiredCapabilities.phantomjs();
        }
        else if(nameOfBrowser=="remote-safari") {
            capabilities = DesiredCapabilities.safari();
        }
        else{
            //todo default common capabilities will be here
        }


        return capabilities;
    }

    /**
     * Using firefox manager, this will manage secure site capabilities, supporting managed cache, cookie, custom herder etc
     * @return
     */
    public static DesiredCapabilities getCapabilityWithSecurity(){

        return capabilities;
    }

    /**
     * Big todo for inhouse capability entries
     * will be reading from property , and node wise config
     * @return
     */
    public static DesiredCapabilities getInhouseCapabilities(String config){
        return capabilities;
    }

    public static DesiredCapabilities getDefault(){
        DesiredCapabilities chrome = DesiredCapabilities.chrome();
        chrome.setBrowserName("chrome");
        chrome.setPlatform(Platform.ANY);
        chrome.setVersion("ANY");
        return chrome;
    }
    
   /* public static String getConfiguration() throws IOException{
    	String os_name=PropertyUtil.getProperty("browser.properties", "os.name");
    	String browsr_ver=PropertyUtil.getProperty("browser.properties", "browser.version");
    	String resultion=PropertyUtil.getProperty("browser.properties", "resul");
        String full_config=os_name+"."+browsr_ver+"."+resultion;
		return full_config;
    	
    }*/

}
