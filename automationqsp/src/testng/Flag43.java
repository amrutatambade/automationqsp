package testng;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag43 {
	
	@Test(priority = -1)
	public void login()
	{
		Reporter.log("login to the application",true);
	}
	
	@Test
	public void action()
	{
		Reporter.log("Action !!!!",true);
	}
	
	@Test
	public void logout()
	{
		Reporter.log("Logout from the application",true);
	}

}