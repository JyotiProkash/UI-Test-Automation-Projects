package org.bjit.globaljobs.selenium.core;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class Preference extends Technical {

	// @Test
	public void preference() throws Exception {
		super.technical();

		/* Code for Location */
		Thread.sleep(2000);
		driver.findElement(
				By.xpath("/html/body/div[1]/div[2]/div/div[2]/div/div[2]/div[2]/form/div[2]/div/div/div/button"))
				.click();
		Thread.sleep(2000);
		driver.findElement(
				By.xpath("/html/body/div[1]/div[2]/div/div[2]/div/div[2]/div[2]/form/div[2]/div/div/div/ul/li[4]/a/label/input"))
				.click();
		Thread.sleep(2000);
		driver.findElement(
				By.xpath("/html/body/div[1]/div[2]/div/div[2]/div/div[2]/div[2]/form/div[2]/div/div/div/button"))
				.click();
		/* Code for Job Type */
		Thread.sleep(2000);
		Select job_type = new Select(driver.findElement(By
				.id("PreferenceJobTypeId")));
		Thread.sleep(2000);
		job_type.selectByIndex(1);

		/* Code for Looking for */
		Thread.sleep(2000);
		Select looking_for = new Select(driver.findElement(By
				.id("PreferenceJobLookingFor")));
		Thread.sleep(2000);
		looking_for.selectByIndex(1);

		/* Code for Occupation */
		Thread.sleep(2000);
		driver.findElement(
				By.xpath("/html/body/div[1]/div[2]/div/div[2]/div/div[2]/div[2]/form/div[5]/div/div/div/button"))
				.click();
		Thread.sleep(2000);
		driver.findElement(
				By.xpath("/html/body/div[1]/div[2]/div/div[2]/div/div[2]/div[2]/form/div[5]/div/div/div/ul/li[8]/a/label/input"))
				.click();

		/* Code for Industry */
		Thread.sleep(2000);
		driver.findElement(
				By.xpath("/html/body/div[1]/div[2]/div/div[2]/div/div[2]/div[2]/form/div[6]/div/div/div/button"))
				.click();
		Thread.sleep(2000);
		driver.findElement(
				By.xpath("/html/body/div[1]/div[2]/div/div[2]/div/div[2]/div[2]/form/div[6]/div/div/div/ul/li[9]/a/label/input"))
				.click();

		/* Code for Preferred skill */
		Thread.sleep(2000);
		driver.findElement(
				By.xpath("/html/body/div[1]/div[2]/div/div[2]/div/div[2]/div[2]/form/div[7]/div/div/div/button"))
				.click();
		Thread.sleep(2000);
		driver.findElement(
				By.xpath("/html/body/div[1]/div[2]/div/div[2]/div/div[2]/div[2]/form/div[7]/div/div/div/ul/li[5]/a/label/input"))
				.click();

		/* Code for Length */
		Thread.sleep(2000);
		Select length = new Select(
				driver.findElement(By.id("PreferenceLength")));
		Thread.sleep(2000);
		length.selectByIndex(3);

		/* Code for Salary */
		Thread.sleep(2000);
		Select salary = new Select(driver.findElement(By
				.id("PreferenceSalaryRange")));
		Thread.sleep(2000);
		salary.selectByIndex(3);

		/* Code for Next button */
		driver.findElement(
				By.xpath("/html/body/div[1]/div[2]/div/div[2]/div/div[2]/div[2]/form/div[10]/div/button"))
				.click();
		Thread.sleep(2000);
	}

}
