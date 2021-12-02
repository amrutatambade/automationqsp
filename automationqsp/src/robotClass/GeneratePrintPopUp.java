package robotClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GeneratePrintPopUp {
	public static void main(String[] args) throws AWTException, InterruptedException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	driver.get("https://www.selenium.dev/");
	Thread.sleep(3000);
	
	Robot rob =new Robot();
	rob.keyPress(KeyEvent.VK_CONTROL);
	rob.keyPress(KeyEvent.VK_P);
	
	rob.keyRelease(KeyEvent.VK_P);
	rob.keyRelease(KeyEvent.VK_CONTROL);
	Thread.sleep(3000);
	
		rob.keyPress(KeyEvent.VK_TAB);
		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_TAB);
		rob.keyRelease(KeyEvent.VK_ENTER);
	
	//rob.keyPress(KeyEvent.VK_ENTER);
	//rob.keyRelease(KeyEvent.VK_ENTER);
	}
}
