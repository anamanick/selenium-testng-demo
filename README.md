# Page Object model Test automation framework using Selenium WebDriver with Java, TestNG and Maven.
# Author	: Muhammad Rashid
# Date		: 28/10/2021

This is a sample robust and maintainable automation framework with page object model concept which is developed in Selenium WebDriver with java that can be used to  automate any web application.TestNG is used as test framework.

###IDE used:

- Eclipse

###WebDrivers:

Following WebDrivers can be used to run Test and can be found in projects/executables folder.
 
 - Chrome Driver (v95 or above)
 - Gecko Driver( FifeFox)
 - Edge Driver (v95 or above)

### Maven Dependencies:

- Selenium(Java)
- TestNG
- Maven surefire-plugin
- Apache commons-io

###Java Runtime Environment

- JRE 1.8 or above

###Test Prerequisite:

- Test data (URL, create UserName and Password) before signin on the Application.

- Test data (Successfully Signin) before Logout.

### Application Under test (AUT):

- https://www.mymusclechef.com/

### Test Cases:

* **TestCase_001_AddToCart_MinimunAmount_CartQuantity_CartPrice_Validation.**
 	
 &nbsp; &nbsp; &nbsp; &nbsp; 1. Write a test to check the user can't add to cart unless he adds the minimum amount of 99$, by checking the button is disabled.
 	
 	&nbsp; &nbsp; &nbsp; &nbsp; 2. Write a test to check the number of items in the "Add to Cart" button is correct
 	
 	&nbsp; &nbsp; &nbsp; &nbsp; 3. Write a test to check if the price is correct in the "Add to Cart" button

* **TestCase_002_Validate_Filter_Protein_Type_Seafood_Should_Filter_Two_Meals**
	
&nbsp; &nbsp; &nbsp; &nbsp; 4. Write a test to check if the data in the progress bar is correct, for example when we add 7 meals, one snack and one drink.

* **TestCase_003_Validate_ProgressBar_Data_Is_Correct**
	
&nbsp; &nbsp; &nbsp; &nbsp; 5. Write a test to check the filter "protein type" for example we should get two meals when we filter by protein type "Seafood".

### Test Data:

Test data ( URL, Browser name) are being passed from config.properties file which is located under src/main/java -> com.mymusclechef.demo.config

### Steps to Run The project:

- From Eclipse : Right click -> Run As -> Maven test

- From Eclipse	: Right click on TestNG.xml file -> Run As -> TestNG Suite

- From Command line : Navigate to the project directory from command line and run the following command: <ul> mvn clean test *OR* mvn clean test -DsuiteXMLFile=testng.xml<ul>









