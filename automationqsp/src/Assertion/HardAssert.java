package Assertion;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class HardAssert {
	
	@Test
	public void a()
	{
		Reporter.log("Launch the browser",true);
		Reporter.log("launch the web application",true);
		Reporter.log("Verify the login page title",true);
		Assert.assertEquals(true, true);//Hard assert
		Reporter.log("login to the application",true);
		Assert.assertEquals(false, true);//hard assert
		Reporter.log("verify the home page title",true);
		
	}

}