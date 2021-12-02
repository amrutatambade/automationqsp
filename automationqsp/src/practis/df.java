package practis;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class df {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.bluestone.com/");
		
		WebElement frameElement = driver.findElement(By.xpath("//iframe[@allow='autoplay;']"));
		driver.switchTo().frame(frameElement);
		
		driver.findElement(By.xpath("//p[.='CHAT with our experts !']")).click();
		driver.findElement(By.id("name")).sendKeys("suraj");
		driver.findElement(By.id("email")).sendKeys("suraj@gmail.com");
		driver.findElement(By.xpath("//span[.='Phone:']/ancestor::label[contains(@id,'react')]/following-sibling::input")).sendKeys("3567567657");
	}
	
	}


