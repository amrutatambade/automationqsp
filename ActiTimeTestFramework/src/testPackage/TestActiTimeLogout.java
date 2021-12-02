package testPackage;

import java.io.IOException;

import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Flib;
import pagepackage.HomePage;
import pagepackage.LoginPage;

public class TestActiTimeLogout extends BaseTest{
	
	
	
	@Test
	public void testActiTimeLogout() throws InterruptedException, IOException
	{
		Flib flib = new Flib();	
		LoginPage lp = new LoginPage(driver);
		HomePage hp = new HomePage(driver);
		lp.actiTimeValidLogin(flib.readProperty(PROP_PATH, "username"), flib.readProperty(PROP_PATH, "password"));
	
		hp.logoutActiTime();
		
		
	}

}