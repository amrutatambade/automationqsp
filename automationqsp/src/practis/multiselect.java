package practis;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class multiselect {
	public static void main(String[] args) throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	driver.get("file:///F:/SeleniumSurajSir/MultiSelectDropdown.html");
	
	WebElement element=driver.findElement(By.id("menu"));
	
	Select s=new Select(element);
	
		List<WebElement> opn=s.getOptions();
		for(WebElement we:opn)
		{ 
			 String txt=we.getText();
			 System.out.println(txt);
			 
			 
			 
		}
	}
}

	
	
