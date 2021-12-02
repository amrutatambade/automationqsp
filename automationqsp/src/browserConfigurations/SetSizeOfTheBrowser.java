package browserConfigurations;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SetSizeOfTheBrowser {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");                                                                                            
		WebDriver driver = new FirefoxDriver();
		Thread.sleep(3000);
		Dimension targetSize = new Dimension(300,900);
		driver.manage().window().setSize(targetSize);
	}

}