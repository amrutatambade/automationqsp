package webBasedPopups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopups {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("F:/SeleniumSurajSir/alertPopup.html");
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[.='Try it']")).click();
		
		Alert al=driver.switchTo().alert();
		al.accept();
		
	}

}
