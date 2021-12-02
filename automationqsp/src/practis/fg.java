package practis;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fg {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("file:///F:/SeleniumSurajSir/disabledTextBox.html");
		WebElement ele=driver.findElement(By.id("txtUsername"));
		
		if(ele.isEnabled())
		{
			ele.sendKeys("amruta");
		}
		else
		{
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("document.getElementById('txtUsername').value='amu'");
		}
	}

}
