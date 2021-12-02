package webDriverMethods;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Navigate {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.navigate().to("https://www.google.com");
		driver.switchTo().activeElement().sendKeys("java",Keys.ENTER);;
		Thread.sleep(3000);
		
		Navigation nav=driver.navigate();
		nav.back();
		
		Thread.sleep(3000);
		nav.forward();
		
		Thread.sleep(3000);
		
		nav.refresh();
		driver.close();

	}

}
