package pageObjectModel;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest implements IAutoConst {
	static WebDriver driver;
	public void setUp() throws IOException
	{
		FlibPom flib=new FlibPom();
		String browserValue = flib.readProperty(PROP_PATH,"browser");
		String url = flib.readProperty(PROP_PATH,"url");
		
		if(browserValue.equals("chrome"))
		{
			System.setProperty(CHROME_KEY,CHROME_VALUE);
		    driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(ITO,TimeUnit.SECONDS);
			driver.get(url);	
		}
		else if(browserValue.equals("firefox"))
		{
			System.setProperty(GECKO_KEY,GECKO_VALUE);
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(ITO,TimeUnit.SECONDS);
			driver.get(url);
			}
		else
		{
			System.out.println("invalid input");
		}
	}
	public void tearDown()
		{
			driver.quit();
		}
	
	

}

