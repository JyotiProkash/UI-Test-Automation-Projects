package org.bjit.globaljobs.selenium.core;

import org.openqa.selenium.By;

public class Upload extends Preference {

	// @Test
	public void upload() throws Exception {
		super.preference();

		/* Code for image */
		Thread.sleep(2000);
		driver.findElement(By.id("profile_image")).sendKeys(
				"F:\\Personal_doc\\Scan File\\jyoti.jpg");
		Thread.sleep(2000);

		/* Code for CV attachment */
		Thread.sleep(2000);
		driver.findElement(By.id("file_upload")).sendKeys(
				"F:\\Personal_doc\\Scan File\\jyoti_cv.pdf");
		Thread.sleep(2000);

		/* Code for Save button */
		// driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div/div[2]/div[2]/form/div[10]/div/button")).click();
		// Thread.sleep(2000);
	}

}
