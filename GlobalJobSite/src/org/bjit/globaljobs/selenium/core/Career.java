package org.bjit.globaljobs.selenium.core;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class Career extends Training {

	//@Test
	public void career() throws Exception {
		super.training();
		int career_option = randomnum.randomGenerator(3);
		if (career_option == 1) {

			/* Code for Company name */
			Thread.sleep(2000);
			driver.findElement(By.id("CareerPastCompanyName")).clear();
			driver.findElement(By.id("CareerPastCompanyName")).sendKeys(
					"ServicEngine Limited");
			/* Code for Job title */
			Thread.sleep(2000);
			Select job_title = new Select(driver.findElement(By
					.id("responsibility_0")));
			Thread.sleep(2000);
			job_title.selectByIndex(10);

			/* Code for responsibility */
			/*
			 * Thread.sleep(2000); List<WebElement>
			 * responsibility=driver.findElements(By.xpath(
			 * "/html/body/div[1]/div[2]/div/div[2]/div/div[2]/div[2]/form/div[2]/div[3]/div/span/div"
			 * )); for(int r=1;r<=responsibility.size();r++){
			 * 
			 * if(!responsibility.get(r-1).isSelected()){
			 * responsibility.get(r-1).click(); Thread.sleep(2000); }
			 * 
			 * }
			 */

			/* Code for Technology */
			if (!driver.findElement(By.id("CareerTechUsed57")).isSelected())
				driver.findElement(By.id("CareerTechUsed57")).click();

			/* Code for Start date */
			Thread.sleep(2000);
			driver.findElement(By.id("datepicker0")).clear();
			driver.findElement(By.id("datepicker0")).sendKeys("2011-11-19");
			// Thread.sleep(2000);
			// driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div/div[2]/div[2]/form/div[2]/div[4]/label")).click();

			/* Code for end date Selection */
			Thread.sleep(3000);
			driver.findElement(By.id("datepicker1")).clear();
			driver.findElement(By.id("datepicker1")).sendKeys("2014-04-05");
			Thread.sleep(2000);

			/* Code for Next button */
			driver.findElement(
					By.xpath("/html/body/div[1]/div[2]/div/div[2]/div/div[2]/div[2]/form/div[5]/div/button"))
					.click();
			Thread.sleep(2000);
		} else {
			driver.findElement(
					By.xpath("/html/body/div[1]/div[2]/div/div[2]/div/div[2]/div[2]/form/div[5]/div/button"))
					.click();
			Thread.sleep(2000);
		}
	}

}
