package com.conduit.demo.testcases;
import static org.testng.Assert.assertEquals;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.conduit.demo.base.TestBase;
import com.conduit.demo.pages.HomePage;
import com.conduit.demo.pages.MenuPage;

public class TestCase_001_Validate_Conduit_Homepage extends TestBase {

	// Declare reference variable
	HomePage homePage;
	MenuPage menuPage;


	//Refer parent class fields and objects
	public TestCase_001_Validate_Conduit_Homepage() {
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
	}

	/*	
	 * 	**************************************************************************************
	 * 	Test Name 	: Test to check the user can't add to cart unless he adds the minimum amount of 99$, by checking the button is disabled.
	 *  Author 		:  
	 *  Test Data 	: 
	 *  Tag Name	: @Test
	 *  **************************************************************************************
	 */

	@Test(priority = 1, enabled = true, description = "Test to validate olivegarden homepage.")
	public void user_cannot_Add_to_Cart_unless_he_adds_the_minimum_amount_of_99_dollars() throws InterruptedException {

		// Wait Statement
		WebDriverWait wait =new WebDriverWait (driver, 15);
		wait.until(ExpectedConditions.elementToBeClickable(homePage.linkHome));
		homePage.clickLinkHome();
		Thread.sleep(5000);
		homePage.clicklinkSignIn();
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
