package testscripts;

import java.awt.AWTException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import aboutcontentstructure.AboutContentStructureEnd;
import targetprofilestructure.AgeSelection;
import targetprofilestructure.BrandsDrinkHome;
import chatend.ChatProcessEnd;
import targetprofilestructure.ChuhiQuestionType;
import targetprofilestructure.DrinkTimeOftenChuhi;
import targetprofilestructure.DrinkTimesChuhiOutsideHome;
import drinkingscenestructure.DrinkingSceneStructureEnd;
import drinkingscenestructure.FirstQuestionDrinkingSceneStructure;
import aboutcontentstructure.FifthCommonQuestionPositiveNegativeFlow;
import aboutcontentstructure.FirstCommonQuestionPositiveNegativeFlow;
import aboutcontentstructure.FirstImpression;
import aboutcontentstructure.FirstQuestionPositiveFlow;
import aboutcontentstructure.FourthCommonQuestionPositiveNegativeFlow;
import targetprofilestructure.GenderSelection;
import homepage.HomePage;
import targetprofilestructure.HowMuchTimesDrinkHome;
import homepage.LaunchChatWindow;
import loginlogout.LogOutFromApp;
import aboutcontentstructure.SecondCommonQuestionPositiveNegativeFlow;
import drinkingscenestructure.SecondQuestionDrinkingSceneStructure;
import aboutcontentstructure.SecondQuestionPositiveFlow;
import aboutcontentstructure.SixthCommonQuestionPositiveNegativeFlow;
import icebreakstructure.StartChat;
import targetprofilestructure.TargetProfileStructureEnd;
import aboutcontentstructure.TasteAromaQuestion;
import aboutcontentstructure.ThirdCommonQuestionPositiveNegativeFlow;
import aboutcontentstructure.ThirdQuestionPositiveFlow;

/**
 * created by Jyoti 17/09/2019
 */

public class AllTestUserPanel extends TestBase 
   {
	HomePage home;
	//OpenChatWindow startChat;
	LaunchChatWindow chatWindowOpen;
	StartChat chatStart;
	AgeSelection ageSelect;
	GenderSelection genderSelect;
	ChuhiQuestionType chuhiQuestion;
	BrandsDrinkHome brandDrinkHome;
	HowMuchTimesDrinkHome drinksTimesHome;
	DrinkTimesChuhiOutsideHome drinksTimesOutsideHome;
	DrinkTimeOftenChuhi drinksTimesOftenChuhi;
	TargetProfileStructureEnd textVerifyTargetProfileStructureEnd;
	FirstImpression firstImpression;
	TasteAromaQuestion tasteAromaQuestion;
	FirstQuestionPositiveFlow firstQuestionPositiveFlow;
	SecondQuestionPositiveFlow secondQuestionPositiveFlow;
	ThirdQuestionPositiveFlow thirdQuestionPositiveFlow;
	FirstCommonQuestionPositiveNegativeFlow firstCommonQuestionPositiveNegativeFlow;
	SecondCommonQuestionPositiveNegativeFlow secondCommonQuestionPositiveNegativeFlow;
	ThirdCommonQuestionPositiveNegativeFlow thirdCommonQuestionPositiveNegativeFlow;
	FourthCommonQuestionPositiveNegativeFlow fourthCommonQuestionPositiveNegativeFlow;
	FifthCommonQuestionPositiveNegativeFlow fifthCommonQuestionPositiveNegativeFlow;
	SixthCommonQuestionPositiveNegativeFlow sixthCommonQuestionPositiveNegativeFlow;
	AboutContentStructureEnd textVerifyAboutContentStructureEnd;
	FirstQuestionDrinkingSceneStructure firstQuestionDrinkingSceneStructure;
	SecondQuestionDrinkingSceneStructure secondQuestionDrinkingSceneStructure;
	DrinkingSceneStructureEnd drinkingSceneStructureEnd;
	ChatProcessEnd chatProcessEnd;
	LogOutFromApp logOutFromApp;
	
	/*
	@Test(priority=0)
	public void verifyValidLogin() throws InterruptedException 
	  {
		// Call the method
		LoginToApp("user", "1234");
		waitForPageLoading(60);
		home=PageFactory.initElements(driver, HomePage.class);
		home.verificationSuccessfulLogin("ログアウト");	
	  }*/
	
	@Test(priority=0)
	public void verifyOpenChatWindow() throws InterruptedException, AWTException 
	  {
		// Call the method
		LoginToApplication("user", "1234");
		waitForPageLoading(60);
		home=PageFactory.initElements(driver, HomePage.class);
		home.verificationSuccessfulLogin("ログアウト");
		
		//Open chat window
		home.clickStartChatButton();
		Thread.sleep(3000);
		chatWindowOpen=PageFactory.initElements(driver, LaunchChatWindow.class);
		
		//Verify title of Chat Window
		chatWindowOpen.verificationChatWindowTitle("3Aプロジェクトボット");
		//waitForPageLoading(60);
		
		//Verify Click start button
		chatStart=PageFactory.initElements(driver, StartChat.class);
		chatStart.clickStartButtonChatWindow();
		Thread.sleep(3000);
		/*===============Start Target Profile structure===================*/
		//Verify age question text
		ageSelect=PageFactory.initElements(driver, AgeSelection.class);
		ageSelect.ageQuestionText("年令を教えてください。");
		
		//Age selection from slider . Select age between 20 and 80
		ageSelect.ageSelectionFromSlider(32);
		Thread.sleep(3000);
		
		//Age selection Send button
		ageSelect.clickSendButtonAgeSelection();
		Thread.sleep(2000);
		
		//Verify gender question text
		genderSelect=PageFactory.initElements(driver, GenderSelection.class);
		genderSelect.genderQuestionText("性別を教えてください。");
		
		//Gender selection test
		genderSelect.selectGender("female");
		
		//Gender selection Send button
		genderSelect.clickSendButtonGenderSelection();
		Thread.sleep(2000);
		
		//Verify chu_hi type question text
		chuhiQuestion=PageFactory.initElements(driver, ChuhiQuestionType.class);
		chuhiQuestion.chuHiQuestionText("普段、一番良くお飲みになる缶チューハイのタイプを教えてください。");
		
		//Select chu_hi can type item from drop down
		chuhiQuestion.selectItemDropDown("ローアルタイプ (3％以下)");
		Thread.sleep(2000);
		
		//Click Send button after selecting Chu_hi type
		chuhiQuestion.clickSendButtonAfterSelectingChuhiType();
		Thread.sleep(2000);
	
		//Verify brand drink at home question text
		brandDrinkHome=PageFactory.initElements(driver, BrandsDrinkHome.class);
		brandDrinkHome.brandDrinkHomeQuestionText("自宅で缶チューハイではどの銘柄をお飲みになりますか？");
		Thread.sleep(2000);
		
		//Verify select brand item for Home drink
		// Five available items are: (もぎたて, ウィルキンソン, 贅沢搾り, 淡麗辛口ハイボール, その他)
		brandDrinkHome.selectItemForHomeDrink("ウィルキンソン");
		Thread.sleep(2000);
		
		//Click Send button after selecting brand type
		brandDrinkHome.clickSendButtonSelectingBrandtype();
		Thread.sleep(2000);
		
		//Verify "How often do you drink at home?" question text 
		drinksTimesHome=PageFactory.initElements(driver, HowMuchTimesDrinkHome.class);
		drinksTimesHome.countDrinkTimesHome("自宅でどの位の頻度でお飲みになりますか？");
		
		//Verify drink times at home
		// Five available items are: (特に決めていない, 月に1~3回, 週に1~2回, 週に3~4回, 週に5回以上)
		drinksTimesHome.selectDrinkTimesHome("週に1~2回");
		Thread.sleep(2000);
				
		//Click Send button after selecting drink times
		drinksTimesHome.clickSendButtonSelectingDrinkTimes();
		Thread.sleep(2000);
		
		//Verify "Please tell me when you drink chu_hi outside of your home. How often do you drink?" question text 
		drinksTimesOutsideHome=PageFactory.initElements(driver, DrinkTimesChuhiOutsideHome.class);
		drinksTimesOutsideHome.countDrinkTimesChuhiOutsideHome("自宅以外でチューハイをお飲みになる時のことを教えてください。 どの位の頻度でお飲みになりますか？");
				
	    //Verify drink times outside home
		// Five available items are: 特に決めていない, 月に1~3回, 週に1~2回, 週に3~4回, 週に5回以上)
		drinksTimesOutsideHome.selectDrinkTimesChuhiOutsideHome("月に1~3回");
		Thread.sleep(2000);
						
	    //Click Send button after selecting drink times outside home
		drinksTimesOutsideHome.clickSendButtonSelectingDrinkTimesChuhiOutsideHome();
		Thread.sleep(2000);
		
		//Verify "When do you often drink it?" question text
		drinksTimesOftenChuhi=PageFactory.initElements(driver, DrinkTimeOftenChuhi.class);
		drinksTimesOftenChuhi.countDrinkTimesChuhiOutsideHomeQuestionText("それはどんな時にお飲みになることが多いですか？");
		Thread.sleep(2000);
		
		//Verify valid drink times chu_hi
		drinksTimesOftenChuhi.validDrinkTimeChuhi("11時ごろ");
		
		//Verify Send button after entering valid drink times chu_hi
		drinksTimesOftenChuhi.clickSendButtonAfterEnteringValidTimesForChuhi();
		Thread.sleep(4000);
		
		//Verify "I understand that! Thank you very much." text
		textVerifyTargetProfileStructureEnd=PageFactory.initElements(driver, TargetProfileStructureEnd.class);
		//textVerifyTargetProfileStructureEnd.verifyThanksMessageTextAfterEndingTargetProfileStructure("よくわかりました！ありがとうございます。");
		
		//Verify average response time message text
		textVerifyTargetProfileStructureEnd.verifyAverageResponseTimeMessageTextAfterEndingTargetProfileStructure();
		
		//Verify "I'll ask you about your impressions after taking a sample." question text
		textVerifyTargetProfileStructureEnd.verifySampleImpressionTextAfterEndingTargetProfileStructure("これからサンプルを飲んでいただき、印象についてお伺いします。");
		
		/*===============End Target Profile structure===================*/
		
		
		/*===============Start About Content structure===================*/
		
		//Verify First Impression "First of all, have a drink and tell us about your impressions." question text
		firstImpression=PageFactory.initElements(driver, FirstImpression.class);
		firstImpression.verifyFirstImpressionQuestionTextAboutContent("まずは、1口お飲みいただき、その印象について教えてください。");
		
		//First Impression ratings selection from slider . Select ratings between 1 and 10
		//firstImpression.firstImpressionRatingsSelectionFromSlider(8);
		firstImpression.firstImpressionRatingsSelectionFromSlider(1);
		Thread.sleep(3000);
				
	    //Verify Send button press after selecting ratings for first impression
		firstImpression.clickSendButtonFirstImpressionRatingsSelection();
	    Thread.sleep(3000);
	    
	    //Verify Taste or Aroma related question text
	    tasteAromaQuestion=PageFactory.initElements(driver, TasteAromaQuestion.class);
	    tasteAromaQuestion.verifyTasteAromaQuestionTextAboutContent("味や香りについて感じたことがあれば教えてください。");
	  }
	
	@Test(priority=1)
	public void verifyDeepdigFlow() throws InterruptedException
	  {
		 String flow="Positive";
		 String keyword="おいしい";
		 if(flow.equalsIgnoreCase("Positive"))
		 verifyDeepdigPositiveFlow(keyword);
		 else if(flow.equalsIgnoreCase("Negative"))
		 verifyDeepdigNegativeFlow(keyword);
	  }
	
	@Test(priority=2)
	public void verifyDrinkingSceneStructureQuestions() throws InterruptedException
	  {
		 /*Verify first question of Drinking scene structure: "When did you drink the chu-hi you just drank?" text after ending About Content structure
		  * お飲み頂いたチューハイは、どんな時に飲みましたか？
		  */
		 firstQuestionDrinkingSceneStructure=PageFactory.initElements(driver, FirstQuestionDrinkingSceneStructure.class);
		 firstQuestionDrinkingSceneStructure.verifyFirstDrinkingSceneQuestionTextAfterEndingAboutContentStructure("今お飲み頂いたチューハイは、どんな時に飲みましたか？");
		 
		 //Verify valid answer for first question of Drinking Scene Structure
		 firstQuestionDrinkingSceneStructure.validAnswerFirstDrinkingSceneQuestion("夜に");
		 
		 //Verify click send button after entering valid answer for first question of Drinking Scene Structure
		 firstQuestionDrinkingSceneStructure.clickSendButtonAfterEnteringAnswerFirstDrinkingSceneQuestion();
		 Thread.sleep(1000);
		 
		 /*Verify second question of Drinking scene structure: "When do you want to drink what you just drank?"
		  * 今お飲みになっていただいたものは、どんな時に飲みたいですか？
		  */
		 secondQuestionDrinkingSceneStructure=PageFactory.initElements(driver, SecondQuestionDrinkingSceneStructure.class);
		 secondQuestionDrinkingSceneStructure.verifySecondDrinkingSceneQuestionText("今お飲みになっていただいたものは、どんな時に飲みたいですか？");
		 
		 //Verify valid answer for second question of Drinking Scene Structure
		 secondQuestionDrinkingSceneStructure.validAnswerSecondDrinkingSceneQuestion("12時ごろ");
		 
		 //Verify click send button after entering valid answer for second question of Drinking Scene Structure
		 secondQuestionDrinkingSceneStructure.clickSendButtonAfterEnteringAnswerSecondDrinkingSceneQuestion();
		 Thread.sleep(3000); 
	  }
	
	@Test(priority=3)
	public void verifyDrinkingSceneStructureEnd() throws InterruptedException
	  {
		 //Verify average response time message text after ending Drinking Scene Structure
		 drinkingSceneStructureEnd=PageFactory.initElements(driver, DrinkingSceneStructureEnd.class);
		 drinkingSceneStructureEnd.verifyAverageResponseTimeMessageTextAfterEndingDrinkingSceneStructure();
		 Thread.sleep(2000);
		 
		 /*Verify "Thank you for your cooperation in the survey." text
		  *アンケートにご協力いただきありがとうございました。
		  */
		 drinkingSceneStructureEnd.verifyThanksMessageTextAfterEndingDrinkingSceneStructure("アンケートにご協力いただきありがとうございました。");
		 
		 /*Verify "Japanese is difficult." text
		  *日本語は難しいですね。
		  */
		 drinkingSceneStructureEnd.verifyJapaneseDifficultTextAfterEndingDrinkingSceneStructure("日本語は難しいですね。");
		 
		 /*Verify "I would like to do my best to develop more delicious products and study Japanese by referring to the opinions I have received." text
		  *頂いたご意見を参考に、もっとおいしい商品開発と日本語の勉強に全力で取り組んでいきたいと思います。
		  */
		 drinkingSceneStructureEnd.verifyThirdTextAfterEndingDrinkingSceneStructure("頂いたご意見を参考に、もっとおいしい商品開発と日本語の勉強に全力で取り組んでいきたいと思います。");
		 
	  }
	
	@Test(priority=4)
	public void verifyChatProcessEnd()
	   {
		  chatProcessEnd=PageFactory.initElements(driver, ChatProcessEnd.class);
		  chatProcessEnd.verifyClickNoButtonForChatEnd();
	   }
	
	@Test(priority=5)
	public void verifyLogoutFromChatBotApplication() throws InterruptedException
	   {
		   //Verify Logout from chat bot app
		   logOutFromApp=PageFactory.initElements(driver, LogOutFromApp.class);
		   logOutFromApp.verifyLogoutFromApp();
		   Thread.sleep(3000);
	   }
	
	private void verifyDeepdigPositiveFlow(String keyword) throws InterruptedException
	  {
		 //Verify enter first hierarchy keyword
		 tasteAromaQuestion.validFirstHierarchyKeyword("おいしい");
		 
		 //Verify click send button after entering valid first hierarchy keyword
		 tasteAromaQuestion.clickSendButtonAfterEnteringValidFirstHierarchyKeyword();
		 Thread.sleep(3000);
		 
		 /*Verify first question of positive flow: Can you tell me more about "keyword"
		  *"Keyword" についてもう少し詳しく教えてください。*/
		 firstQuestionPositiveFlow=PageFactory.initElements(driver, FirstQuestionPositiveFlow.class);
		 firstQuestionPositiveFlow.verifyFirstQuestionPositiveFlowOfAboutContent("おいしい","についてもう少し詳しく教えてください。");
		 
		 //Verify valid answer for first question of positive flow
		 firstQuestionPositiveFlow.validAnswerFirstQusetionOfPositiveFlow("うまい");
		 
		 //Verify click send button after entering valid answer for first question of positive flow
		 firstQuestionPositiveFlow.clickSendButtonAfterEnteringAnswerFirstQuestionPositiveFlow();
		 Thread.sleep(3000);
		 
		 /*Verify second question of positive flow: How is it "keyword" ?
		  *"Keyword" の程度はどうですか？*/
		 secondQuestionPositiveFlow=PageFactory.initElements(driver, SecondQuestionPositiveFlow.class);
		 secondQuestionPositiveFlow.verifySecondQuestionPositiveFlowOfAboutContent("おいしい","の程度はどうですか？");
		 
		 //Strength Impression ratings selection from slider . Select ratings between 1 and 10
		 secondQuestionPositiveFlow.strengthImpressionRatingsSelectionFromSlider(3);
		 Thread.sleep(3000);
					
		 //Verify Send button press after selecting ratings for strength impression
		 secondQuestionPositiveFlow.clickSendButtonStrengthImpressionRatingsSelection();
		 Thread.sleep(3000);
		 
		 /*Verify third question of positive flow: Do you feel anything other than "keyword"?
		  *その他に "keyword" 以外に何か感じることはありませんか？*/
		 thirdQuestionPositiveFlow=PageFactory.initElements(driver, ThirdQuestionPositiveFlow.class);
		 thirdQuestionPositiveFlow.verifyThirdQuestionPositiveFlowOfAboutContent("おいしい","その他に","以外に何か感じることはありませんか？");
		 
		 //Verify enter answer of third question of positive flow: Do you feel anything other than "keyword"?
		 thirdQuestionPositiveFlow.validAnswerThirdQuestionPositiveFlowOfAboutContent("いいえ");
		 
		 //Verify click send button after entering answer of third question of positive flow
		 thirdQuestionPositiveFlow.clickSendButtonAfterEnteringAnswerThirdQuestionPositiveFlow();
		 Thread.sleep(3000);
		 
		 verifyCommonFlowForPositiveNegativeFlow();
		 
	  }
	
	private void verifyDeepdigNegativeFlow(String keyword) throws InterruptedException
	  {
		 verifyCommonFlowForPositiveNegativeFlow();
	  }
	
	private void verifyCommonFlowForPositiveNegativeFlow() throws InterruptedException
	  {
		 /*Verify first part of first common question text: Then, please tell me about the impression of the second mouthful. 
		  *では２口目、飲んでいただき、その印象について教えてください。*/
		 firstCommonQuestionPositiveNegativeFlow=PageFactory.initElements(driver, FirstCommonQuestionPositiveNegativeFlow.class);
		 firstCommonQuestionPositiveNegativeFlow.verifyFirstTextFirstCommonQuestionPositiveNegativeFlowAboutContent("では２口目、飲んでいただき、その印象について教えてください。");
			
		 /*Verify second part of first common question text: If there is no change, please give the same answer as before. 
		  *変化なしの場合は先程と同様の回答お願いします。*/
		 firstCommonQuestionPositiveNegativeFlow.verifySecondTextFirstCommonQuestionPositiveNegativeFlowAboutContent("変化なしの場合は先程と同様の回答お願いします。");
		 
		 //Second Impression ratings selection from slider . Select ratings between 1 and 10
		 firstCommonQuestionPositiveNegativeFlow.secondImpressionRatingsSelectionFromSlider(5);
		 Thread.sleep(3000);
					
		 //Verify Send button press after selecting ratings for second impression
		 firstCommonQuestionPositiveNegativeFlow.clickSendButtonSecondImpressionRatingsSelection();
		 Thread.sleep(3000);
		 
		 /*Verify first part of second common question text: Then please drink about half and tell us about your impression. 
		  *では半分程度飲む進めていただき、その印象について教えてください*/
		 secondCommonQuestionPositiveNegativeFlow=PageFactory.initElements(driver, SecondCommonQuestionPositiveNegativeFlow.class);
		 secondCommonQuestionPositiveNegativeFlow.verifyFirstTextSecondCommonQuestionPositiveNegativeFlowAboutContent("では半分程度飲む進めていただき、その印象について教えてください。");
		 //Thread.sleep(2000);
			
		 /*Verify second part of second common question text: If there is no change, please give the same answer as before. 
		  *変化なしの場合は先程と同様の回答お願いします。*/
		 secondCommonQuestionPositiveNegativeFlow.verifySecondTextSecondCommonQuestionPositiveNegativeFlowAboutContent("変化なしの場合は先程と同様の回答お願いします。");
		 
		 //Half Bite Impression ratings selection from slider . Select ratings between 1 and 10
		 secondCommonQuestionPositiveNegativeFlow.halfBiteImpressionRatingsSelectionFromSlider(7);
		 Thread.sleep(3000);
					
		 //Verify Send button press after selecting ratings for half bite impression
		 secondCommonQuestionPositiveNegativeFlow.clickSendButtonHalfBiteImpressionRatingsSelection();
		 Thread.sleep(3000);
		 
		 /*Verify first part of third common question text: Please continue to drink until the end and tell us about the impression. 
		  *最後まで飲む進めていただき、その印象について教えてください。*/
		 thirdCommonQuestionPositiveNegativeFlow=PageFactory.initElements(driver, ThirdCommonQuestionPositiveNegativeFlow.class);
		 thirdCommonQuestionPositiveNegativeFlow.verifyFirstTextThirdCommonQuestionPositiveNegativeFlowAboutContent("最後まで飲む進めていただき、その印象について教えてください。");
		 
		 /*Verify second part of third common question text: If there is no change, please give the same answer as before. 
		  *変化なしの場合は先程と同様の回答お願いします。*/
		 thirdCommonQuestionPositiveNegativeFlow.verifySecondTextThirdCommonQuestionPositiveNegativeFlowAboutContent("変化なしの場合は先程と同様の回答お願いします。");
		 
		 //Full Bite Impression ratings selection from slider . Select ratings between 1 and 10
		 thirdCommonQuestionPositiveNegativeFlow.fullBiteImpressionRatingsSelectionFromSlider(9);
		 Thread.sleep(3000);
					
		 //Verify Send button press after selecting ratings for full bite impression
		 thirdCommonQuestionPositiveNegativeFlow.clickSendButtonFullBiteImpressionRatingsSelection();
		 Thread.sleep(3000);
		 
		 /*Verify fourth question of positive and negative flow: Please tell us what you felt about the taste and aroma, and if there are any changes in the impression.
		  *味や香りについて感じたことや、印象の変化があればその理由を教えてください。*/
		 fourthCommonQuestionPositiveNegativeFlow=PageFactory.initElements(driver, FourthCommonQuestionPositiveNegativeFlow.class);
		 fourthCommonQuestionPositiveNegativeFlow.verifyFourthCommonQuestionTextPositiveNegativeFlowAboutContent("味や香りについて感じたことや、印象の変化があればその理由を教えてください。");
		 
		 //Verify valid answer for fourth common question of positive and negative flow
		 fourthCommonQuestionPositiveNegativeFlow.validAnswerFourthQuestionPositiveNegativeFlowOfAboutContent("甘い");
		 
		 //Verify click send button after entering valid answer for fourth question of positive and negative flow
		 fourthCommonQuestionPositiveNegativeFlow.clickSendButtonAfterEnteringAnswerFourthQuestionPositiveNegativeFlow();
		 Thread.sleep(3000);
		 
		 /*Verify fifth common question text: Do you want to drink this drink again? 
		  *この飲料について、また飲みたいと思いますか？*/
		 fifthCommonQuestionPositiveNegativeFlow=PageFactory.initElements(driver, FifthCommonQuestionPositiveNegativeFlow.class);
		 fifthCommonQuestionPositiveNegativeFlow.verifyFifthCommonQuestionTextPositiveNegativeFlowAboutContent("この飲料について、また飲みたいと思いますか？");
		 
		 //Second time drink Impression ratings selection from slider . Select ratings between 1 and 10
		 fifthCommonQuestionPositiveNegativeFlow.secondTimeDrinkImpressionRatingsSelectionFromSlider(10);
		 Thread.sleep(3000);
					
		 //Verify Send button press after selecting ratings for second time drink impression
		 fifthCommonQuestionPositiveNegativeFlow.clickSendButtonSecondTimeDrinkImpressionRatingsSelection();
		 Thread.sleep(3000);
		 
		 /*Verify sixth question of positive and negative flow: Is there anything that you think will be even more delicious?
		  *こうしたらもっと美味しくなると思う点はありますか？*/
		 sixthCommonQuestionPositiveNegativeFlow=PageFactory.initElements(driver, SixthCommonQuestionPositiveNegativeFlow.class);
		 sixthCommonQuestionPositiveNegativeFlow.verifySixthCommonQuestionTextPositiveNegativeFlowAboutContent("こうしたらもっと美味しくなると思う点はありますか？");
		 
		 //Verify valid answer for sixth common question of positive and negative flow
		 sixthCommonQuestionPositiveNegativeFlow.validAnswerSixthQuestionPositiveNegativeFlowOfAboutContent("いいえ");
		 
		 //Verify click send button after entering valid answer for sixth question of positive and negative flow
		 sixthCommonQuestionPositiveNegativeFlow.clickSendButtonAfterEnteringAnswerSixthQuestionPositiveNegativeFlow();
		 Thread.sleep(3000);
		 
		 //Verify "Thank you very much." text after ending About Content structure
		 textVerifyAboutContentStructureEnd=PageFactory.initElements(driver, AboutContentStructureEnd.class);
		 textVerifyAboutContentStructureEnd.verifyThanksMessageTextAfterEndingAboutContentStructure("ありがとうございます。");
		 
		 //Verify average response time message text after ending About Content structure
		 textVerifyAboutContentStructureEnd.verifyAverageResponseTimeMessageTextAfterEndingAboutContentStructure();
		 Thread.sleep(2000);
		  
	  }
	 
	/*
	@Test(priority=3)
	public void verifyStartChat() throws InterruptedException
	  {
		LoginToApp("user", "1234");
		waitForPageLoading(60);
		home=PageFactory.initElements(driver, HomePage.class);
		home.verificationSuccessfulLogin("ログアウト");
		
		//Open chat window
		home.startChatButton.click();
	  }*/
   }
