package optionsMethos;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetOptionsMethodForMultipleSelectDropdownUsingForloop {
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	driver.get("file:///F:/SeleniumSurajSir/MultiSelectDropdown.html");
	Thread.sleep(5000);
	WebElement dropdownElement=driver.findElement(By.id("menu"));
	Select sel=new Select(dropdownElement);
	List<WebElement> option = sel.getOptions();
	for(int i=0;i<option.size();i++)
		{
			String txt = option.get(i).getText();
			System.out.println(txt);
		}
		}

}
