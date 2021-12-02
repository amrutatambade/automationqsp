package abc;


import java.io.File;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ScreenShot {
	WebDriver driver;
	private Object OutputType;

	public static void main(String[] args)
	{
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	driver.get("https://www.google.com");
	}
	 
	public void getScreeshot(String filename)
	{
		TakesScreenshot ts=(TakesScreenshot)driver;
        File src = ts.getScreenshotAs(OutputType.FILE);
        File dest=new File("./ScreenShot"+filename+".png");
        Files.copy(src, dest);
		
	}
	
	

}
