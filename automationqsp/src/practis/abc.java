package practis;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class abc {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("file:///F:/SeleniumSurajSir/SingleSelectDropdown.html");
	WebElement element=driver.findElement(By.id("menu"));
	
	Select s=new Select(element);
	
	for(int i=0;i<=5;i++)
	{
		s.selectByIndex(i);
	}
	List<WebElement> opn=s.getOptions();
	for(WebElement ws:opn)
	{
	 String txt=ws.getText();
	 System.out.println(txt);
	}
	}
}

