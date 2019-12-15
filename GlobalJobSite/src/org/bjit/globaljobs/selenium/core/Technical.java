package org.bjit.globaljobs.selenium.core;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class Technical extends Language {
	// @Test
	public void technical() throws Exception {
		super.language();
		int is_technical = randomnum.randomGenerator(3);
		if (is_technical == 1) {

			/* Code for Category */
			Thread.sleep(2000);
			if (!driver.findElement(By.id("tech_select_57")).isSelected()) {
				driver.findElement(By.id("tech_select_57")).click();
				Thread.sleep(2000);
				Select grade = new Select(driver.findElement(By.id("tech_57")));
				Thread.sleep(2000);
				grade.selectByIndex(1);
			}

			/* Code for Category */
			Thread.sleep(2000);
			if (!driver.findElement(By.id("tech_select_150")).isSelected()) {
				driver.findElement(By.id("tech_select_150")).click();
				Thread.sleep(2000);
				Select grade = new Select(driver.findElement(By.id("tech_150")));
				Thread.sleep(2000);
				grade.selectByIndex(2);
			}

			/* Code for Category */
			Thread.sleep(2000);
			if (!driver.findElement(By.id("tech_select_151")).isSelected()) {
				driver.findElement(By.id("tech_select_151")).click();
				Thread.sleep(2000);
				Select grade = new Select(driver.findElement(By.id("tech_151")));
				Thread.sleep(2000);
				grade.selectByIndex(3);
			}

			/* Code for Category */
			Thread.sleep(2000);
			if (!driver.findElement(By.id("tech_select_148")).isSelected()) {
				driver.findElement(By.id("tech_select_148")).click();
				Thread.sleep(2000);
				Select grade = new Select(driver.findElement(By.id("tech_148")));
				Thread.sleep(2000);
				grade.selectByIndex(4);
			}

			/* Code for Category */
			Thread.sleep(2000);
			if (!driver.findElement(By.id("tech_select_149")).isSelected()) {
				driver.findElement(By.id("tech_select_149")).click();
				Thread.sleep(2000);
				Select grade = new Select(driver.findElement(By.id("tech_149")));
				Thread.sleep(2000);
				grade.selectByIndex(2);
			}

			/* Code for Next button */
			driver.findElement(
					By.xpath("/html/body/div[1]/div[2]/div/div[2]/div/div[2]/div[2]/form/div[4]/div/button"))
					.click();
			Thread.sleep(2000);
		} else {
			driver.findElement(
					By.xpath("/html/body/div[1]/div[2]/div/div[2]/div/div[2]/div[2]/form/div[4]/div/button"))
					.click();
			Thread.sleep(2000);
		}
	}

}
