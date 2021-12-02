package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassNameLocator {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.switchTo().activeElement().sendKeys("Ross Geller",Keys.ENTER);
		driver.findElement(By.className("lNPNe")).click();
		Thread.sleep(1000);
		driver.findElement(By.className("lNPNe")).click();
		Thread.sleep(1000);
		driver.findElement(By.className("lNPNe")).click();
	}

}
