package com.conduit.demo.utils;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Reporter;

import com.conduit.demo.base.TestBase;

public class TestUtil extends TestBase {

	//Page load timeout
	public static long PAGE_LOAD_TIMEOUT = 20;
	
	//Implicit Wait statement
	public static long IMPLICIT_WAIT = 20;

	//For Screenshot
	public static void takeScreenshotAtEndOfTest() throws IOException {
		// Local variables
		String screenshotPath = System.getProperty("user.dir")+"/screenshots/";
		String screenshotName = System.currentTimeMillis() + ".png";
		
		// take screenshots
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String currentDir = System.getProperty("user.dir");
		
		// store images
		FileUtils.copyFile(scrFile, new File(currentDir + "/screenshots/" + screenshotName));
		
		// attach failure screenshot for test.
		// in order to view the screenshot navigate to the "/target/surefire-reports/index.html" file and click on Reporter output link
		Reporter.log("<br><img src='"+ screenshotPath + "/"+ screenshotName + "' height='400' width='400'/><br>");
	}
}

	