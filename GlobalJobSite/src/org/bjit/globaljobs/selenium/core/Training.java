package org.bjit.globaljobs.selenium.core;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class Training extends EducationPage {

	// @Test
	public void training() throws Exception {
		int training_option = randomnum.randomGenerator(3);
		super.education();

		if (training_option == 1) {
			/* Code for training title */
			Thread.sleep(2000);
			driver.findElement(By.id("TrainingTrainingTitle")).clear();
			driver.findElement(By.id("TrainingTrainingTitle")).sendKeys(
					"ISTQB Foundation Level Course");

			/* Code for Training topic */
			Thread.sleep(2000);
			driver.findElement(By.id("TrainingTopicCovered")).clear();
			driver.findElement(By.id("TrainingTopicCovered")).sendKeys(
					"Basic Testing, Test case design, Test management");

			/* Code for Institute */
			Thread.sleep(2000);
			driver.findElement(By.id("TrainingInstitute")).clear();
			driver.findElement(By.id("TrainingInstitute")).sendKeys(
					"Daffodil International University");

			/* Code for Country selection */
			Thread.sleep(2000);
			Select country = new Select(driver.findElement(By
					.id("TrainingCountryId")));
			Thread.sleep(2000);
			country.selectByIndex(18);

			/* Code for Location */
			Thread.sleep(2000);
			driver.findElement(By.id("TrainingLocation")).clear();
			driver.findElement(By.id("TrainingLocation"))
					.sendKeys("Bangladesh");

			/* Code for Year */
			Thread.sleep(2000);
			driver.findElement(By.id("TrainingTrainingYear")).clear();
			driver.findElement(By.id("TrainingTrainingYear")).sendKeys("2014");

			/* Code for Duration period */
			Thread.sleep(2000);
			driver.findElement(By.id("TrainingDuration")).clear();
			driver.findElement(By.id("TrainingDuration")).sendKeys("2 Months");

			/* Code for Next button */
			driver.findElement(
					By.xpath("/html/body/div[1]/div[2]/div/div[2]/div/div[2]/div[2]/form/div[5]/div/button"))
					.click();
			Thread.sleep(2000);
		}

		else {
			driver.findElement(
					By.xpath("/html/body/div[1]/div[2]/div/div[2]/div/div[2]/div[2]/form/div[5]/div/button"))
					.click();
			Thread.sleep(2000);
		}

	}

}
