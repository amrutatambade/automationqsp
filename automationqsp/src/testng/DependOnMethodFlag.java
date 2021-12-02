package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependOnMethodFlag {
	//priority flag
	@Test()
	public void login()
	{
		Reporter.log("login to the application",true);
	}
	
	@Test(dependsOnMethods = "login")
	public void action()
	{
		Reporter.log("Action !!!!",true);
	}
	
	@Test(dependsOnMethods = "action",priority  =3)
	public void logout()
	{
		Reporter.log("Logout from the application",true);
	}

}