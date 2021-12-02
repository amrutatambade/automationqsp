package frames;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BlueStoneAssign {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");                                                                                            
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.bluestone.com");
		
		WebElement frameElement = driver.findElement(By.xpath("//iframe[@allow='autoplay;']"));
		driver.switchTo().frame(frameElement);
		
		driver.findElement(By.xpath("//p[.='CHAT with our experts !']")).click();
		driver.findElement(By.id("name")).sendKeys("suraj");
		driver.findElement(By.id("email")).sendKeys("suraj@gmail.com");
		driver.findElement(By.xpath("//span[.='Phone:']/ancestor::label[contains(@id,'react')]/following-sibling::input")).sendKeys("3567567657");
	}

}
