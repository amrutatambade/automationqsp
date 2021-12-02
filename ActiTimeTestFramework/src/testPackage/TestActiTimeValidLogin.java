package testPackage;

import java.io.IOException;

import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Flib;
import pagepackage.LoginPage;

public class TestActiTimeValidLogin extends BaseTest {
	@Test
	public void testActitimeValidLogin() throws IOException
	{
		Flib flib=new Flib();
		String validUsername = flib.readProperty(PROP_PATH,"username");
		String validPassword = flib.readProperty(PROP_PATH, "password");
		LoginPage lp=new LoginPage(driver);
		lp.actiTimeValidLogin(validUsername, validPassword);
	}
	

}
