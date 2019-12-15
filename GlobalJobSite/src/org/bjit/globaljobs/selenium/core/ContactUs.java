package org.bjit.globaljobs.selenium.core;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactUs {
private WebDriver driver = null;

public ContactUs(WebDriver driver) {
	this.driver = driver;
} 

@FindBy(id ="name" )//Name field for contact us
public WebElement name_of_contactus;

@FindBy(id ="email" )//Email field for contact us
public WebElement email_of_contactus;

@FindBy(id ="subject" )//Subject field for contact us
public WebElement subject_of_contactus;

@FindBy(id ="message" )//Message field for contact us
public WebElement message_of_contactus;

@FindBy(xpath =".//*[@id='sky-form']/footer/button" )//Send button for contact us
public WebElement send_button_of_contactus;

@FindBy(xpath =".//*[@id='flashMessage']" )//Message for contact us page fill up
public WebElement message;


private void typeIntoTestBox(WebElement element ,String text){
	element.sendKeys(text);
}

public void typeName(String name){
	//name_of_contactus.sendKeys(name);
	typeIntoTestBox(name_of_contactus,name );
}

public void typeEmail(String email){
	//email_of_contactus.sendKeys(email);
	typeIntoTestBox(email_of_contactus,email );
}

public void typeSubject(String subject) {
	// TODO Auto-generated method stub
    //subject_of_contactus.sendKeys(subject);
	typeIntoTestBox(subject_of_contactus,subject);
}

public void typeMessage(String message) {
	// TODO Auto-generated method stub
    //message_of_contactus.sendKeys(message);
	typeIntoTestBox(message_of_contactus,message);
}

public String clickSend(){
	//String message = null; 
	//click sedn
	//get the returned message
	send_button_of_contactus.click();
	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	return message.getText(); 
}

}



