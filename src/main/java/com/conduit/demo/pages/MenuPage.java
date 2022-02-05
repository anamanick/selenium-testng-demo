package com.conduit.demo.pages;

import static org.testng.Assert.assertTrue;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.conduit.demo.base.TestBase;

public class MenuPage extends TestBase {

	// Home page constructor and web driver initialization
	public MenuPage() {
		PageFactory.initElements(driver, this);
	}

	// Find Web Element Sign in Button
	@FindBy(xpath = "//span[normalize-space()='Meals']")
	public WebElement filterMeals;
	
	// Find Web Element Sign in Button
	@FindBy(xpath = "//span[normalize-space()='Snacks']")
	public WebElement filterSnacks;
	
	// Find Web Element Sign in Button
	@FindBy(xpath = "//span[normalize-space()='Drinks']")
	public WebElement filterDrinks;	

	// Label Meals
	@FindBy(xpath = "//div[@id='MEALS']")
	public WebElement labelMeals;
		
	// Label Snacks
	@FindBy(css = "#snacks")
	public WebElement labelSnacks;
	
	// Find Web Element Sign in Button
	@FindBy(css = "#Drinks")
	public WebElement labelDrinks;

	// Click on Menu: mealMenuCH023
	@FindBy(xpath = "//div[@id='add-btn-CH023']//div[contains(@class,'pt__stepper icon-24-plus-white p-2 items-center plus-button w-12 h-12 flex justify-center')]")
	public WebElement mealMenuCH023;
	
	// Click on Menu: mealMenuCH023
	@FindBy(css = "div[id='add-btn-VN025'] img")
	public WebElement mealMenuVN025;
	
	// Meal: Sweet Potato Noodles
	@FindBy(xpath = "//div[@id='add-btn-CH023']")
	public WebElement buttonQuickAddSweetPotatoNoodlesCH023;
		
	// Protein Shake
	@FindBy(xpath = "//div[@id='add-btn-DR005']")
	public WebElement buttonQuickAddProteinShakeDR005;
	
	// Snakc: Protein Bites: Banana Bread
	@FindBy(xpath = "//div[@id='add-btn-SN023']")
	public WebElement buttonQuickAddSnackBananaBreadSN023;
	
	// Click on Menu: mealMenuVN025
	@FindBy(css = "#plp-quantifiers-container-VN025 > div:nth-child(3) > div")
	public WebElement increaseMenuVN025;

	// Find Web Element Sign in Button
	@FindBy(xpath = "//span[contains(@class,'plp-add-btn-add-min-amount')]")
	public WebElement buttonAddToCartDisable;

	// Find Web Element Sign in Button
	@FindBy(xpath = "//*[contains(text(),'Add to Cart')]")
	public WebElement buttonAddToCartEnable;

	// Find Web Element Sign in Button
	@FindBy(xpath = "//span[@id='plp-amount']")
	public WebElement addToCartAmount99Above;

	// Find Web Element Sign in Button
	@FindBy(xpath = "//span[@class='plp__amt-diff']")
	public WebElement addToCartAmount99Below;
		
	// Find Web Element Sign in Button
	@FindBy(xpath = "//div[@class='w-1/2 px-1 md:px-2 lg:w-1/3 lg:max-w-300']")
	public WebElement elementMealsTypeSeafood;
	
	// Cart Quantity
	@FindBy(xpath = "//span[@id='mb-total-items']")
	public WebElement cartQuantity;
	
	// Protein type
	@FindBy(xpath = "//button[@id='proteinType']")
	public WebElement filterProteinType;
	
	// Filter Type Seafood	
	@FindBy(css = "label[for='refinement-protein-type-3']")
	public WebElement filterTypeSeafood;
	
	
	//****************************************************************************************
	/*
	 * Progress Bar Elements
	 * 
	 */
	// Protein type
	@FindBy(xpath = "//span[@id='progressBar-meals']")
	public WebElement progressBarMeals;
	
	// Protein type
	@FindBy(xpath = "//span[@id='progressBar-snacks']")
	public WebElement progressBarSnacks;
	
	// Protein type
	@FindBy(xpath = "//span[@id='progressBar-drinks']")
	public WebElement progressBarDrinks;
	//****************************************************************************************
	
	// Click on Filter by Meal
	public void clickfilterMeals() {
		// Wait Statement
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.elementToBeClickable(filterMeals));
		filterMeals.click();

	}
	
	// Click on Filter by Snacks
	public void clickfilterSnacks() {
		filterSnacks.click();

	}
	
	// Click on Filter by Snacks
	public void clickfilterDrinks() {
		filterDrinks.click();
	}
	
	
	// ScrolletoTheview
	public void scrollTotheView() throws InterruptedException {
		// Wait Statement
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.elementToBeClickable(labelMeals));
						
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", labelMeals);
	}
	
	// ScrolletoTheview with element
	public void scrollTotheView(WebElement strElementName) throws InterruptedException {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", strElementName);
		Thread.sleep(2000);
	}

	// Add to cart Menu: CH023
	public void clickMealMenuCH023() {

		// Wait Statement
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.elementToBeClickable(mealMenuCH023));
		mealMenuCH023.click();

	}

	// Add to cart Menu: VN025
	public void clickMealMenuVN025() throws InterruptedException {
		Thread.sleep(3000);
		// Wait Statement
		// WebDriverWait wait =new WebDriverWait (driver, 15);
		// wait.until(ExpectedConditions.elementToBeClickable(mealMenuCH023));
		mealMenuVN025.click();

	}

	// Validate Minimum 99 Dollar or above Purchase
	public void validateUserMustOrder99DollarOrAbove() throws InterruptedException {
		Thread.sleep(2000);
		do {
			increaseMenuVN025.click();
			Thread.sleep(1000);
			System.out.println("INFO: Add To Cart is Clickable ? " + isAddToCartClickable());
			System.out.println("INFO: Add To Cart Total Amount ? " + fnReturnAddToCartButtonAmount());
			System.out.println("INFO: Add To Cart Cart Quantity ? " + fnReturnCartItemQuantity());
			
		} while (!addToCartAmount99Above.isDisplayed() && fnReturnAddToCartButtonAmount() <= 99);
		
		// Assertion
		assertTrue(addToCartAmount99Above.isEnabled(),"Add To Cart is Displayed; and It's enabled" + "");
	}

	// AddToCart Clickable
	public boolean isAddToCartClickable() {
		if (buttonAddToCartEnable.isDisplayed()) {
			return true;
		} else {
			return false;
		}
	}
	
	// Add To Cart Button Amount
	public int fnReturnAddToCartButtonAmount() {
		int myAmountInt = 0;
		if (addToCartAmount99Above.isDisplayed()) {
			System.out.println("addToCartAmount99Above : True");
			String strAmount99Above = addToCartAmount99Above.getText();
			double dblAmount99Above = Double.parseDouble(strAmount99Above);
			myAmountInt = (int) dblAmount99Above;
			return myAmountInt;

		} else if (addToCartAmount99Below.isDisplayed()) {
			System.out.println("addToCartAmount99Below : True");
			String strAmount99Below = addToCartAmount99Below.getText();
			double dblAmount99Below = Double.parseDouble(strAmount99Below);
			myAmountInt = (int) dblAmount99Below;
			return myAmountInt;
		} else {
			System.out.println("Could not determine Amount!");
			return myAmountInt;
		}
	}
	
	
	// Add To Cart Button Menu Quantity
	public int fnReturnCartItemQuantity() {
		int intCartQuantity = 0;
		//String strQuantity  = null;
		if (cartQuantity.isDisplayed()) {
			String strQuantity = cartQuantity.getText();
			Integer Quantity = Integer.parseInt(strQuantity);
			intCartQuantity = Quantity.intValue();
			return intCartQuantity; 
		} else {
			return intCartQuantity;
		}
	}
	
	
	// Count Available Seafood type
	public int fnCountAvailableMealTypeSeafood() {
		int xpathCountSeaFoodType = 0;		
		// Wait Statement
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.elementToBeClickable(labelMeals));	
		xpathCountSeaFoodType = driver.findElements(By.xpath("//div[@class='w-1/2 px-1 md:px-2 lg:w-1/3 lg:max-w-300']")).size();
		if(xpathCountSeaFoodType != 0) {
			return xpathCountSeaFoodType;
		} else {
			return xpathCountSeaFoodType;
		}
	}
	
	
	// Click on Protein Type
	public void clickFilterProteinType(){
		// Wait Statement
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.elementToBeClickable(filterProteinType));
		filterProteinType.click();
	}
	
	// Click on Protein Type
	public void clickFilterTypeSeafood(){
		// Wait Statement
		WebDriverWait wait = new WebDriverWait(driver, 2);
		wait.until(ExpectedConditions.elementToBeClickable(filterTypeSeafood));
		filterTypeSeafood.click();
	}
	
	// Add to cart menu : CH023
	public void fnQuickAddSweetPotatoNoodlesCH023() {
		buttonQuickAddSweetPotatoNoodlesCH023.click();
	}
	
	// Add to cart menu : RD005
	public void fnQuickAddProteinShakeDR005() {
		buttonQuickAddProteinShakeDR005.click();
	}
	
	// Add to cart menu : SN023
	public void fnQuickAddSnackBananaBreadSN023() {
		buttonQuickAddSnackBananaBreadSN023.click();
	}
	
	// ProgressBar Meal Count
	public int fnReturnProgressBarMealCount() {
		int intMealCount = 0;
		//String strQuantity  = null;
		if (progressBarMeals.isDisplayed()) {
			String strMealCount = progressBarMeals.getText();
			Integer mealCount = Integer.parseInt(strMealCount);
			intMealCount = mealCount.intValue();
			return intMealCount; 
		} else {
			return intMealCount;
		}
	}
	
	// ProgressBar Snacks Count
	public int fnReturnProgressBarSnacksCount() {
		int intSnacksCount = 0;
		//String strQuantity  = null;
		if (progressBarSnacks.isDisplayed()) {
			String strSnacksCount = progressBarSnacks.getText();
			Integer snacksCount = Integer.parseInt(strSnacksCount);
			intSnacksCount = snacksCount.intValue();
			return intSnacksCount;
		} else {
			return intSnacksCount;
		}
	}
	
	// ProgressBar Drink Count
	public int fnReturnProgressBarDrinksCount() {
		int intDrinksCount = 0;
		//String strQuantity  = null;
		if (progressBarDrinks.isDisplayed()) {
			String strDrinksCount = progressBarDrinks.getText();
			Integer drinksCount = Integer.parseInt(strDrinksCount);
			intDrinksCount = drinksCount.intValue();
			return intDrinksCount;
		} else {
			return intDrinksCount;
		}
	}
}

/*
 * *****************************************************************************
 * *****************************************************************************
 *
 * End Of The File
 *
 * *****************************************************************************
 * *****************************************************************************
 */
