package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ldLocator {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");                                                                                            
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.id("txtUsername")).sendKeys("T6778");
		driver.findElement(By.id("txtPassword")).sendKeys("ttbh");
		driver.findElement(By.id("btnLogin")).click();
		
	}

}