package Assertion;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class OrangeHRMLoginTestssertion {
    WebDriver driver;
	@Test
	public void testScenario() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com");
		String actualLoginPageTitle = driver.getTitle();
		SoftAssert softassert1 = new SoftAssert();
		softassert1.assertEquals(actualLoginPageTitle, "OrangeHRM");
		
		WebElement un = driver.findElement(By.id("txtUsername"));
		
		boolean statusOfUn = un.isDisplayed();
		Assert.assertEquals(statusOfUn, true);
		un.sendKeys("admin");
		
		WebElement pass = driver.findElement(By.id("txtPassword"));
		
		boolean statusOfPass =pass.isDisplayed();
		Assert.assertEquals(statusOfPass, true);
		pass.sendKeys("admin123");
		
		WebElement loginButton = driver.findElement(By.id("btnLogin"));
		
		boolean statusOfLoginButton =loginButton.isDisplayed();
		Assert.assertEquals(statusOfLoginButton, true);
		loginButton.click();
		Thread.sleep(3000);
		
		String actualHomePageTitle = driver.getTitle();
		softassert1.assertEquals(actualHomePageTitle, "OrangeHRM Dashboard");
		
		Reporter.log("Test settings feature",true);
		Reporter.log("Test create contact  feature",true);
		Reporter.log("Test add employee  feature",true);
		
		softassert1.assertAll();//to mark the test case as failed  if any softassert fails !
		
		
		
		
		
		
		
		
	}
	
}