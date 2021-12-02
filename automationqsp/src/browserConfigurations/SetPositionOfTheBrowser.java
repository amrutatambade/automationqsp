package browserConfigurations;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetPositionOfTheBrowser {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");                                                                                            
		WebDriver driver = new ChromeDriver();
		Thread.sleep(3000);
		Point targetPosition = new Point(90, 300);
		driver.manage().window().setPosition(targetPosition);
	
	}
}