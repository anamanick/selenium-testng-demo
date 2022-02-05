package com.conduit.demo.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.conduit.demo.base.TestBase;

public class MyAccountPage extends TestBase {

	//Home page constructor and web driver initialization
	public MyAccountPage() {
		PageFactory.initElements(driver, this);
	}

	//Find Web Element Sign in Button 
	@FindBy(xpath = "//*[contains(text(),'autoqa')]")
	public WebElement linkUserAccount;
	
	

}

/*
 *	****************************************************************************************
 *
 *							End Of The File
 *
 *	******************************************************************************************
 */
