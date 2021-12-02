package webDriverMethods;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.get("https://www.naukri.com/");
		Thread.sleep(3000);
		String parent=driver.getWindowHandle();
		String txt=driver.getTitle();
		
		Set<String> all=driver.getWindowHandles();
		for(String wh:all)
		{
			driver.switchTo().window(wh);
			String title=driver.getTitle();
			System.out.println(title);
			if(title.equalsIgnoreCase("cognizant"))
			{
				driver.manage().window().maximize();
			}
			else
			{
				
			}
			
		}
		
		
	
		}
		
		
		
		

	}
