package com.conduit.demo.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.conduit.demo.base.TestBase;

public class YourSettingsPage extends TestBase {

	//Home page constructor and web driver initialization
	public YourSettingsPage() {
		PageFactory.initElements(driver, this);
	}

	//Find Web Element Sign in Button 
	@FindBy(xpath = "//button[contains(text(),'Or click here to logout.')]")
	//@FindBy(xpath = "//button[@class='btn btn-outline-danger']")
	public WebElement linkSignOut;
	
	
	
	
	// Click on Button Sign
	public void clicklinkSignOut() {
		
		
		WebElement element = linkSignOut;
		Actions actions = new Actions(driver);
		actions.moveToElement(element);
		actions.perform();
		
		((JavascriptExecutor) driver)
	     .executeScript("window.scrollTo(0, document.body.scrollHeight)");
		
		//linkSignOut.click();
		//WebElement element = linkSignOut;
		//Actions actions = new Actions(driver);
		actions.moveToElement(element).click().build().perform();
	}

}

/*
 *	****************************************************************************************
 *
 *							End Of The File
 *
 *	******************************************************************************************
 */
