package TestPackageActitime;

import java.io.IOException;

import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Flib;
import pagepackageforactitime.LoginPageActitime;

public class TestValid extends BaseTest{
	@Test
	public void validLogin() throws IOException
	{
		Flib flib = new Flib();
		String username = flib.readProperty(PROP_PATH, "usr");
		String password = flib.readProperty(PROP_PATH, "pass");
		LoginPageActitime lpa=new LoginPageActitime(driver);
		lpa.validLogin(username,password);
	}

}
