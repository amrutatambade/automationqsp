package webBasedPopups;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FileUploadPopup {
	public static void main(String[] args) throws InterruptedException, AWTException, IOException   {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
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
		WebElement target = driver.findElement(By.xpath("//input[@id='photofile']"));
		Actions upload = new Actions(driver);
		upload.doubleClick(target).perform();
		
		
		
		Runtime.getRuntime().exec("C:\\Users\\Admin\\git\\repository\\automationqsp\\autoit\\fileupload1.exe");
		

		
	}

}
