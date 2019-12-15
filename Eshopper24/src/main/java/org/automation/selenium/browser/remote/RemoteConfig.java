package org.automation.selenium.browser.remote;

public class RemoteConfig {
    public static final String appium_USERNAME = "shantonu";
    public static final String appium_ACCESS_KEY = "yourKey";
    // todo -> make this reading from properties
    public static final String appium_URL = "http://" + appium_USERNAME + ":" + appium_ACCESS_KEY + "@ondemand.saucelabs.com:80/wd/hub";

    private static final String browserstack_USERNAME = "shantonu";
    private static final String browserstack_AUTOMATE_KEY = "yourKey";
    // todo -> make this reading from properties
    public static final String browserstack_URL = "http://" + browserstack_USERNAME + ":" + browserstack_AUTOMATE_KEY + "@hub.browserstack.com/wd/hub";
    //public static final String firefox_URL = "http://localhost:9515/wd/hub";
    //private static final String saucelabs_USERNAME = "shantonu";
    //private static final String saucelabs_ACCESS_KEY = "yourKey";
    private static final String saucelabs_USERNAME = "joyticse";
    private static final String saucelabs_ACCESS_KEY = "4e77ba99-748f-4831-b8d3-9511859ea6c4";
    // todo -> make this reading from properties
    public static final String saucelabs_URL = "http://"+saucelabs_USERNAME+":"+saucelabs_ACCESS_KEY+"@ondemand.saucelabs.com:80/wd/hub";

    public static String inhouse_hubIp="172.16.170.138";
    public static String inhouse_hubport="4444";
    public static String inhouse_hubUrl = "http://"+inhouse_hubIp+":"+inhouse_hubport+"/wd/hub";

}
