package com.conduit.demo.tutorials.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_01_Draft_Signin_Conduit_App {

	public static void main(String[] args) throws InterruptedException {
		
		// create a webdriver object
		WebDriver driver;
		
		// load chrome driver
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "/executables/chromedriver");
		
		// initialize chrome driver object as driver
		driver = new ChromeDriver();
		
		// maximize the browser
		driver.manage().window().maximize();
		
		// navigate the url
		driver.get("https://react-redux.realworld.io/");
		
		// click on sign in
		driver.findElement(By.xpath("//a[contains(text(), 'Sign in')]")).click();
		
		// wait statement
		Thread.sleep(5000);
		
		// enter email
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("autoqa@gmail.com");
		
		// enter password
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Test@123");
		
		// click on sign in
		driver.findElement(By.xpath("//button[contains(text(),'Sign in')]")).click();
		
		// wait statement
		Thread.sleep(5000);
		
		// close the driver session
		driver.close();
		
		// quit the driver session
		driver.quit();
	}

}
