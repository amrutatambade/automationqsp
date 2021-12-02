package optionsMethos;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetAllSelectedOptionInMultiSelectDropdown {
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	driver.get("file:///F:/SeleniumSurajSir/MultiSelectDropdown.html");
	Thread.sleep(5000);
	WebElement dropdownElement=driver.findElement(By.id("menu"));
	Select sel=new Select(dropdownElement);
	for(int i=3;i<=5;i++)
	{
		sel.selectByIndex(i);
	}
	List<WebElement> alloptn = sel.getAllSelectedOptions();
	
	for(WebElement qs:alloptn)
	{
		String txt = qs.getText();
		System.out.println(txt);
	}
		}

}
