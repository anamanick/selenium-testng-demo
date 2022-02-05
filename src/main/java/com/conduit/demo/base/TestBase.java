package com.conduit.demo.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.conduit.demo.utils.TestUtil;
import com.conduit.demo.utils.WebEventListener;


public class TestBase {

	//Static Variables
	public static WebDriver driver;
	public static Properties prop;
	public static EventFiringWebDriver e_driver;
	public static WebEventListener eventListener;

	//Load Property file
	public TestBase(){
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream(System.getProperty("user.dir")+ "/src/main/java/com/conduit/demo/config/config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	//set driver Object and Create driver Object for the browsers
	public static void initialization(){
		String browserName = prop.getProperty("browser");

		if(browserName.equals("chrome")){
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "/executables/chromedriver");	
			driver = new ChromeDriver(); 
		}
		
		else if(browserName.equals("firefox")){
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+ "/executables/geckodriver");	
			driver = new FirefoxDriver(); 
		}
		else if(browserName.equals("edge")){
			System.setProperty("webdriver.edge.driver", System.getProperty("user.dir")+ "/executables/msedgedriver");	
			driver = new EdgeDriver(); 
		}
		
		e_driver = new EventFiringWebDriver(driver);
		
		// Create object of EventListerHandler to register it with EventFiringWebDriver
		eventListener = new WebEventListener();
		e_driver.register(eventListener);
		driver = e_driver;
		
		//maximize the browser
		driver.manage().window().maximize();
		
		//delete cookies
		driver.manage().deleteAllCookies();
		
		//Wait for page tobe loaded
		//driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		
		//Implicit wait command
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		
		// Navigate to the specified URL
		driver.get(prop.getProperty("url"));

	}

}
