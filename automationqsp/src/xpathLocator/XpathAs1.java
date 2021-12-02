package xpathLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAs1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("laptop");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='_3879cV' and text()='Core i3']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='_2gmUFU _3V8rao' and text()='Brand']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@title='MSI']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[text()='Operating System']")).click();
		
		
		

	}

}
