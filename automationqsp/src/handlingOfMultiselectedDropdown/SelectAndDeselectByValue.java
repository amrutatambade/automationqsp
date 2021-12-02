package handlingOfMultiselectedDropdown;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectAndDeselectByValue {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("file:///C:/Users/Admin/Desktop/SeleniumSurajSir/MultiSelectDropdown.html");
		Thread.sleep(5000);
		WebElement dropdownElement=driver.findElement(By.id("menu"));
		Select sel=new Select(dropdownElement);
		sel.selectByValue("2");
		Thread.sleep(5000);
		sel.deselectByValue("2");
	}
		

}
