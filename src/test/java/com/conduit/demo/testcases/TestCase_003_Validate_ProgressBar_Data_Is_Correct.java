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

public class TestCase_003_Validate_ProgressBar_Data_Is_Correct extends TestBase {

	// Declare reference variable
	HomePage homePage;
	MenuPage menuPage;

	//Refer parent class fields and objects
	public TestCase_003_Validate_ProgressBar_Data_Is_Correct() {
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
	 * 	Test Name 	: Test to check the filter "protein type" for example we should get two
	 * 				 	meals when we filter by protein type "Seafood"
	 *  Author 		: M.Rashid 
	 *  Test Data 	: 
	 *  Tag Name	: @Test
	 *  **************************************************************************************
	 */
	@Test(priority = 5, enabled = true, description = "Test to check the filter \"protein type\" for example we should get two meals when we filter by protein type \"Seafood\".")
	public void validate_protein_type_seafood_should_filter_two_meals() throws InterruptedException {
		// Wait Statement
		WebDriverWait wait =new WebDriverWait (driver, 15);
		//wait.until(ExpectedConditions.elementToBeClickable(homePage.linkMenu));
		//homePage.clickLinkMenu();
		menuPage.clickfilterMeals();
		Thread.sleep(2000);
		menuPage.scrollTotheView(menuPage.labelMeals);
		
		// Order 7 Meal
		menuPage.clickMealMenuVN025();
		for (int i = 0; i < 6; i++) {
			menuPage.increaseMenuVN025.click();
			Thread.sleep(1000);
		}
				
		//Click on Snacks
		Thread.sleep(1000);
		menuPage.clickfilterSnacks();
		
		// Scroll to Snacks | Order 1 Snakes
		Thread.sleep(2000);
		menuPage.scrollTotheView(menuPage.labelSnacks);
		Thread.sleep(1000);
		menuPage.fnQuickAddSnackBananaBreadSN023();
		
		// Click on Drinks | Order one Drink
		menuPage.clickfilterDrinks();
		Thread.sleep(2000);
		menuPage.scrollTotheView(menuPage.labelDrinks);
		Thread.sleep(1000);
		menuPage.fnQuickAddProteinShakeDR005();
		Thread.sleep(2000);
		
		//System.out.println("Progress Bar Meal Count ? : "+ menuPage.fnReturnProgressBarMealCount());
		//System.out.println("Progress Bar Meal Count ? : "+ menuPage.fnReturnProgressBarSnacksCount());
		//System.out.println("Progress Bar Meal Count ? : "+ menuPage.fnReturnProgressBarDrinksCount());
		
		// Retrieve Item Count
		int actualMealCount = menuPage.fnReturnProgressBarMealCount();
		int actualSnacksCount = menuPage.fnReturnProgressBarSnacksCount();
		int actualDrinksCount = menuPage.fnReturnProgressBarDrinksCount();
		
		// Assertion to Validate Progress Bar for meal, Snacks, and Drinks
		assertEquals(actualMealCount, 7);
		assertEquals(actualSnacksCount, 1);
		assertEquals(actualDrinksCount, 1);
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
