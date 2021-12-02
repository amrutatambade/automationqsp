package practis;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ssd {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("file:///F:/SeleniumSurajSir/MultiSelectDropdown.html");
		WebElement ele=driver.findElement(By.id("menu"));
		
		Select s=new Select(ele);
		TreeSet<String> hs=new TreeSet<String>();
		List<WebElement> opn=s.getOptions();
		for(int i=0;i<opn.size();i++)
		{
			String txt=opn.get(i).getText();
			hs.add(txt);
		}
		for(String ws:hs)
		{
			System.out.println(ws);
		}
	}

}
