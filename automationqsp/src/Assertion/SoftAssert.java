package Assertion;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class SoftAssert {
	
	@Test
	public void a()
	{
		Reporter.log("Launch the browser",true);
		Reporter.log("launch the web application",true);
		Reporter.log("Verify the login page title",true);
		org.testng.asserts.SoftAssert softassert = new org.testng.asserts.SoftAssert();
		softassert.assertEquals(false, true);
		Reporter.log("login to the application",true);
		
		Reporter.log("verify the home page title",true);
		
		softassert.assertAll();
		
	}

}