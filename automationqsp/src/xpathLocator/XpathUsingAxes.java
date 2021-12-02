package xpathLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathUsingAxes {
	public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();

	driver.get("https://www.flipkart.com/");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//button[text()='✕']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//div[@class='_3pLy-c row']/descendant::div[@class='_4rR01T']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//div[@class='_4rR01T']/ancestor::div[@class='_3pLy-c row']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//span[.='Men']/following-sibling::span[.='Women']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//span[.='Women']/preceding-sibling::span[.='Men']")).click();
}
}

