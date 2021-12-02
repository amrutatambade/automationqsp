package webBasedPopups;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileDownloadPopoup {
	public static void main(String[] args) throws InterruptedException, AWTException, IOException   {
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.Selenium.dev");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[.='Downloads']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[.='4.0.0']")).click();
		
		File f=new File("./automationqsp/autoit/download.exe");
		String abspath = f.getAbsolutePath();
		
		Runtime.getRuntime().exec(abspath);
		

		
	}

}
