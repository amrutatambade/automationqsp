package Assertion;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestOrangeHRM2 {
	
	
	@Test(priority = -1)
	public void launchTheBrowser()
	{
		Reporter.log("Launch the browser",true);
	}
	
	@Test(priority = 0)
	public void LaunchTheWebApp()
	{
		Reporter.log("Launch the web app",true);
	}
	
	@Test(priority = 1)
	public void verifyTheLoginPageTitle()
	{
		Reporter.log("verify the login page title",true);
		org.testng.asserts.SoftAssert sa1 = new org.testng.asserts.SoftAssert();
		sa1.assertEquals(true, true);
		sa1.assertAll();
	}
	
	@Test(priority = 2)
	public void validloginTest()
	{
		Reporter.log("Login To the application",true);
		Assert.assertEquals(false, true);
	
	}
	
	@Test(priority = 3)
	public void verifyHomePageTitle()
	{
		Reporter.log("verify Home Page Title",true);
		org.testng.asserts.SoftAssert sa2 = new org.testng.asserts.SoftAssert();
		sa2.assertEquals(true, true);
		sa2.assertAll();
	}

	
	@Test(priority = 4)
	public void addEmployee()
	{
		
		Reporter.log("Add the employee",true);
	}
}