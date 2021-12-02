package robotClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

		public static void main(String[] args) throws AWTException, InterruptedException {
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			driver.get("https://www.selenium.dev/");
			Thread.sleep(3000);
			WebElement target = driver.findElement(By.xpath("//h4[.='Selenium WebDriver']"));
			Actions act=new Actions(driver);
			act.contextClick(target).perform();
			
			Robot rob=new Robot();
			for(int i=0;i<=8;i++)
			{
				rob.keyPress(KeyEvent.VK_DOWN);
				rob.keyRelease(KeyEvent.VK_DOWN);
			}
			rob.keyPress(KeyEvent.VK_ENTER);
	}

}
