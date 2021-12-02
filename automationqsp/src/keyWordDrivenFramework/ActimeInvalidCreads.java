package keyWordDrivenFramework;

import java.io.IOException;

import org.openqa.selenium.By;

public class ActimeInvalidCreads extends BaseTest{
	public static void main(String[] args) throws InterruptedException, IOException {
	
		BaseTest bt=new BaseTest();
		Flib flib = new Flib();
		bt.setUp();
		int rc = flib.rowCount(EXCEL_PATH, "Invalidcreads");
		for(int i=1;i<=rc;i++)
		{
		String username = flib.readExcelData(EXCEL_PATH, "Invalidcreads", i, 0);
		String password = flib.readExcelData(EXCEL_PATH, "Invalidcreads", i, 1);
		
		
		driver.findElement(By.name("username")).sendKeys(username);
	 	driver.findElement(By.name("pwd")).sendKeys(password);
	 	driver.findElement(By.id("loginButton")).click();
	 	//Thread.sleep(2000);
	 	driver.navigate().refresh();
	 	driver.findElement(By.name("username")).clear();
	 	//Thread.sleep(1000);

	}
		bt.tearDown();

}

}