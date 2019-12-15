package org.bjit.globaljobs.selenium.core;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EducationPage{
	
	private WebDriver driver=null;
	
	public EducationPage(WebDriver driver){
		this.driver=driver;
		
	}
	
	@FindBy(xpath ="/html/body/div[1]/div[2]/div/div[2]/div/div[2]/div[2]/div" )//Verification Education page 
	private WebElement verifyEducationPage;
	
	
	@FindBy(xpath =".//*[@id='EducationProfileStepForm']/div[5]/div/button" )//Find out Next button
	private WebElement identifyNextButton;
	
	@FindBy(xpath =".//*[@id='EducationProfileStepForm']/div[5]/div/a" )//Find out Previous button
	private WebElement identifyPreviousButton;
    
	public WebElement displayEducationPage() {
		// TODO Auto-generated method stub
		return verifyEducationPage;
	}
	
	public void clickPreviousButton() {
		// TODO Auto-generated method stub
		identifyPreviousButton.click();
		browserWaitingTime();
	}
	
	private void browserWaitingTime(){ //time for loading page in  browser 
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	/*int y;

	// @Test
	public void education() throws Exception {
		super.basicInfo();
		 Education level selection 
		Thread.sleep(2000);
		Select education_level = new Select(driver.findElement(By.id("EducationLevelOfEducation")));
		Thread.sleep(2000);
		education_level.selectByIndex(3);

		 Institute Selection 
		Thread.sleep(2000);
		Select institute = new Select(driver.findElement(By.id("others_0")));
		Thread.sleep(2000);
		int index_number = randomnum.randomGenerator(45);
		institute.selectByIndex(index_number);

		if (index_number == 44) {
			driver.findElement(By.className("form-control required")).clear();
			Thread.sleep(2000);
			driver.findElement(By.className("form-control required")).sendKeys("50000");
		}

		 Department selection 
		Thread.sleep(2000);
		Select department = new Select(driver.findElement(By.id("EducationDepartmentId")));
		Thread.sleep(2000);
		department.selectByIndex(2);

		 Code for Start date Selection 
		
		 * WebElement
		 * start_year=driver.findElement(By.id("EducationStartYear"));
		 * start_year.click(); Thread.sleep(1000);
		 * 
		 * int year_session=randomnum.randomGenerator(4); for(int
		 * j=1;j<=year_session;j++){ driver.findElement(By.xpath(
		 * "/html/body/div[6]/div[3]/table/thead/tr/th[1]")).click();
		 * 
		 * //Thread.sleep(1000); }
		 

		 Year selection 
		
		 * List<WebElement> years=driver.findElements(By.className("year")); int
		 * random_years=randomnum.randomGenerator(years.size());
		 * for(y=0;y<years.size();y++){ if(random_years==y+1) {
		 * years.get(y).click(); driver.findElement(By.xpath(
		 * "/html/body/div[1]/div[2]/div/div[2]/div/div[2]/div[2]/form/div[2]/div[4]/label"
		 * )).click(); Thread.sleep(2000); break; } }
		 
		Thread.sleep(2000);
		driver.findElement(By.id("EducationStartYear")).clear();
		driver.findElement(By.id("EducationStartYear")).sendKeys("2007");
		// Thread.sleep(2000);
		// driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div/div[2]/div[2]/form/div[2]/div[4]/label")).click();

		 Code for end date Selection 
		Thread.sleep(3000);
		driver.findElement(By.id("EducationEndYear")).clear();
		driver.findElement(By.id("EducationEndYear")).sendKeys("2011");
		Thread.sleep(2000);
		// driver.findElement(By.id("/html/body/div[1]/div[2]/div/div[2]/div/div[2]/div[2]/form/div[2]/div[5]/label")).click();

		 Code for Continue checkbox 
		
		 * if(!driver.findElement(By.id("is_continue_0")).isSelected())
		 * driver.findElement(By.id("is_continue_0")).click();
		 

		 Code for Duration selection 
		Thread.sleep(2000);
		Select education_duration = new Select(driver.findElement(By.id("EducationDuration")));
		// Thread.sleep(2000);
		// int duration_number=randomnum.randomGenerator(5);
		Thread.sleep(2000);
		education_duration.selectByIndex(1);

		 Code for Education Major field selection 
		Thread.sleep(2000);
		driver.findElement(By.id("EducationMajorField")).clear();
		driver.findElement(By.id("EducationMajorField")).sendKeys("Computer Science");

		 Code for Next button 
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div/div[2]/div[2]/form/div[5]/div/button")).click();
		Thread.sleep(2000);

	}*/

}
