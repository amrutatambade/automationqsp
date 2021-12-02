
package webBasedPopups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class BrowserNotificationPopup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--disable-notifications");
		co.addArguments("-start-maximized");
		WebDriver driver=new ChromeDriver(co);
		
		
		driver.get("https://optinmonster.com/what-is-a-popup-notification/");
		

	}
}
