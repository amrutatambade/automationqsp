package xpathLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartFilters {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");                                                                                            
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("https://www.flipkart.com");
		Thread.sleep(8000);
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		Thread.sleep(7000);
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("laptop");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[text()='Core i5']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='Brand']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='_3879cV' and text()='HP']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='Operating System']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='Windows 10']")).click();
	}
	
		

}
