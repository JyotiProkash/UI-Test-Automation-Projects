package org.bjit.globaljobs.selenium.core;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Footer extends Browser{
	
	//OpenBrowser browser=new OpenBrowser();
	
	/**
	 * @throws Exception
	 */
	@Test
	
	public void footer() throws Exception{
		
		super.setUp();
	    ///super.scrollDown();
	    //super.scrollUp();

		//String parentHandle = driver.getWindowHandle(); // get the current window handle
		//driver.findElement(By.xpath("/html/body/footer/div/div/div[1]/div[2]/ul/li[1]/a")).click(); // click some link that opens a new window
		
		String oldTab = driver.getWindowHandle();
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL +"t");
        driver.get("http://twitter.com/globaljobsbd");
        assertAdvertisingBlog();
	    Thread.sleep(3000);
        driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "w");
	    driver.switchTo().window(oldTab);
	    assertStartAdvertising();
       
}
	
	private void assertStartAdvertising() {
	    Assert.assertEquals("Global Jobs BD | Find a Job Globally and build The best career", driver.getTitle());
	}

	private void assertAdvertisingBlog() {
	    Assert.assertEquals("Global Jobs BD (@globaljobsbd) | Twitter", driver.getTitle());
	}
	
}
