package com.conduit.demo.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.conduit.demo.base.TestBase;

public class SignInPage extends TestBase {
	
	//Home page constructor and web driver initialization
	public SignInPage() {
		PageFactory.initElements(driver, this);
	}

	//Find Web Element Sign in Button 
	@FindBy(xpath = "//input[@type='email']")
	public WebElement fieldEmail;
	
	// Order Now Home page Link
	@FindBy(xpath = "//input[@type='password']")
	public WebElement fieldPassword;
	
	
	// Order Now Home page Link
	@FindBy(xpath = "//button[contains(text(),'Sign in')]")
	public WebElement buttonSignIn;
	
	public void typeEmail(String email) {
		fieldEmail.sendKeys(email);
		System.out.println("My Email is : "+ email);
	}
	
	public void typePassword(String userPass) {
		fieldPassword.sendKeys(userPass);
		System.out.println("My password is : "+ userPass);
	}
	
	public void clickSignInButton() {
		buttonSignIn.click();
		
	}

}

/*
 *	****************************************************************************************
 *
 *							End Of The File
 *
 *	******************************************************************************************
 */
