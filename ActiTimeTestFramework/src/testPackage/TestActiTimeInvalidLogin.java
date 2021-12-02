package testPackage;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Flib;
import pagepackage.LoginPage;


public class TestActiTimeInvalidLogin extends BaseTest {
	
	
	@Test
	public void actiTimeInvalidLogin() throws EncryptedDocumentException, IOException, InterruptedException
	{
		
		
		Flib flib = new Flib();
		LoginPage lp = new LoginPage(driver);
		int rc = flib.rowCount(EXCEL_PATH, "InvalidCreds");
		for(int i=1;i<=rc;i++)
		{
		String un = flib.readExcelData(EXCEL_PATH, "InvalidCreds", i, 0);
		String pwd = flib.readExcelData(EXCEL_PATH, "InvalidCreds", i, 1);
		lp.actiTimeInValidLogin(un, pwd);
		
		
		}
	}

}