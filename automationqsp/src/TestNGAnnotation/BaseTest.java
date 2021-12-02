package TestNGAnnotation;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseTest {
	WebDriver driver;
	
	@BeforeSuite
	public void appDescription()
	{
		Reporter.log("This application is employee time sheet tool used to maintain the data of employees and their activities",true);
	}
	
	@BeforeClass
	public void readDataFromDatabase()
	{
		Reporter.log("data is fetched from database",true);
	}
	
	
	@BeforeTest
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			
	}

	
	@BeforeMethod
	public void openBrowser() throws InterruptedException
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://msi/login.do");
		Thread.sleep(3000);
		
	}
	
	
	@AfterMethod
	public void closeBrowser()
	{
		driver.quit();
	}
	

	@AfterTest
	public void reports()
	{
		Reporter.log("Reports are generated ",true);
	}
}


