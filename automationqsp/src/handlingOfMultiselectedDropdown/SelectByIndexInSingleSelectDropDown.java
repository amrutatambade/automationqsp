package handlingOfMultiselectedDropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectByIndexInSingleSelectDropDown{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///F:/SeleniumSurajSir/SingleSelectDropdown.html");
		WebElement element=driver.findElement(By.id("menu"));
		Select sel=new Select(element);
		sel.selectByIndex(0);
		Thread.sleep(2000);
		
		
	}

}
