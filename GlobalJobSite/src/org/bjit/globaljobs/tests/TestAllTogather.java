package org.bjit.globaljobs.tests;

import org.bjit.globaljobs.selenium.core.BasicInfoPage;
import org.bjit.globaljobs.selenium.core.Browser;
import org.bjit.globaljobs.selenium.core.ContactUs;
import org.bjit.globaljobs.selenium.core.EducationPage;
import org.bjit.globaljobs.selenium.core.HomePage;
import org.bjit.globaljobs.selenium.core.LoginPage;
import org.bjit.globaljobs.selenium.core.SignupPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestAllTogather {
	private HomePage home = null;
	private ContactUs contactus = null;
	private LoginPage login=null;
	private SignupPage signup=null;
	private BasicInfoPage basicinfo=null; 
	private EducationPage educationinfo=null;
	WebDriver aBrowser =null;
	
    @BeforeClass
	public void initiation(){
    	
    	/*aBrowser = new FirefoxDriver();
    	aBrowser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        aBrowser.manage().window().maximize();
    	aBrowser.get("http://globaljobsbd.com/");
		home=PageFactory.initElements(aBrowser, HomePage.class);
		contactus=PageFactory.initElements(aBrowser, ContactUs.class);
		login=PageFactory.initElements(aBrowser, LoginPage.class);*/
    	
    	aBrowser=Browser.getInstance();
    	aBrowser.get("http://globaljobsbd.com/");
    	home=PageFactory.initElements(aBrowser, HomePage.class);
		contactus=PageFactory.initElements(aBrowser, ContactUs.class);
		login=PageFactory.initElements(aBrowser, LoginPage.class);
		signup=PageFactory.initElements(aBrowser, SignupPage.class);
		basicinfo=PageFactory.initElements(aBrowser, BasicInfoPage.class);
		educationinfo=PageFactory.initElements(aBrowser, EducationPage.class);
    } 
    
    @AfterClass
    public void endProcessesOfAllTests(){
    	//Browser.endtest(aBrowser);
    }
    
    @Test(priority = 0)
	public void testHeaderItems() throws Exception {
		Assert.assertTrue(home.clickSignIn().isEnabled());
		login.dismissPopup();
		Assert.assertTrue(home.clickSignUp().isEnabled());
		signup.dismissSignupPopup();
	}
    
    @Test(priority = 1)
	public void testMenuItems() throws Exception {
		Assert.assertEquals(home.clickHome(), "Use these simple steps to register and allow overseas companies to look at your resume."); 
		Assert.assertEquals(home.clickService(), "HOW IT WORKS");
		Assert.assertEquals(home.clickAboutUS(), "WHO WE ARE");
		Assert.assertEquals(home.clickClients(), "People who like working with us.");
		Assert.assertEquals(home.clickSupports(), "How Can We Help".toUpperCase());
		Assert.assertEquals(home.clickProtfolio(), "Proud to Present".toUpperCase()); 
		Assert.assertEquals(home.clickFindUs(), "WHERE YOU CAN FIND US"); 		
		
	}
	
	@Test(priority = 2)
	public void testFooterItems(){
		Assert.assertEquals(home.clickOurStory(),"Our Story");
		Assert.assertEquals(home.clickSupportsFooterLink(),"Our Supports");
		Assert.assertEquals(home.clickFaq(),"FAQ");
		Assert.assertEquals(home.clickTermsofUse(),"Terms of Use");
		Assert.assertEquals(home.clickContactUs(),"Contact Us");
		Assert.assertEquals(home.clickFaceBookLink(),"Email or Phone");
		Assert.assertEquals(home.clickTwitterLink(),"GLOBAL JOBS BD is worldwide employment web site for Bangladeshi IT engineers, who wish to work overseas or have interests in working overseas.");
		Assert.assertEquals(home.clickGooglePlusLink(),"Global Jobs");
	}

	@Test(priority = 3)
	public void testSendingMessage(){
		Assert.assertEquals(home.clickContactUs(),"Contact Us");
		contactus.typeName("Jyoti");
		contactus.typeEmail("jhjfdh@yahoo.com");
		contactus.typeSubject("ABBnjhg");
		contactus.typeMessage("ABBnjhg");
		//type others necessary itesm 
		Assert.assertEquals(contactus.clickSend(),"Your message has been send to the site Admin!");
	}

   @Test(priority = 4)
	public void testInvalidLogin(){
		Assert.assertTrue(home.clickSignIn().isEnabled());
		login.setUserName("Jyoti");
		login.setUserPassword("asdfgh");
		login.clickSignin();
		Assert.assertTrue(login.invalidLoginPage().isDisplayed());
		login.dismissPopup();
		
	}
   
   @Test(priority = 5)
	public void testvalidLogin(){
	   //assertEquals(home.clickContactUs(),"Contact Us");
		Assert.assertTrue(home.clickSignIn().isEnabled());
		login.setUserName("JyotiRoy");
		login.setUserPassword("a12345678");
		login.clickSignin();
		Assert.assertTrue(basicinfo.displayBasicInfoPage().isEnabled());
		
	}
   @Test(priority=6)
   public void testLogoutButtonNavigatesToHomePage(){
	   login.clickLogout();
	   Assert.assertTrue(home.displayHomePage().isEnabled());
   }
  
  @Test(priority=7)
  public void testSubmitBasicInfoAndNavigateToEducationPage(){
	  //login
	  //save basic info and Screen navigation to Education page
	  Assert.assertTrue(home.clickSignIn().isEnabled());
	  login.setUserName("JyotiRoy");
	  login.setUserPassword("a12345678");
	  login.clickSignin();
	  Assert.assertTrue(basicinfo.displayBasicInfoPage().isEnabled());
	
	  //fill up Basic Info Page
	  basicinfo.typeFirstName("Jyoti Prokash");
	  basicinfo.typeLastName("Mondal");
	  basicinfo.typeFathersName("B Mondal");
	  basicinfo.typeMothersName("T Mondal");
	  basicinfo.typeDateOfBirth("1980-12-15");
	  basicinfo.selectGender("Male");
	  basicinfo.selectMaritalStatus("Single");
	  basicinfo.selectNationality("Bangladesh");
	  basicinfo.typeNationalId("1234567890");
	  basicinfo.typeReligion("Hinduism");
	  basicinfo.typePresentAddress("Dhaka");
	  basicinfo.typePermanentAddress("Khulna");
	  basicinfo.typeHomePhoneNumber("01917725782");
	  basicinfo.typeMobilePhoneNumber("01917234567");
	  basicinfo.typeAlternativeEmail("abc@yahoo.com");
	  basicinfo.selectIsEmployed("Yes","5000");//If anyone select Yes he/she can mention current salary or not. If anyone select No , no need to mention salary 
	  basicinfo.selectReceiveInfo("Mail");
	  basicinfo.selectScoutMail("Yes");
	  
	  //save basic info and Screen navigation
	  basicinfo.clickNextButtonBasicInfoDataSave();
	  //Dispaly Education page
	  Assert.assertTrue(educationinfo.displayEducationPage().isEnabled());
  }
  
  @Test(priority=8)
  public void testScreenNavigationBackToBasicInfoPageFromEducationPage(){
	  educationinfo.clickPreviousButton();
	  Assert.assertTrue(basicinfo.displayBasicInfoPage().isEnabled());
  }
  
  @Test(priority=9)
  public void testSubmitEducationInfoAndNavigateToTrainingPage(){
	  
  }
	
}
