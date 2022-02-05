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

public class TestCase_001_AddToCart_MinimunAmount_CartQuantity_CartPrice_Validation extends TestBase {

	// Declare reference variable
	HomePage homePage;
	MenuPage menuPage;


	//Refer parent class fields and objects
	public TestCase_001_AddToCart_MinimunAmount_CartQuantity_CartPrice_Validation() {
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
	 *  Author 		: M.Rashid 
	 *  Test Data 	: 
	 *  Tag Name	: @Test
	 *  **************************************************************************************
	 */

	@Test(priority = 1, enabled = true, description = "Test to Check the user can't add to cart unless he adds the minimum amount of 99$, by checking the button is disabled.")
	public void user_cannot_Add_to_Cart_unless_he_adds_the_minimum_amount_of_99_dollars() throws InterruptedException {

		// Wait Statement
		WebDriverWait wait =new WebDriverWait (driver, 15);
		//wait.until(ExpectedConditions.elementToBeClickable(homePage.linkMenu));
		//homePage.clickLinkMenu();
		menuPage.clickfilterMeals();
		menuPage.scrollTotheView(menuPage.labelMeals);
		menuPage.clickMealMenuVN025();
		
		// Validation
		menuPage.validateUserMustOrder99DollarOrAbove();
	}
	
	
	/*	
	 * 	**************************************************************************************
	 * 	Test Name 	: Test to check the number of items in the "Add to Cart" button is correct
	 *  Author 		: M.Rashid 
	 *  Test Data 	: 
	 *  Tag Name	: @Test
	 *  **************************************************************************************
	 */
	@Test(priority = 2, enabled = true, description = "Test to check the number of items in the \"Add to Cart\" button is correct")
	public void check_the_number_of_items_in_the_Add_to_Cart_button_is_correct() {
		
		// Retrieve Add to Cart Quantity
		int myQuantity = menuPage.fnReturnCartItemQuantity();
		
		// Validation
		assertEquals(myQuantity, 10);
	}
	
	
	/*	
	 * 	**************************************************************************************
	 * 	Test Name 	: Test to check if the price is correct in the "Add to Cart" button
	 *  Author 		: M.Rashid 
	 *  Test Data 	: 
	 *  Tag Name	: @Test
	 *  **************************************************************************************
	 */
	
	@Test(priority = 3, enabled = true, description = "Test to check if the price is correct in the \"Add to Cart\" button")
	public void check_if_the_price_is_correct_in_the_Add_to_Cart_button() {
		
		// Retrieve Total Cart Amount
		String strTotalCartAmount = menuPage.addToCartAmount99Above.getText();
		double dblTotalCartAmount = Double.parseDouble(strTotalCartAmount);
		
		// Validation
		// System.out.println("Test 3: dblTotalCartAmount "+ dblTotalCartAmount);
		assertEquals(dblTotalCartAmount, 99.5);
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
