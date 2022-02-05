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

public class TestCase_002_Validate_Filter_Protein_Type_Seafood_Should_Filter_Two_Meals extends TestBase {

	// Declare reference variable
	HomePage homePage;
	MenuPage menuPage;

	//Refer parent class fields and objects
	public TestCase_002_Validate_Filter_Protein_Type_Seafood_Should_Filter_Two_Meals() {
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
	 * 	Test Name 	: Test to check the filter "protein type" for example we should get two_
	 * 				 	meals when we filter by protein type "Seafood"
	 *  Author 		: M.Rashid 
	 *  Test Data 	: 
	 *  Tag Name	: @Test
	 *  **************************************************************************************
	 */
	@Test(priority = 4, enabled = true, description = "Test to check the filter \"protein type\" for example we should get two meals when we filter by protein type \"Seafood\".")
	public void validate_protein_type_seafood_should_filter_two_meals() throws InterruptedException {
		// Wait Statement
		WebDriverWait wait =new WebDriverWait (driver, 15);
		//wait.until(ExpectedConditions.elementToBeClickable(homePage.linkMenu));
		//homePage.clickLinkMenu();
		menuPage.clickfilterMeals();
		menuPage.scrollTotheView();
		Thread.sleep(1000);
		menuPage.clickFilterProteinType();
		menuPage.clickFilterTypeSeafood();
		Thread.sleep(1000);
		
		// Validation
		int intAvalableSeeFoodsMeal = menuPage.fnCountAvailableMealTypeSeafood();
		assertEquals(intAvalableSeeFoodsMeal, 2);	
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
		driver.quit();
	}

}

	/*
	 *	****************************************************************************************
	 *
	 *							End Of The File
	 *
	 *	*****************************************************************************************
	 */
