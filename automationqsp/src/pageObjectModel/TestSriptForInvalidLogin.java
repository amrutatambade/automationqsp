package pageObjectModel;

import java.io.IOException;

public class TestSriptForInvalidLogin extends BaseTest{

	public static void main(String[] args) throws IOException, InterruptedException {
		BaseTest bt=new BaseTest();
		bt.setUp();
		LoginPage lp=new LoginPage(driver);
		FlibPom flib=new FlibPom();
		
		int rc = flib.rowCount(EXCEL_PATH, "Invalidcreads");
		
		for(int i=1;i<=rc;i++) 
		{
		  String invalidusername = flib.readExcelData(EXCEL_PATH, "Invalidcreads", i, 0);
		  String invalidpassword = flib.readExcelData(EXCEL_PATH, "Invalidcreads", i, 1);
		  lp.invalidLoginActiTime(invalidusername, invalidpassword);
		}
		bt.tearDown();
	}

}
