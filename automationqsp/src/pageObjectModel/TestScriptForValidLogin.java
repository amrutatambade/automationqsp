package pageObjectModel;

import java.io.IOException;

public class TestScriptForValidLogin extends BaseTest{
	public static void main(String[] args) throws IOException {
		BaseTest bt=new BaseTest();
		bt.setUp();
		LoginPage lp=new LoginPage(driver);
		FlibPom flib=new FlibPom();
		String validUsername = flib.readProperty(PROP_PATH, "username");
		String validpassword = flib.readProperty(PROP_PATH, "password");
		lp.validLoginActiTime(validUsername, validpassword);
		bt.tearDown();
		
		
		
	}

}
