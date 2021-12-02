package assignmentToAvoideDuplicates;



import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AviodeDuplicatesUsingHashSet{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("file:///F:/SeleniumSurajSir/MultiSelectDropdown.html");
		WebElement element=driver.findElement(By.id("menu"));
		Select sel=new Select(element);
		List<WebElement> optionOfDropDown = sel.getOptions();
		
		HashSet<String> set=new HashSet<String>();
		
		for(int i=0;i<optionOfDropDown.size();i++)
		{
			String txt = optionOfDropDown.get(i).getText();
			set.add(txt);
		}
		for(String amu:set)
		{
			System.out.println(amu);
			
		}
		
		
		
	}

}
