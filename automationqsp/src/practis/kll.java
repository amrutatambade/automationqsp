package practis;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class kll {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("file:///F:/SeleniumSurajSir/user.html");
		driver.findElement(By.id("un")).sendKeys("amruta");
		WebElement ele=driver.findElement(By.id("frid"));
		driver.switchTo().frame(ele);
		
		driver.findElement(By.id("pwd")).sendKeys("bandal");
		driver.switchTo().defaultContent();
		driver.findElement(By.id("un")).clear();
		
	}

}
