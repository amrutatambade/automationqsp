package frameworks;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeLogin {
	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.get("http://msi/login.do");
		
		FlibEx flib = new FlibEx();
		int rc = flib.rowCount("./data/TestData.xlsx", "Invalidcreads");
		for(int i=1;i<rc;i++)
		{
		String username = flib.readExcelData("./data/TestData.xlsx", "Invalidcreads", i, 0);
		String password = flib.readExcelData("./data/TestData.xlsx", "Invalidcreads", i, 1);
		
		
		driver.findElement(By.name("username")).sendKeys(username);
	 	driver.findElement(By.name("pwd")).sendKeys(password);
	 	driver.findElement(By.id("loginButton")).click();
	 	Thread.sleep(2000);
	 	driver.navigate().refresh();
	 	driver.findElement(By.name("username")).clear();
	 	Thread.sleep(1000);
	 	
		
		}
	}
}