package xpathLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAs5 {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[.='PIM']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@value='Add']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("amruta");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='middleName']")).sendKeys("mayur");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("tambade");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='employeeId']")).clear();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='employeeId']")).sendKeys("0234");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@value='Save']")).click();
		
		

	}

}
