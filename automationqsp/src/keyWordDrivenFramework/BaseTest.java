package keyWordDrivenFramework;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest implements IAutoConst {
	static WebDriver driver;
	public void setUp() throws IOException
	{
		Flib flib=new Flib();
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
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(ITO,TimeUnit.SECONDS);
			driver.get(url);
			}
	}
	public void tearDown()
		{
			driver.quit();
		}
	
	

}

