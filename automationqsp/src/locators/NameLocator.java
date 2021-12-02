package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NameLocator {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.findElement(By.name("email")).sendKeys("amrutabandal24@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.name("pass")).sendKeys("abc");
		Thread.sleep(1000);
		driver.findElement(By.name("login")).click();
		
	}

}
