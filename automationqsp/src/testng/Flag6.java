package testng;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag6 {
	//priority flag
	@Test()
	public void login()
	{
		int i=10/0;
		System.out.println(i);
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