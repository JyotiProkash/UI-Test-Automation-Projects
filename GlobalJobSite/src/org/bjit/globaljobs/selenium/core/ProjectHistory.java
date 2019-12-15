package org.bjit.globaljobs.selenium.core;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class ProjectHistory extends Career {

	// @Test
	public void projectHistory() throws Exception {
		super.career();
		int is_project_history = randomnum.randomGenerator(3);
		if (is_project_history == 1) {

			/* Code for Project name */
			Thread.sleep(2000);
			driver.findElement(By.id("ProjectProjectName")).clear();
			driver.findElement(By.id("ProjectProjectName")).sendKeys(
					"Usablenet project");
			/* Code for Job title */
			Thread.sleep(2000);
			Select job_title_option = new Select(driver.findElement(By
					.id("ProjectJobTitleId")));
			Thread.sleep(2000);
			job_title_option.selectByIndex(16);

			/* Code for Process */
			Thread.sleep(2000);
			Select process_option = new Select(driver.findElement(By
					.id("ProjectProcessId")));
			Thread.sleep(2000);
			process_option.selectByIndex(1);

			/* Code for Technology */
			Thread.sleep(2000);
			if (!driver.findElement(By.id("ProjectTechUsed148")).isSelected()) {
				driver.findElement(By.id("ProjectTechUsed148")).click();
				Thread.sleep(2000);
			}

			/* Code for Start date */
			Thread.sleep(2000);
			driver.findElement(By.id("datepicker0")).clear();
			driver.findElement(By.id("datepicker0")).sendKeys("2014-11-19");
			// Thread.sleep(2000);
			// driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div/div[2]/div[2]/form/div[2]/div[4]/label")).click();

			/* Code for end date Selection */
			Thread.sleep(2000);
			driver.findElement(By.id("datepicker1")).clear();
			driver.findElement(By.id("datepicker1")).sendKeys("2015-10-05");
			Thread.sleep(2000);

			/* Code for No of engineer */
			// Thread.sleep(2000);
			driver.findElement(By.id("ProjectNoOfEngineers")).clear();
			driver.findElement(By.id("ProjectNoOfEngineers")).sendKeys("5");

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
