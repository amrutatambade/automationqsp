package practis;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class window {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	driver.get("https://www.flipkart.com/");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//button[.='✕']")).click();
	driver.findElement(By.name("q")).sendKeys("samsung");
	driver.findElement(By.className("_34RNph")).click();
	
	driver.findElement(By.xpath("//div[.='SAMSUNG Galaxy F22 (Denim Blue, 128 GB)']")).click();
	String parenthandle=driver.getWindowHandle();
	Set<String> allHandle=driver.getWindowHandles();
	for(String wh:allHandle)
	{
		if(parenthandle.equals(wh))
		{
			
		}
		else
		{ 
			driver.switchTo().window(wh);
		}
		
	}
	driver.findElement(By.xpath("(//div[@class='_2C41yO'])[1]")).click();
	
	
	
	
}
}

