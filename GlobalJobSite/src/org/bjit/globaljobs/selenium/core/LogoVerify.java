package org.bjit.globaljobs.selenium.core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class LogoVerify {
	WebDriver driver1;

	/* This method redirect to Home page.) */
	public int logo() throws InterruptedException {
		// TODO Auto-generated method stub
		WebElement loggo = driver1.findElement(By
				.xpath("/html/body/div[2]/section[1]/div[1]/div/div/a/img"));
		loggo.click();
		Thread.sleep(2000);
		// System.out.print(loggo.getText());
		Assert.assertTrue(loggo.isDisplayed());
		return 0;
	}

}
