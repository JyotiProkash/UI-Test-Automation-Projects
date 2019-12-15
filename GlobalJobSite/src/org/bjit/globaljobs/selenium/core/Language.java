package org.bjit.globaljobs.selenium.core;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class Language extends ProjectHistory {
	// @Test
	public void language() throws Exception {
		super.projectHistory();
		int is_language = randomnum.randomGenerator(3);
		if (is_language == 1) {

			/* Code for Bengali */
			Thread.sleep(2000);
			if (!driver.findElement(By.id("lang_select_1")).isSelected()) {
				driver.findElement(By.id("lang_select_1")).click();
				Thread.sleep(2000);
				/* Code for Reading */
				Select bengali_reading_level = new Select(driver.findElement(By
						.id("lang_select_01")));
				Thread.sleep(2000);
				bengali_reading_level.selectByIndex(1);
				/* Code for Writing */
				Select bengali_writing_level = new Select(driver.findElement(By
						.id("lang_select_11")));
				Thread.sleep(2000);
				bengali_writing_level.selectByIndex(1);
				/* Code for Listening */
				Select bengali_listening_level = new Select(
						driver.findElement(By.id("lang_select_21")));
				Thread.sleep(2000);
				bengali_listening_level.selectByIndex(1);
				/* Code for Speaking */
				Select bengali_speaking_level = new Select(
						driver.findElement(By.id("lang_select_31")));
				Thread.sleep(2000);
				bengali_speaking_level.selectByIndex(1);
			}
			/* Code for English */
			Thread.sleep(2000);
			if (!driver.findElement(By.id("lang_select_2")).isSelected()) {
				driver.findElement(By.id("lang_select_2")).click();
				Thread.sleep(2000);
				/* Code for Reading */
				Select english_reading_level = new Select(driver.findElement(By
						.id("lang_select_02")));
				Thread.sleep(2000);
				english_reading_level.selectByIndex(1);
				/* Code for Writing */
				Select english_writing_level = new Select(driver.findElement(By
						.id("lang_select_12")));
				Thread.sleep(2000);
				english_writing_level.selectByIndex(2);
				/* Code for Listening */
				Select english_listening_level = new Select(
						driver.findElement(By.id("lang_select_22")));
				Thread.sleep(2000);
				english_listening_level.selectByIndex(1);
				/* Code for Speaking */
				Select english_speaking_level = new Select(
						driver.findElement(By.id("lang_select_32")));
				Thread.sleep(2000);
				english_speaking_level.selectByIndex(2);
			}

			/* Code for Japaneese */
			/*
			 * Thread.sleep(2000);
			 * if(!driver.findElement(By.id("lang_select_3")).isSelected()){
			 * driver.findElement(By.id("lang_select_3")).click();
			 * Thread.sleep(2000); }
			 */

			/* Code for Next button */
			driver.findElement(
					By.xpath("/html/body/div[1]/div[2]/div/div[2]/div/div[2]/div[2]/form/div[7]/div/button"))
					.click();
			Thread.sleep(2000);
		} else {
			driver.findElement(
					By.xpath("/html/body/div[1]/div[2]/div/div[2]/div/div[2]/div[2]/form/div[7]/div/button"))
					.click();
			Thread.sleep(2000);
		}
	}

}
