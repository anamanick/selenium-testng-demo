package com.conduit.demo.testcases;
import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.conduit.demo.base.TestBase;
import com.conduit.demo.pages.HomePage;
import com.conduit.demo.pages.MenuPage;
import com.conduit.demo.pages.MyAccountPage;
import com.conduit.demo.pages.SignInPage;
import com.conduit.demo.pages.YourSettingsPage;

public class TestCase_002_Validate_Conduit_SignIn_Scenarios extends TestBase {

	// Declare reference variable
	HomePage homePage;
	MenuPage menuPage;
	SignInPage signInPage;
	MyAccountPage myAccountPage;
	YourSettingsPage yourSettingsPage;
	
	
	// Local test data
	String strValidEmail = prop.getProperty("validEmail");
	String strValidPassword = prop.getProperty("validPassword");
	String strInvalidEmail = prop.getProperty("invalidEmail");
	String strInvalidPassword = prop.getProperty("invalidPassword");


	//Refer parent class fields and objects
	public TestCase_002_Validate_Conduit_SignIn_Scenarios() {
		super();
	}

	/*
	 * 	**************************************************************************************
	 *  Tag name	: @BeforeClass
	 *  Description	: 	annotation will execute setup method to initialize driver and page 
	 *  				objects for every test method
	 *  **************************************************************************************
	 */
	
	@BeforeClass
	public void setUp() {
		
		// WebDriver Initialization, trigger the URL and Maximize the browser
		initialization();

		// Create Page objects
		homePage = new HomePage();
		menuPage = new MenuPage();
		signInPage = new SignInPage();
		myAccountPage = new MyAccountPage();
		yourSettingsPage = new YourSettingsPage();
	}

	/*	
	 * 	**************************************************************************************
	 * 	Test Name 	: Test to check the user can't add to cart unless he adds the minimum amount of 99$, by checking the button is disabled.
	 *  Author 		:  
	 *  Test Data 	: 
	 *  Tag Name	: @Test
	 *  **************************************************************************************
	 */

	@Test(priority = 1, enabled = true, description = "Test 002 : Validate user is Able to signin with Valide Username and Password")
	public void user_should_be_able_to_sign_with_valid_credentials() throws InterruptedException {

		// Wait Statement
		WebDriverWait wait =new WebDriverWait (driver, 15);
		//wait.until(ExpectedConditions.elementToBeClickable(homePage.linkHome));
		homePage.clicklinkSignIn();
		Thread.sleep(5000);
		signInPage.typeEmail(strValidEmail);
		signInPage.typePassword(strValidPassword);
		signInPage.clickSignInButton();
		wait.until(ExpectedConditions.elementToBeClickable(myAccountPage.linkUserAccount));
		assertEquals(myAccountPage.linkUserAccount.getText(), "autoqa");
		Thread.sleep(5000);
		homePage.clicklinkSettings();
		Thread.sleep(5000);
		
		
		
		yourSettingsPage.clicklinkSignOut();
		Thread.sleep(5000);
	}
	
	
	@Test(priority = 2, enabled = true, description = "Test 002 : Validate user is Able to signin with Valide Username and Password")
	public void user_should_not_be_able_to_sign_with_invalid_credentials() throws InterruptedException {

		// Wait Statement
		WebDriverWait wait =new WebDriverWait (driver, 15);
		//wait.until(ExpectedConditions.elementToBeClickable(homePage.linkHome));
		homePage.clicklinkSignIn();
		Thread.sleep(5000);
		signInPage.typeEmail(strInvalidEmail);
		signInPage.typePassword(strInvalidPassword);
//		signInPage.clickSignInButton();
//		wait.until(ExpectedConditions.elementToBeClickable(myAccountPage.linkUserAccount));
//		assertEquals(myAccountPage.linkUserAccount.getText(), "autoqa");
		Thread.sleep(5000);
	}
	
	
	
	/*
	 * 	**************************************************************************************
	 *  Tag name	: @AfterClass
	 *  Description	: 	annotation will execute tear down method to to quit the browser
	 *  				and clear the cookies for every test method
	 *  **************************************************************************************
	 */
	
	@AfterClass
	public void tearDown() {
		driver.close();
	}

}

	/*
	 *	****************************************************************************************
	 *
	 *							End Of The File
	 *
	 *	*****************************************************************************************
	 */
