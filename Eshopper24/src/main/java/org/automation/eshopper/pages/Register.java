package org.automation.eshopper.pages;

import org.automation.eshopper.EShopperPageBase;
import org.automation.selenium.page.PageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Register extends EShopperPageBase {
	public Register(WebDriver aDriver){
		super(aDriver);
	}
	
	@FindBy(how=How.XPATH, xpath="//h2[text()='Register']")
    public WebElement register_header_text;
	
	@FindBy(how=How.XPATH, xpath="//form//div//strong[text()='Your Personal Details']")
    public WebElement personal_detail_header_text;
	
	@FindBy(how=How.XPATH, xpath="//form//div//label[text()='Gender:']")
    public WebElement gender_text;
	
	@FindBy(how=How.XPATH, xpath="//form//div//label[text()='Male']")
    public WebElement male_radio_button;
	
	@FindBy(how=How.XPATH, xpath="//form//div//label[text()='Female']")
    public WebElement female_radio_button;
	
	@FindBy(how=How.XPATH, xpath="//form//div//label[text()='Email:']")
    public WebElement email_text;
	
	@FindBy(how=How.ID, id="Email")
    public WebElement email_address_field;
	
	@FindBy(how=How.XPATH, xpath="//form//div//Strong[text()='Your Contact Information']")
    public WebElement your_contact_information_text;
	
	@FindBy(how=How.XPATH, xpath="//form//div//label[text()='Phone:']")
    public WebElement phone_text;
	
	@FindBy(how=How.ID, id="Phone")
    public WebElement phone_field;
	
	@FindBy(how=How.XPATH, xpath="//form//div//strong[text()='Options']")
    public WebElement options_text;
	
	@FindBy(how=How.XPATH, xpath="//form//div//label[text()='Newsletter']")
    public WebElement newsletter_check_box;
	
	@FindBy(how=How.XPATH, xpath="//form//div//strong[text()='Your Password']")
    public WebElement your_password_text;
	
	@FindBy(how=How.XPATH, xpath="//form//div//label[text()='Password:']")
    public WebElement password_text;
	
	@FindBy(how=How.ID, id="Password")
    public WebElement password_field;
	
	@FindBy(how=How.XPATH, xpath="//form//div//label[text()='Confirm password:']")
    public WebElement confirm_password_text;
	
	@FindBy(how=How.ID, id="ConfirmPassword")
    public WebElement confirm_password_field;
	
	@FindBy(how=How.ID, id="register-button")
    public WebElement register_button;
	
	@FindBy(how=How.XPATH, xpath="//form//div//span[text()='First name is required.']")
    public WebElement first_name_required_message;
	
	@FindBy(how=How.XPATH, xpath="//form//div//span[text()='Last name is required.']")
    public WebElement last_name_required_message;
	
	@FindBy(how=How.XPATH, xpath="//form//div//span[text()='Email is required.']")
    public WebElement email_required_message;
	
	@FindBy(how=How.XPATH, xpath="//form//div//span[text()='Phone is required']")
    public WebElement phone_number_required_message;
	
	@FindBy(how=How.XPATH, xpath="//form//div//span[@class='field-validation-error'][@data-valmsg-for='Password']")
    public WebElement password_required_message;
	
	@FindBy(how=How.XPATH, xpath="//form//div//span[@class='field-validation-error'][@data-valmsg-for='ConfirmPassword']")
    public WebElement confirm_password_required_message;
	
	public String displayFirstNameRequiredMessage(){
		return first_name_required_message.getText();
	}
	
	public String displayLastNameRequiredMessage(){
		return last_name_required_message.getText();
	}
	
	public String displayEmailAddressRequiredMessage() {
		// TODO Auto-generated method stub
		return email_required_message.getText();
	}

	public String displayPhoneNumberRequiredMessage() {
		// TODO Auto-generated method stub
		return phone_number_required_message.getText();
	}

	public String displayPasswordRequiredMessage() {
		// TODO Auto-generated method stub
		return password_required_message.getText();
	}

	public String displayConfirmPasswordRequiredMessage() {
		// TODO Auto-generated method stub
		return confirm_password_required_message.getText();
	}
	
	public PageBase load() {
		// TODO Auto-generated method stub
		driver.get(getUrl());
        return this;
	}




}
