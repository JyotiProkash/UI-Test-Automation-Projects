package org.bjit.globaljobs.selenium.core;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class BasicInfoPage {
	private WebDriver driver=null;
	
	public BasicInfoPage(WebDriver driver){
		this.driver=driver;
	}
	
	@FindBy(xpath =".//*[@id='wrapper']/div[2]/div/div[2]/div/div[1]/div" )//Find out Basic Info page
	public WebElement verifyBasicInfoPage;
	
	@FindBy(id ="BasicInfoFirstName" )//Find out First Name field
	private WebElement identifyFirstName;
	
	@FindBy(id ="BasicInfoLastName" )//Find out Last Name field
	private WebElement identifyLastName;
	
	@FindBy(id ="BasicInfoFatherName" )//Find out Fathers Name field
	private WebElement identifyFathersName;
	
	@FindBy(id ="BasicInfoMotherName" )//Find out Mothers Name field
	private WebElement identifyMothersName;
	
	@FindBy(id ="datepicker0" )//Find out Date of birth text field
	private WebElement identifyDateOfBirth;
	
	@FindBy(css ="[name='data[BasicInfo][gender]'][id='BasicInfoGenderMale'][type='radio']" )//Find out gender male
	private WebElement selectGenderMale;
	
	@FindBy(css ="[name='data[BasicInfo][gender]'][id='BasicInfoGenderFemale'][type='radio']" )//Find out gender female
	private WebElement selectGenderFemale;
	
	@FindBy(id ="BasicInfoMaritalStatus" )//Find out marital status dropdown
	private WebElement identifyMaritalStatusItem;
	
	@FindBy(id ="BasicInfoCountryId" )//Find out Nationality dropdown
	private WebElement identifyNationality;
	
	@FindBy(id ="BasicInfoNationalId" )//Find out National id field
	private WebElement identifyNationalId;
	
	@FindBy(id ="BasicInfoReligion" )//Find out Religion field
	private WebElement identifyReligion;
	
	@FindBy(id ="BasicInfoPresentAddress" )//Find out Present address field
	private WebElement identifyPresentAddress;
	
	@FindBy(id ="BasicInfoPermanentAddress" )//Find out Permanent address field
	private WebElement identifyPermanentAdddress;
	
	@FindBy(id ="BasicInfoHomePhoneNumber" )//Find out Home phone number field
	private WebElement identifyHomePhoneNumber;
	
	@FindBy(id ="BasicInfoMobilePhoneNumber" )//Find out Mobile phone number field
	private WebElement identifyMobilePhoneNumber;
	
	@FindBy(id ="BasicInfoAlternativeEmail" )//Find out Alternative email field
	private WebElement identifyAlternativeEmail;
	
	@FindBy(id ="BasicInfoIsEmployeeYes" )//Find out is Employed Yes
	private WebElement identifyIsEmployedYes;
	
	@FindBy(id ="BasicInfoIsEmployeeNo" )//Find out is Employed No
	private WebElement identifyIsEmployedNo;
	
	@FindBy(id ="BasicInfoSalaryInfo" )//Find out Basic salary info 
	private WebElement identifyCurrentSalaryInfo;
	
	@FindBy(id ="BasicInfoReceiveInfo" )//Find out Receive info dropdown 
	private WebElement identifyReceiveInfoOption;
	
	@FindBy(id ="BasicInfoScoutMail" )//Find out Scout mail dropdown
	private WebElement identifyScoutMailOption;
	
	@FindBy(xpath ="/html/body/div[1]/div[2]/div/div[2]/div/div[2]/div[2]/form/div[21]/div/button" )//Find out Next Button
	private WebElement nextButtonBasicInfo;
	
	/*@FindBy(xpath ="/html/body/div[1]/div[2]/div/div[2]/div/div[2]/div[2]/div" )//Verification Education page 
	private WebElement verifyEducationPage;*/
	
	public WebElement displayBasicInfoPage(){// Get text/message for valid login page verification
		browserWaitingTime();
		return verifyBasicInfoPage;
		
	}
	
	
	private void typeIntoTextBox(WebElement element, String text){
		element.sendKeys(text);
		browserWaitingTime();			
	}
	
	public void typeFirstName(String first_name) {
		// TODO Auto-generated method stub
		typeIntoTextBox(identifyFirstName,first_name);
	}

	public void typeLastName(String last_name) {
		// TODO Auto-generated method stub
		typeIntoTextBox(identifyLastName,last_name);
	}

	public void typeFathersName(String fathers_name) {
		// TODO Auto-generated method stub
		typeIntoTextBox(identifyFathersName,fathers_name);
	}

	public void typeMothersName(String mothers_name) {
		// TODO Auto-generated method stub
		typeIntoTextBox(identifyMothersName,mothers_name);
	}
	
	public void typeDateOfBirth(String date_of_birth) {
		// TODO Auto-generated method stub
		typeIntoTextBox(identifyDateOfBirth,date_of_birth);
		
	}
	
	public void selectGender(String gender) {
		// TODO Auto-generated method stub
		if(gender.contentEquals("Male")){
			if (!(selectGenderMale.isSelected())) {
				browserWaitingTime();
				selectGenderMale.click();
			}	
		}
		
		else{
			
			if (!(selectGenderFemale.isSelected())) {
				browserWaitingTime();
				selectGenderFemale.click();
			}	
	   }
			
	}

	public void selectMaritalStatus(String merital_status) {
		// TODO Auto-generated method stub
		    Select dropdown_marital_status = new Select(identifyMaritalStatusItem);
			dropdown_marital_status.selectByVisibleText(merital_status);
		}

	public void selectNationality(String nationality) {
		// TODO Auto-generated method stub
		Select dropdown_nationality = new Select(identifyNationality);
		dropdown_nationality.selectByVisibleText(nationality);
		
	}


	public void typeNationalId(String national_id) {
		// TODO Auto-generated method stub
		typeIntoTextBox(identifyNationalId,national_id);
		
	}


	public void typeReligion(String religion) {
		// TODO Auto-generated method stub
		typeIntoTextBox(identifyReligion,religion);
		
	}


	public void typePresentAddress(String present_address) {
		// TODO Auto-generated method stub
		typeIntoTextBox(identifyPresentAddress,present_address);
		
	}


	public void typePermanentAddress(String permanent_address) {
		// TODO Auto-generated method stub
		typeIntoTextBox(identifyPermanentAdddress,permanent_address);
		
	}


	public void typeHomePhoneNumber(String home_phone) {
		// TODO Auto-generated method stub
		typeIntoTextBox(identifyHomePhoneNumber,home_phone);
		
	}


	public void typeMobilePhoneNumber(String mobile_phone) {
		// TODO Auto-generated method stub
		typeIntoTextBox(identifyMobilePhoneNumber,mobile_phone);
		
	}


	public void typeAlternativeEmail(String alternative_email) {
		// TODO Auto-generated method stub
		typeIntoTextBox(identifyAlternativeEmail,alternative_email);
		
	}


	public void selectIsEmployed(String yes_employed, String current_salary) {
		// TODO Auto-generated method stub
		if(yes_employed.contentEquals("Yes")){
			if (!(identifyIsEmployedYes.isSelected())) {
				browserWaitingTime();
				identifyIsEmployedYes.click();
				typeIntoTextBox(identifyCurrentSalaryInfo, current_salary);
			}	
		}
		
		
	}
	
	public void selectIsEmployed(String no_employed) {
		// TODO Auto-generated method stub
		if(no_employed.contentEquals("No")){
			if (!(identifyIsEmployedNo.isSelected())) {
				browserWaitingTime();
				identifyIsEmployedNo.click();
			}
		}
		
	}


	public void selectReceiveInfo(String receive_info) {
		// TODO Auto-generated method stub
		Select dropdown_receive_info = new Select(identifyReceiveInfoOption);
		dropdown_receive_info.selectByVisibleText(receive_info);
	}


	public void selectScoutMail(String scout_mail) {
		// TODO Auto-generated method stub
		Select dropdown_scout_mail = new Select(identifyScoutMailOption);
		dropdown_scout_mail.selectByVisibleText(scout_mail);
	}


	public void clickNextButtonBasicInfoDataSave() {
		// TODO Auto-generated method stub
		nextButtonBasicInfo.click();
		browserWaitingTime();
	}

	/*public WebElement displayEducationPage() {
		// TODO Auto-generated method stub
		return verifyEducationPage;
	}*/
	
	private void browserWaitingTime(){ //time for loading page in  browser 
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
}

