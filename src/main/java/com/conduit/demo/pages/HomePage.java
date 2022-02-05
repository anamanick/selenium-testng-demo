package com.conduit.demo.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.conduit.demo.base.TestBase;

public class HomePage extends TestBase {

	//Home page constructor and web driver initialization
	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	//Find Web Element Sign in Button 
	@FindBy(xpath = "//a[contains(text(), 'Home')]")
	public WebElement linkHome;
	
	
	// Order Now Home page Link
	@FindBy(xpath = "//a[contains(text(), 'Sign in')]")
	public WebElement linkSignIn;
	
	
	// Order Now Home page Link
	@FindBy(xpath = "//*[contains(text(),'Settings')]//ancestor::a[@class='nav-link']")
	public WebElement linkSettings;
		
	
	// Click on Button Sign
	public void clickLinkHome() {
		linkHome.click();

	}
	
	// Click on Button Sign
	public void clicklinkSignIn() {
		linkSignIn.click();

	}
	
	// Click on Button Sign
	public void clicklinkSettings() {
		linkSettings.click();
		}

}

/*
 *	****************************************************************************************
 *
 *							End Of The File
 *
 *	******************************************************************************************
 */
